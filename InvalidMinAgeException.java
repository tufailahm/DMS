package day6;

public class InvalidMinAgeException extends RuntimeException{
       public  InvalidMinAgeException(){

        }
    public  InvalidMinAgeException(String message){
        super(message);
    }
}
