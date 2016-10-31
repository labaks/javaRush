package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = {Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine()), Integer.parseInt(reader.readLine())};
        for (int j = 0; j < array.length; j++)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i] < array[i + 1])
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }
}
