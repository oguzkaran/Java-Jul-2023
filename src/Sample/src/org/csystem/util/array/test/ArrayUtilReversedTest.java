package org.csystem.util.array.test;

import org.csystem.util.array.ArrayUtil;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtilReversedTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();
        Random random = new Random();

        for (int i = 0; i < count; ++i) {
            System.out.println("----------------------------------------------------");
            int [] a = ArrayUtil.generateRandomArray(random, random.nextInt(5, 11), 0, 100);

            ArrayUtil.print(2, a);
            int [] b = ArrayUtil.reversed(a);
            ArrayUtil.print(2, a);
            ArrayUtil.print(2, b);
            System.out.println("----------------------------------------------------");
        }
    }

    public static void main(String[] args)
    {
        run();
    }
}