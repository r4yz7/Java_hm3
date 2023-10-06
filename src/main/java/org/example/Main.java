package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Tigr tigr = new Tigr("Tiger", 100);
//        System.out.println(tigr);
//        Crocodile crocodile = new Crocodile("Croco",10);
//        Kangaroo kangaroo = new Kangaroo("Kangaroo",40);
//        System.out.println(crocodile);
//        System.out.println(kangaroo);

//        Money money = new Money();
//        money.addMoney(100,549);
//        money.showMoney();
//        Product tomato = new Product("Tomato",new Money(30,120));
//        tomato.buyProduct(tomato,money);
//        money.showMoney();

//        int[]arr = {4,2,7,8,1};
//        Array array = new Array(arr);
//        System.out.println("Max: " +  array.max());
//        System.out.println("Min: " +  array.min());
//        System.out.println("AVG: " +  array.avg());

        ArrayT arr1 = new ArrayT(5);
        arr1.fillRandom();
        arr1.print();
        System.out.println("Max: " + arr1.findMax());
        System.out.println("Min: " + arr1.findMin());
        arr1.sort();
        arr1.print();
    }
}
