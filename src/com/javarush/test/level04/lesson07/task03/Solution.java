package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int a = Integer.parseInt(reader.readLine());
        if (a > 0) count++;
        int b = Integer.parseInt(reader.readLine());
        if (b > 0) count++;
        int c = Integer.parseInt(reader.readLine());
        if (c > 0) count++;
        System.out.println(count);
    }
}
