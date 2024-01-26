/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptrinhoopdemo;

/**
 *
 * @author admin
 */
public class Dog {
    //thuộc tính
    public int age;
    public String name;
    public String type;
    public String color;
    // ham constructor
    Dog(){
        
    }
    Dog(int _age, String _name, String _type, String _color){
        this.age =_age;
        this.name= _name;
        this.color =_color;
        this.type= _type;
    }
    // hành vi 
    public void running(){
        System.out.print("cho "+ type +" "+ name +"tuoi "+ age +" mau "+ color + "dang chay ");
    }
    public void breaking(){
        
    }
}
