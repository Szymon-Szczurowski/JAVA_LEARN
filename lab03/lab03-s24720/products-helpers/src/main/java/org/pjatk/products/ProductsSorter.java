package org.pjatk.products;

import java.util.ArrayList;

public class ProductsSorter {

    //można wykorzystać algorytm sortowania przez wstawiania

    public static ArrayList<Product> sort(ArrayList<Product> products) {

        ArrayList<Product> sorted = new ArrayList<Product>();
        for (Product product : products){
            int index = 0;
            for (Product sortedProduct : sorted){
                if (product.price>sortedProduct.price)
                    index++;
            }
            sorted.add(index, product);
        }
        return sorted; }

    public static Product mostExpensive(ArrayList<Product> products){
        if (products == null || products.size() == 0) {
            return null;
        }
        double highestPrice = 0;
        Product mostExpensive = products.get(0);
        for (Product product : products) {
            if (product.price > highestPrice) {
                mostExpensive = product;
            }
        }
        return mostExpensive;
    }

    public static Product theCheapest(ArrayList<Product> products){
        if (products == null || products.size() == 0) {

            return null;
        }
        double lowerPrice = products.get(0).price;
        Product theCheapest = products.get(0);

        for (Product product : products) {
            if (product.price < lowerPrice) {
                theCheapest = product;
            }
        }
        return theCheapest;
    }



    public static ArrayList<Product> theCheapest(ArrayList<Product> products, int n){
        products = sort(products);
        ArrayList <Product> x = new ArrayList <Product>();
        for(int i = 0;i < n;i++) x.add(products.get(i));
        return x;
    }
}
