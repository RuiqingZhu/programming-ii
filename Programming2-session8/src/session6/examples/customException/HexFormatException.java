package session6.examples.customException;

/**
 * Define a custom exception called HexFormatException
 */
public class HexFormatException extends NumberFormatException{
    public HexFormatException(String hex){
        super("Invalid hex string" + hex);
    }
}
