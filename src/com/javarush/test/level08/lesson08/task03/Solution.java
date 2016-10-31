package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        getCountTheSameFirstName(map, "name");
        getCountTheSameLastName(map, "lastName");
    }

    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++)
        {
            map.put("lastName" + i, "name" + i);
        }
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) if (iterator.next().getValue().equals(name)) count++;
//        for (Map.Entry<String, String> pair : map.entrySet()) if (pair.getKey().equals(name)) count++;
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) if (iterator.next().getKey().equals(lastName)) count++;
//        for (Map.Entry<String, String> pair : map.entrySet()) if (pair.getValue().equals(lastName)) count++;
        return count;
    }
}
