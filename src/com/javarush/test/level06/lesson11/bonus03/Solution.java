package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int array[] = {Integer.parseInt(reader.readLine()),
                Integer.parseInt(reader.readLine()),
                Integer.parseInt(reader.readLine()),
                Integer.parseInt(reader.readLine()),
                Integer.parseInt(reader.readLine())};
        puzir(array);
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }


    }

    public static int[] puzir(int[] mass)
    {
        for (int j = 0; j < mass.length; j++)
        {
            for (int i = 0; i < mass.length - 1 - j; i++)
            {
                if (mass[i] > mass[i + 1])
                {
                    int temp = mass[i];
                    mass[i] = mass[i + 1];
                    mass[i + 1] = temp;
                }
            }
        }
        return mass;
    }
}
