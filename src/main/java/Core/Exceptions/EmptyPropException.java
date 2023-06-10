package Core.Exceptions;

public class EmptyPropException extends BasePropException{
    public EmptyPropException(String propKey) {
        super(String.format("Env variable [%s] not present.\nPlease, verify build params before running scripts", propKey));
    }
}
