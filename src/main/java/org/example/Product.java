package org.example;

public class Product {
    String name;
    Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }
    public void showProduct(){
        System.out.println("Name: " + name + "Price: " + price.getHryvna() + "." + price.getKopecks() + "\n" );
    }

    public void buyProduct(Product p, Money m){
        p.price.subMoney(m,p.price);
    }
}
