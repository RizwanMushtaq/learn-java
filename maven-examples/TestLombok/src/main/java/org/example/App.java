package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Student student = new Student();
        student.setName("Rizwan");
        student.setAge(25);
        student.setGrade("A");

        System.out.println(student);
    }
}
