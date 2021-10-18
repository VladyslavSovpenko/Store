package org.example;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

public class CalculatePriceTest {

    @Test
    public void emptyInTest() {
        CalculatePrice calculatePrice = new CalculatePrice();
        Assert.assertTrue("Incorrect value", calculatePrice.calculate("")==0f);
    }

    @Test
    public void productCostTest() {
        CalculatePrice calculatePrice = new CalculatePrice();
        Assert.assertTrue("True cost", calculatePrice.calculate("ABCDABA")==13.25f);
    }

    @Test
    public void correctCodeNameTest() {
        CalculatePrice calculatePrice = new CalculatePrice();
        Assert.assertTrue("Incorrect in", calculatePrice.calculate("999zzz")==0f);
    }

    @Test
    public void correctAPromo(){
        CalculatePrice calculatePrice = new CalculatePrice();
        Assert.assertTrue("Incorrect A promo", calculatePrice.calculate("aAa")==3f);
    }

    @Test
    public void correctCPromo(){
        CalculatePrice calculatePrice = new CalculatePrice();
        Assert.assertTrue("Incorrect C promo", calculatePrice.calculate("CcCccc")==5f);
    }
}
