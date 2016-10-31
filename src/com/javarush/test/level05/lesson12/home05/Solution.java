package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sum = null;
        int sumN = 0;
        while (true) {
            sum = reader.readLine();
            if (sum.equals("сумма")) break;
            sumN += Integer.parseInt(sum);
        }
        System.out.println(sumN);
    }
}
