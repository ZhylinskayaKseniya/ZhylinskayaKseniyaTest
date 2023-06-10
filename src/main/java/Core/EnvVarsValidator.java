package Core;

import Core.Enums.ConfigTypes;
import Core.Exceptions.BasePropException;
import Core.Exceptions.EmptyPropException;
import Core.Exceptions.IncorrectPropException;

import java.util.Arrays;
import java.util.HashMap;

public class EnvVarsValidator {

    public static HashMap<String, String> validateEnvVars() throws BasePropException {
        var envVars = new HashMap<String, String>();
        try {
            var envProp = ConfigTypes.valueOf(System.getProperty("env"));
            envVars.put("env", envProp.name());
        } catch (IllegalArgumentException iae) {
            throw new IncorrectPropException("env", Arrays.toString(ConfigTypes.values()));
        } catch (NullPointerException npe) {
            throw new EmptyPropException("env");
        }
        return envVars;
    }
}
