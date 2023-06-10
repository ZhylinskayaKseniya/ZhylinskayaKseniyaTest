package Core.Runners;

import Core.ConfigModules.Config;
import Core.DriverConfigurator;
import Core.Listeners.TestNGExecutionListener;
import org.testng.TestNG;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.util.HashMap;
import java.util.List;

public class AQARunner {
    private final TestNG testNg;
    private final HashMap<String, String> envVars;

    public AQARunner(HashMap<String, String> envVars) {
        this.envVars = envVars;
        Config launchConfig = loadConfig();
        testNg = new TestNG();
        var suite = System.getProperty("suite", "smoke");
        testNg.setTestSuites(List.of(System.getProperty("user.dir").concat("/config/").concat(suite).concat(".xml")));
        testNg.addListener(new TestNGExecutionListener());
        testNg.setOutputDirectory("target/test-results");
        testNg.setVerbose(3);
        DriverConfigurator.configureSelenide(launchConfig.getDriverDetails());
    }

    private Config loadConfig() {
        String path = "/dev_config.yaml";
        Yaml yaml = new Yaml(new Constructor(Config.class));
        var inputStream = getClass().getResourceAsStream(path);
        return yaml.load(inputStream);
    }

    public void run() {
        this.testNg.run();
    }
}
