/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package workshop;

public class Workshop {

    public static void main(String[] args) {
        Cararray car[] = new Cararray[3];

        car[0] = new Cararray("Proton", "Red", "Sedan");
        car[1] = new Cararray("Perodua", "Blue", "Sedan");
        car[2] = new Cararray("BMW", "Black", "SUV");

        for(int i=0; i< car.length; i++){
            System.out.println("Car brand:" + car[i].brand);
            System.out.println("Car color:" + car[i].color );
            System.out.println("Car type:" + car[i].type);
            System.out.println();

        }

    }
    
}
