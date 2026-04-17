
package cardealership;


class Car {
    
    String brand;
    String color;
    String type;
    
    public void showdetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Vehicle Type: " + type);
        System.out.println();
    }
    
    public void showname(String name){
        System.out.println(name);
    }
    
   Car(){
        System.out.println("Hi");
    }
    
   
}

