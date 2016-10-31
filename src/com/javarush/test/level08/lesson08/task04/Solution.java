package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        for (Map.Entry<String, Date> pair : map.entrySet()) System.out.println(pair);
        System.out.println();
        System.out.println();
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> pair : map.entrySet()) System.out.println(pair);
    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date("JUNE 1 1980"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("JUNE 1 1980"));
        map.put("Stallone9", new Date("JUNE 1 1980"));

        //напишите тут ваш код
//        for (int i = 0; i < 10; i++) map.put("Stallone" + i, new Date(getRandomJoinDate()));
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
        for (Map.Entry<String, Date> pair : new HashSet<>(map.entrySet()))
            if (pair.getValue().getMonth() == 5 || pair.getValue().getMonth() == 6 || pair.getValue().getMonth() == 7) {
                map.remove(pair.getKey());
            }
    }

//////////////////////////////////////////////////////////////

//    public static String getRandomJoinDate()
//    {
//        String date = "";
//        int yearBegin = 1990;
//        int yearEnd = 2016 - yearBegin;
//
//        date = "" + (1 + (int) (Math.random() * 31) + "/" + (1 + (int) (Math.random() * 12) + "/" + (yearBegin + (int) (Math.random() * yearEnd))));
//        return date;
//    }
}
