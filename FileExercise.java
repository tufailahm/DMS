package day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileExercise {
    public void file1() throws IOException {
        File f1 = new File("h:\\Batch\\BatchMates.txt");
        File f2 = new File("h:\\Batch");
        if(f2.exists() && f2.isDirectory()){
            System.out.println("Folder batch already exists");
        }
        else {
            f2.mkdir();
            System.out.println("Successfully created the folder -Batch");
        }
        System.out.println("Creating BatchMates.txt inside "+f2.getAbsolutePath());
        f1.createNewFile();
    }
    public void file2() throws IOException {
        File f1 = new File("h:\\Batch\\BatchMates.txt");
        File f2 = new File("h:\\Batch");
        if(f2.exists() && f2.isDirectory()){
            System.out.println("Folder batch already exists");
        }
        else {
            f2.mkdir();
            System.out.println("Successfully created the folder -Batch");
        }
        System.out.println("Creating BatchMates.txt inside "+f2.getAbsolutePath());
        f1.createNewFile();
    }
    public void callMethods() throws IOException {
        FileExercise fileExercise = new FileExercise();
        fileExercise.file1();
        fileExercise.file2();
    }
    public static void main(String[] args)  {
        FileExercise fileExercise = new FileExercise();
        try {
            fileExercise.callMethods();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //try with resources
        //Support for try-with-resources — introduced in Java 7 —
        // allows us to declare resources to be used in a try block with the assurance that the
        // resources will be closed after the execution of that block.
        try (Scanner scanner = new Scanner(new File("test.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }

        //no need to close scanner

    }
}
