package ru.gb.lesson2;

public class Homework {

    public static void main(String[] args) {

        String string = "abcdedcba";
        System.out.println(isPalindrome(string));

    }

    /**
     * 1. Реализовать метод isPalindrome
     * 2. Пересмотреть мой спич про работу с файловой системой. Подготовить вопросы.
     */

    /**
     * Проверить, является ли строка палиндромом.
     * Палиндром - это строка, которая читается одинаково слева и справа
     * abcdedcba -> true
     * a -> true
     * abc -> false
     * abcd -> false
     * abba -> true
     */
    static boolean isPalindrome(String string) {
        // TODO: 08.06.2023

        char[] result = string.toCharArray();

        String left = "";
        String right = "";

        for (int i = 0; i < result.length / 2; i++) {

            left += result[i];
            right += result[result.length - i - 1];
        }
        System.out.println("left = " + left);
        System.out.println("right = " + right);

        if (left.equals(right)) {

            return true;

        }

        else {

            return false;

        }
    }

}
