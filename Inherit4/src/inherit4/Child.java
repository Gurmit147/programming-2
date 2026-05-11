
package inherit4;

public class Child extends Parent{
    int a = 10;

    void show() {
        System.out.println(super.a); // Parent variable
        System.out.println(a);       // Child variable
    }
}
