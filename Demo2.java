package day6;

public class Demo2 {

    public void display() {
        try {
            int marks[] = new int[3];              //NegativeArrayException
            System.out.println(marks[2]);      //ArrayIndexOutOfBoundsException
            System.out.println(1/0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array cannot be accessed beyond its size");
        }
        catch (NegativeArraySizeException e) {
            System.out.println("Array Cannot be negative");
        }
        catch (ArithmeticException e ){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Some error occurred");
        }
        finally {
            System.out.println("closing operation");
        }
        System.out.println("Method completed");
    }
    public static void main(String[] args) {

        Demo2 d = new Demo2();
        d.display();

        System.out.println("Thanks for using my program");
    }
}
