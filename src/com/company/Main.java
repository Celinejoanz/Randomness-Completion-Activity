package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args)
    {
        Random rnd = new Random();

        for (int i = 1; i <= 6; ++i)
        {
            int dieNumber = 1 + rnd.nextInt(6);
            System.out.println("Your die roll was : " + dieNumber);
        }
    }
}
