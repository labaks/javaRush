package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        String str = reader.readLine();
        int N = Integer.parseInt(str);
        if (N > 0)
        {
            int num = Integer.parseInt(reader.readLine());
            maximum = num;
            while (N > 1)
            {
                num = Integer.parseInt(reader.readLine());
                if (maximum < num) maximum = num;
                N--;
            }
            System.out.println(maximum);
        }
    }
}
