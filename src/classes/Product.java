package classes;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Product {
    public static ArrayList<Product> products = new ArrayList<>();
    private int productCode;
    private String productName;
    private double productPrice;
    private int providerCode1;
    private double providerPrice1;
    private int providerCode2;
    private double providerPrice2;

    // Constructor
    public Product(int productCode, int providerCode2, double providerPrice2, double providerPrice1, int providerCode1, double productPrice, String productName) {
        this.productCode = productCode;
        this.providerCode2 = providerCode2;
        this.providerPrice2 = providerPrice2;
        this.providerPrice1 = providerPrice1;
        this.providerCode1 = providerCode1;
        this.productPrice = productPrice;
        this.productName = productName;
    }

    //Getters and Setters

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProviderCode1() {
        return providerCode1;
    }

    public void setProviderCode1(int providerCode1) {
        this.providerCode1 = providerCode1;
    }

    public double getProviderPrice1() {
        return providerPrice1;
    }

    public void setProviderPrice1(double providerPrice1) {
        this.providerPrice1 = providerPrice1;
    }

    public int getProviderCode2() {
        return providerCode2;
    }

    public void setProviderCode2(int providerCode2) {
        this.providerCode2 = providerCode2;
    }

    public double getProviderPrice2() {
        return providerPrice2;
    }

    public void setProviderPrice2(double providerPrice2) {
        this.providerPrice2 = providerPrice2;
    }
}
