package day6;

public class JDBCDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        System.out.println("Driver loaded successfully");
    }
}
