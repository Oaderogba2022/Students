package ie.atu;
import java.io.File;
import java.util.Scanner;
import.java.io.*;

public class StudentApp extends Student {

    public static void main(String[] args) {

        
        System.out.println("Please enter your name: ");
        Scanner name =new Scanner(System.in);
        String name = name.toString();
        Student info1 = new Student();
        System.out.println("You entered: " + info1.getName());
        info1.setName();

        System.out.println("Please enter your id number: ");
        Scanner number = new Scanner(System.in);
        int Number = number.nextInt();
        Student info2 = new Student();
        System.out.println("You entered: " + info2.getNumber());
        info2.setNumber();


        System.out.println("Please enter Student age");
        Scanner age = new Scanner(System.in);
        int age = age.nextInt();
        Student info3 = new Student();
        System.out.println("You entered: " + info3.getAge());
        info3.setAge();


        System.out.println("Please enter Address: ");
        Scanner adddress = new Scanner(System.in);
        String address =  adddress.toString();
        Student info4 = new Student();
        System.out.println("You entered: " + info4.getAddress());
        info4.setAddress();





    }
}
