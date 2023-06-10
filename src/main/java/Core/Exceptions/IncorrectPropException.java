package Core.Exceptions;

import java.util.Arrays;

public class IncorrectPropException extends BasePropException{
    public IncorrectPropException(String propKey, String... correctValues) {
        super(String.format("Incorrect value of [%s] env variable.\nValue should be one of the following %s", propKey, Arrays.toString(correctValues)));
    }
}
