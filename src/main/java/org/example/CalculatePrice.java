package org.example;

import org.example.product.Products;


public class CalculatePrice {

    public float calculate(String in) {

        Products productsA = new Products("A", 1.25f, 3, 3f);
        Products productsB = new Products("B", 4.25f);
        Products productsC = new Products("C", 1f, 6, 5f);
        Products productsD = new Products("D", 0.75f);

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
                        if (a == productsA.getPromoQuantity()) {
                            sum = sum - 2 * productsA.getPrice() + productsA.getPromoPrice();
                        } else {
                            sum = sum + productsA.getPrice();
                        }
                        break;
                    case "b":
                        sum = sum + productsB.getPrice();
                        break;
                    case "c":
                        c++;
                        if (c == productsC.getPromoQuantity()) {
                            sum = sum - 5 * productsC.getPrice() + productsC.getPromoPrice();
                        } else {
                            sum = sum + productsC.getPrice();
                        }
                        break;
                    case "d":
                        sum = sum + productsD.getPrice();
                        break;
                    default:
                        System.out.println("Write correct code. Code " + code + " isn't from our store");


                }
            }
            System.out.println("The price is " + sum);
        }

        return sum;
    }
}
