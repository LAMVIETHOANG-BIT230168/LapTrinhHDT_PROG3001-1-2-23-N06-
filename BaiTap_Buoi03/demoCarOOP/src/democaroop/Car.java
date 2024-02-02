package democaroop;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kduyvu
 */
public class Car {
    // attribute
    public String brand;
    public String color;
    public int year;
    private double price;
    public int mount;
    
    public void setPrice(double _price){
        this.price = _price;
    }
    
    public double getPrice(){
        return price;
    }
    // ham constructor default
    public Car(){
        
    }
    
    public Car(String _brand, String _color, int _year, 
            double _price, int _mount){
        this.brand = _brand;
        this.color = _color;
        this.price = _price;
        this.year = _year;
        this.mount = _mount;
    }
 
    public Car(String _brand, String _color){
        this.brand = _brand;
        this.color = _color;
    }
    // method
    public void running(){
        System.out.println(" Ô tô " + brand + " có màu " + color + " đang chạy");
    }
    
    public void stopping(){
        
    }
    public void speeding(){
        
    }
    
    public double calculatePrice(double price, int amount){
        return price*amount;
    }

}
