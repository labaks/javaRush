package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandfather1 = new Human("grandpa1", true, 90);
        Human grandmother1 = new Human("grandma1", false, 80);
        Human grandfather2 = new Human("grandpa2", true, 90);
        Human grandmother2 = new Human("grandma2", false, 80);
        Human father = new Human("father", true, 50, grandfather1, grandmother1);
        Human mother = new Human("mother", false, 45, grandfather2, grandmother2);
        Human son1 = new Human("son1", true, 30, father, mother);
        Human son2 = new Human("son2", true, 20, father, mother);
        Human daughter = new Human("daughter", false, 20, father, mother);

        System.out.println(grandfather1.toString());
        System.out.println(grandmother1.toString());
        System.out.println(grandfather2.toString());
        System.out.println(grandmother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(daughter.toString());
    }

    private static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = this.mother = null;
        }

        Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
