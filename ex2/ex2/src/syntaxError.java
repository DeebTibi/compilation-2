public class syntaxError extends IllegalStateException{
    public syntaxError(String errorMessage) {
        super(errorMessage);
    }
}