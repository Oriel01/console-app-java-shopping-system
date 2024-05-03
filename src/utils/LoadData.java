package utils;

import classes.Product;
import classes.Provider;

public class LoadData {

    public void loadProviders() {
        Provider p1 = new Provider(1, "Carlos", "local");
        Provider p2 = new Provider(2, "Anthony", "foreign");
        Provider p3 = new Provider(3, "Luis", "local");
        Provider.providers.add(p1);
        Provider.providers.add(p2);
        Provider.providers.add(p2);
    }

    public void loadProducts(){
        Product p1 = new Product(1, 1, 1000.00, 1200.00, 2, 900.00, "Laptop");
        Product p2 = new Product(2, 3, 800.00, 670.00, 2, 600.00, "LCD TV");
        Product p3 = new Product(3, 1, 150.00, 200.00, 3, 90.00, "Desktop");
        Product.products.add(p1);
        Product.products.add(p2);
        Product.products.add(p3);
    }

    public void showDataLoaded(){
        System.out.println("Providers Loaded");
        for (Provider provider : Provider.providers){
            System.out.println(provider.toString());
        }
        System.out.println("Products Loaded");
        for (Product product : Product.products){
            System.out.println(product.toString());
        }
    }

}
