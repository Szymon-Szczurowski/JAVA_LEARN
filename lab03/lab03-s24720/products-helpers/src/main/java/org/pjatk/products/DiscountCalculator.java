package org.pjatk.products;

import java.util.ArrayList;

public class DiscountCalculator {

    public ArrayList<Product> products;

    /*
       minimumPrice  - cena minimalna, od której zaczyna się naliczanie rabatu
        percentage - liczba od 0 do 1, określająca jaki procent rabatu jest przyznany, np 0.1 to 10%
     */
    public void discountByPercentage(double minimumPrice, double percentage){
        double x = 0;

        for (Product product : products) {
            x = x + product.price;
        }
        if (x > minimumPrice){
            for (Product product : products) {
                product.price = product.price * (1 - percentage);
            }
        }
    }
    public void addFreeCompanyGlass(double minimumPrice){
        double amo = 0;
        for (Product product : products) {
            amo = amo + product.price;}
        System.out.println(amo + " " + minimumPrice);
        if(amo > minimumPrice) {
            Product x = new Product();
            x.price = 0;
            products.add(x);
            System.out.println(amo + " " + minimumPrice);
        }
    }

    public void threeForPriceOfTwo(){
        if(products.size()>=3) {
            int y = products.size(); int z=0;
            double min=products.get(0).price;
            for (int i = 1; i < y; i++) {
                if (products.get(i).price < min) {
                    min = products.get(i).price;
                    z=i;
                } }
            products.get(z).price=0;
        }
    }

}
