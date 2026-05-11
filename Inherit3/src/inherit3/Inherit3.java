
package inherit3;

public class Inherit3 {

    
    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.b);
        c.print();
        
        Parent p = new Parent();
        
        System.out.println(p.a); //error
        p.display();//error
    }
    
}
