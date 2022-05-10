package day6;

public class Demo1 {

    public static void main(String[] args) {
        String name = "Mohammad";
        try {
            System.out.println(name.length());      //NullpointerException
        }
        catch(Exception e){
            System.out.println("Some problem occurred");
        }
        //not end here
        System.out.println("Thanks for using my program");
    }
}
