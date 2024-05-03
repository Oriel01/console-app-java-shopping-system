package classes;

import java.util.ArrayList;

public class Provider {
    public static ArrayList<Provider> providers = new ArrayList<>();
    private int providerCode;
    private String providerName;
    private String providerType;

    // Object Constructor Call
    public Provider(int providerCode, String providerName, String providerType){
        this.providerCode = providerCode;
        this.providerName = providerName;
        this.providerType = providerType;
    }

    //Getter and Setters
    public int getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(int providerCode) {
        this.providerCode = providerCode;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getProviderType() {
        return providerType;
    }

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }
}
