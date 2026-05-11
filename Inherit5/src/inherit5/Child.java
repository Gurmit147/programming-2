
package inherit5;

import inherit5.newpackage.Parent;

public class Child extends Parent{
    void show() {

        System.out.println(a); // protected variable
        display();             // protected method
    }
}
