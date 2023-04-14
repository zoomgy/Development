package Lec1;

import java.util.Scanner;

public class StudentClient {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Student s = new Student("Ayush",18);
        // s.name = "Ayush";
        // s.age = 20;
        // s.IntroDuceYourself();
        // Student s1 = new Student();
        // s1.name = "DevRandiKa";
        // s1.age = 2;
        // s1.IntroDuceYourself();
        // s1.SayHey("Chutiya");
        // Student.Greeting();
        s.setAge(-1);
        s.setName("Gandu");
        System.out.println(s.getAge());
        System.out.println(s.getName());
    }
}
