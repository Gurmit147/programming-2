
package inherit;

public class Inherit {

    public static void main(String[] args) {
        Child obj = new Child();

        System.out.println(obj.a); 
        System.out.println(obj.b); 
        System.out.println(obj.c); 

        obj.display(); 
        obj.show();    
        obj.print();   
    }
    
}
