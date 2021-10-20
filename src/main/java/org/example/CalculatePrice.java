package org.example;

import org.example.product.Products;
import org.example.repository.RepositoryOfProducts;


public class CalculatePrice {

    public float calculate(String in) {

        RepositoryOfProducts repository = new RepositoryOfProducts();

        float sum = 0f;

        if (in.isEmpty()) {
            System.out.println("Please, print products code");
        } else {
            String[] codeWare = in.toLowerCase().split("");
            int a = 0;
            int c = 0;
            for (String code : codeWare) {
                switch (code) {
                    case "a":
                        a++;
                        sum = promoCalculate(repository.productsA, a, sum);
                        break;
                    case "b":
                        sum = sum + repository.productsB.getPrice();
                        break;
                    case "c":
                        c++;
                        sum = promoCalculate(repository.productsC, c, sum);
                        break;
                    case "d":
                        sum = sum + repository.productsD.getPrice();
                        break;
                    default:
                        System.out.println("Write correct code. Code " + code + " isn't from our store");
                }
            }
        }
        return sum;

    }

    public void printResult(Float sum) {
        System.out.println("The price is " + sum);
    }

    public float promoCalculate(Products products, int a, float sum) {
        if (a % products.getPromoQuantity() == 0) {
            sum = sum - (products.getPromoQuantity() - 1) * products.getPrice() + products.getPromoPrice();
        } else {
            sum = sum + products.getPrice();
        }
        return sum;
    }
}
