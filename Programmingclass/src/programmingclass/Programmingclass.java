/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programmingclass;

public class Programmingclass {

    public static void main(String[] args) {
        Studentarray std[] = new Studentarray[3];

        std[0] = new Studentarray("Gurmit",21);
        std[1] = new Studentarray("Mong",22);
        std[2] = new Studentarray("Kok Lun",23);

        for(int i=0; i< std.length; i++){
            System.out.println("Name:" + std[i].name + " Age:" + std[i].age);
        }

    }
    
}
