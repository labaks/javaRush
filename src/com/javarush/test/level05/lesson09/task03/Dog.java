package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name = null;
    private int height;
    private int color;

    public Dog(String name)
    {
        this.name = name;
    }

    public Dog(String name, int height)
    {
        this.name = name;
        this.height = height;
    }

    public Dog(String name, int height, int color)
    {
        this.name = name;
        this.height = height;
        this.color = color;
    }

}
