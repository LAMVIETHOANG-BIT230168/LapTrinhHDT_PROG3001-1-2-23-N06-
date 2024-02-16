/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object_class;

/**
 *
 * @author Admin
 */
public class Hinhchunhat {
    private float dai;
    private float rong;
    
public void setdai(Float _dai){
    this.dai = _dai;
}
public Float getdai(){
    return this.dai;
}
public void setrong(Float _rong){
    this.rong=_rong;
}
public Float getrong(){
    return this.rong;
}
public Hinhchunhat(){
    
}
public Hinhchunhat(Float _dai,Float _rong){
    this.dai=_dai;
    this.rong=_rong;
}
public float tinhchuvi(){
    return (dai+rong)*2;
}
public float tinhdientich(){
    return dai*rong;
}
public String toString(){
    return "Chieu dai: "+dai+"\nChieu rong: "+rong+"\nChu vi: "+tinhchuvi()+"\nDien tich: "+tinhdientich();
    
}
}
   
