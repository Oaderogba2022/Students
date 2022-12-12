package ie.atu;
import java.io.*;
import java.util.Scanner;

public class StudentApp extends Student {

    public static void main(String[] args) {

        
        System.out.println("Please enter your name: ");
        Scanner info1 =new Scanner(System.in);
        String name = info1.toString();
        Student info1 = new Student();
        System.out.println("You entered: " + info1.getName());
        info1.setName();

        System.out.println("Please enter your id number: ");
        Scanner info2 = new Scanner(System.in);
        int Number = info2.nextInt();
        Student info2 = new Student();
        System.out.println("You entered: " + info2.getNumber());
        info2.setNumber();


        System.out.println("Please enter Student age");
        Scanner info3 = new Scanner(System.in);
        int age = info3.nextInt();
        Student info3 = new Student();
        System.out.println("You entered: " + info3.getAge());
        info3.setAge();


        System.out.println("Please enter Address: ");
        Scanner info4 = new Scanner(System.in);
        String address =  info4.toString();
        Student info4 = new Student();
        System.out.println("You entered: " + info4.getAddress());
        info4.setAddress();

        //Prompt user for filename
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a filename: ");
        String filename = keyboard.nextLine();
        Scanner inputFile = new Scanner(new File(filename));






    }
}
