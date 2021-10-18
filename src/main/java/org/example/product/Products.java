package org.example.product;

public class Products {

    String name;
    Float price;
    Integer promoQuantity;
    Float promoPrice;

    public Products(String name, Float price, Integer promoQuantity, Float promoPrice) {
        this.name = name;
        this.price = price;
        this.promoQuantity = promoQuantity;
        this.promoPrice = promoPrice;
    }

    public Products(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getPromoQuantity() {
        return promoQuantity;
    }

    public void setPromoQuantity(Integer promoQuantity) {
        this.promoQuantity = promoQuantity;
    }

    public Float getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(Float promoPrice) {
        this.promoPrice = promoPrice;
    }
}
