package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.*;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] a = {Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine())};
        int max = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (max < a[i]) max = a[i];
        }
        System.out.println(max);
    }
}
