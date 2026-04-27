/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university2;


public class Student {
    String name;
    int age, matric;
    
    public Student(String name, int matric, int age){
        this.name = name;
        this.age = age;
        this.matric = matric;
        
        System.out.println("Name: " + name);
        System.out.println("Matric: " + matric);
        System.out.println("Age: " + age);
        System.out.println();
    
    }
    
}
