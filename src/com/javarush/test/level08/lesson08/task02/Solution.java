package com.javarush.test.level08.lesson08.task02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Integer> newSet = createSet();
        newSet = removeAllNumbersMoreThan10((HashSet<Integer>) newSet);
    }
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        HashSet<Integer> integerSet = new HashSet<>();
        for (int i = 0; i < 20; i++)
        {
            integerSet.add(i+3);
        }
        return integerSet;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            Integer next = iterator.next();
            if(next > 10) iterator.remove();
        }
        return set;
    }
}
