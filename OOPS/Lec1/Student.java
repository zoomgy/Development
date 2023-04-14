package Lec1;

public class Student{
    private String name = "Ramesh";
    private int age = 11;

    public Student(String name , int age){
        this.age = age;
        this.name = name;
    }

    public void IntroDuceYourself(){
        System.out.println("My name is "+ name + " and my age is "+ age);
    }

    public void SayHey(String name){
        System.out.println(name + " said hey to " + this.name);
    }

    public static void Greeting(){
        System.out.println("Hello Motherfucker.");
    }

    public void setAge(int age) throws Exception{
        if(age<0){
            throw new Exception("Maa ki chut teri bhosdike teri behen ka lund");
        }
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}