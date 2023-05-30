package com.bestbuy.utils;

import java.util.Random;

public class TestUtils {
    public static int getRandomValue(){
        Random random = new Random();
        int randomInt = random.nextInt(100000);
        return randomInt;
    }
}
