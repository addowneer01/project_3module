package data.model.exception;

public class nullCartException extends RuntimeException{
    public nullCartException(){
        super("Cart is empty!");
    }
}
