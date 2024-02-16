/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package democaroop;

/**
 *
 * @author kduyvu
 */
public class DemoCarOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // khoi tao doi tuong
        Car myCar = new Car();
        
        // set attribute
        myCar.brand = "toyota";
        myCar.color = "red";
      ///  myCar.price = 10000;
        
        myCar.setPrice(30000);
      
        myCar.year = 2020;
        myCar.mount = 5;
        
        // call method
        myCar.running();
        double total = myCar.calculatePrice(myCar.getPrice() , myCar.mount);
        System.out.println(" Giá lô ô tô : " + total);
    }
    
}
