/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package university;

public class University {

    
   public static void main(String[] args) {
        
        Student student1 = new Student();
        Student student2 = new Student(); 
        Student student3 = new Student();
              
        student1.name = "Gurmit";
        student1.matric = 303766;
        student1.age = 22;
        
        student2.name = "Ali";
        student2.matric = 1234;
        student2.age = 21;
        
        student3.name = "Chen";
        student3.matric = 5678;
        student3.age = 23;
                
        student1.showdetails();
        student2.showdetails();
        student3.showdetails();
        
        
    }

    
}
