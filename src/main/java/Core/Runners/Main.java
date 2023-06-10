package Core.Runners;

import Core.EnvVarsValidator;

public class Main {
    public static void main(String[] args) {
        try {
            var envVars = EnvVarsValidator.validateEnvVars();
            new AQARunner(envVars).run();
            System.out.println("[AQA] <<< THE END >>>");
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}