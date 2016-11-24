package com.javarush.test.level08.lesson11.home03;
import java.util.*;

/* Люди с одинаковыми именами и/или фамилиями
1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями.
4. Вывести содержимое Map на экран.
*/
public class Solution {

    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код

        Map<String, String> map = new HashMap<>();

        map.put("иоаннис", "молодец");
        map.put("леша", "молодец");
        map.put("юра", " ");
        map.put("юра", "не пробел");
        map.put("юра", "полный пробел");
        map.put("леша", "не пробел");
        map.put("иоаннис", "полный пробел");
        map.put("иоаннис", "молодец");
        map.put("уу", "ее");
        map.put("ее", "ее");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }

}