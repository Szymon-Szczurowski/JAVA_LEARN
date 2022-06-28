package org.pjatk.products;

import java.util.ArrayList;

public class ProductsHelperApplication {

    public static void main(String[] args){



        ArrayList<Product> products;

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();

        p1.name = "Vodka";
        p2.name = "Chleb";
        p3.name = "Masło";
        p4.name = "Pasztet";

        p1.price = 350;
        p2.price = 20;
        p3.price = 10;
        p4.price = 150;


        products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);

        DiscountCalculator c = new DiscountCalculator();

        c.products=products;

        c.discountByPercentage(100,0.05);
        c.addFreeCompanyGlass(200);

        for (Product p: products){
            System.out.println(p.name+" "+p.price);
        }





        ArrayList<String> names = new ArrayList<String>();

        names.add("Jan");
        names.add("Adam");
        names.add("Ola");
        names.add("Ania");
        names.add("Maciej");
        names.add("Krzysztof");

        System.out.println("Ola znajduje się na indeksie: " + names.indexOf("Ola"));

        names.remove("Jan");
                //Adam, Ola, Ania, Maciej, Krzysztof

        names.remove(2);
                // usunie Anię, bo nastąpi przeindeksowanie - Jan już jest usunięty, więc na indeksie będzie Ania
                //Adam, Ola, Maciej, Krzysztof
        names.add(3, "Mateusz");
                // wstawi Mateusza przed Krzysztofa
                //Adam, Ola, Maciej, Mateusz, Krzysztof

        System.out.println("Ilość imion: "+ names.size()+"\noto one:");

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Na indeksie 2 jest "+ names.get(2));
        if(names.size()>0)
            System.out.println("Ostatni na liście jest "+ names.get(names.size()-1));

    }
}
