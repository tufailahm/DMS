package day6;

public class InvalidMaxAgeException extends RuntimeException{
    public InvalidMaxAgeException(){

    }
    public InvalidMaxAgeException(String message){
            super(message);
    }
}
