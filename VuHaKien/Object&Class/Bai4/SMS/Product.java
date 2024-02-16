package sms;
import java.util.Date;

public class Product {
    public String code;
    public String name;
    public Date date;
    public double price;
    public double promotions;
    public int stock;
    Product(){
        
    }
    Product(String _code,String _name,Date _date,double _price,double _promotions,int _stock){
        this.code=_code;
        this.name=_name;
        this.date=_date;
        this.price=_price;
        this.promotions=_promotions;
        this.stock=_stock;
    }
    public void Inthongtin(){
        System.out.println("Ma so san pham: "+code);
        System.out.println("Ten san pham: "+name);
        System.out.println("Ngay nhap: "+date);
        System.out.println("Gia ban: "+price);
        System.out.println("Khuyen mai: "+promotions);
        System.out.println("Ton kho: "+stock);
    }
    public void getPrice(){
        System.out.println("Gia ban sau khi giam gia: "+(price-price*promotions));
    }
}
