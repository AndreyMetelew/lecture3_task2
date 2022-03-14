package com.task2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    /* 1. Создать статическую переменную int catCount в классе Cat.
    Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1. */

    class Cat {
        private static int catCount = 0;

        public Cat() {
            catCount++;
        }

        /* 2. Добавить к классу Cat два статических метода: int getCatCount() и setCatCount(int),
        с помощью которых можно получить/изменить количество котов (переменную catCount) */

        public static int getCatCount() {
            return catCount;
        }

        public static void setCatCount(int CatCounter) {
            catCount = CatCounter;
        }
    }

    /* 3. В классе Util реализовать статический метод double getDistance(x1, y1, x2, y2).
    Он должен вычислять расстояние между точками.
    Используй метод double Math.sqrt(double a), который вычисляет квадратный корень переданного параметра */

    class Util {
        private int x1, y1, x2, y2;

        static double getDistance (int x1, int y1, int x2, int y2) {
            return Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
        }
    }

    /* 4. Сделать класс ConsoleReader, у которого будут 4 статических метода:
    String readString() – читает с клавиатуры строку
    int readInt() – читает с клавиатуры число
    double readDouble() – читает с клавиатуры дробное число
    boolean readBoolean() – читает с клавиатуры строку "true" или "false" и возвращает соответствующую логическую переменную true или false
    Внимание: создавайте переменную для чтения данных с консоли (BufferedReader или Scanner) внутри каждого метода */

    class ConsoleReader {
        public static String readString() throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return reader.readLine();
        }

        public static int readInt() throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return Integer.parseInt(reader.readLine());
        }

        public static double readDouble() throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return Double.parseDouble(reader.readLine());
        }

        public static boolean readBoolean() throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            return Boolean.parseBoolean(reader.readLine());
        }
    }

    /* 5. Cделать класс StringHelper, у которого будут 2 статических метода:
    String multiply(String s, int count) – возвращает строку, повторенную count раз.
    String multiply(String s) – возвращает строку, повторенную 5 раз. */

    class StringHelper {
        static String multiply(String s, int count) {
            for (int i = 0; i < count; i++) {
                s = s + s;
            }
            return s;
        }

        static String multiply(String s) {
            for (int i = 0; i < 5; i++) {
                s = s + s;
            }
            return s;
        }
    }

    public static void main(String[] args) {
        // Меня надо бы заполнить, но для задания это было несущественно :)
    }
}