package com.train;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static HashMap<String, Integer> dictionary = new HashMap<>(120);

    public static String calc(String input) throws Exception {
        String[] split = input.split(" ");
        String num1 = split[0];
        String operation = split[1];
        String num2 = split[2];

        String type;
        if (dictionary.containsKey(num1) && dictionary.containsKey(num2)) {
            type = "rome";
        } else if (isDigit(num1, num2)) {
            type = "arabian";
        } else {
            type = "unresolvableType";
        }

        if (type.equals("arabian")) {
            int num1int = Integer.parseInt(num1);
            int num2int = Integer.parseInt(num2);

            int result = 0;

            if ((num1int <= 10 && num1int >= -10) && (num2int <= 10 && num2int >= -10)) {
                result = getResult(operation, num1int, num2int);
            } else {
                throw new Exception("Вы ввели числа не подходящие под условия задачи");
            }

            return String.valueOf(result);

        } else if (type.equals("rome")) {
            int num1int = dictionary.get(num1);
            int num2int = dictionary.get(num2);

            int result = 0;
            if ((num1int <= 10 && num1int >= 1) && (num2int <= 10 && num2int >= 1)) {
                result = getResult(operation, num1int, num2int);

                for (Map.Entry<String, Integer> entry : dictionary.entrySet()) {
                    if (entry.getValue().equals(result)) {
                        return String.valueOf(entry.getKey());
                    }
                }
            } else {
                throw new Exception("Вы ввели римские числа не удовл. условию");
            }

            return "Ответа не нашлось";
        } else {
            throw new Exception("Недопустимый ввод");
        }
    }

    private static int getResult(String operation, int num1int, int num2int) throws Exception {
        int result;
        switch (operation) {
            case "+":
                result = num1int + num2int;
                break;
            case "-":
                result = num1int - num2int;
                break;
            case "/":
                result = num1int / num2int;
                break;
            case "*":
                result = num1int * num2int;
                break;
            default:
                throw new Exception("Такой операции не существует");
        }
        return result;
    }

    public static boolean isDigit(String num1, String num2) {
        try {
            Integer.parseInt(num1);
            Integer.parseInt(num2);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void addRomeNumbers() {
        dictionary.put("I", 1);
        dictionary.put("II", 2);
        dictionary.put("III", 3);
        dictionary.put("IV", 4);
        dictionary.put("V", 5);
        dictionary.put("VI", 6);
        dictionary.put("VII", 7);
        dictionary.put("VIII", 8);
        dictionary.put("IX", 9);
        dictionary.put("X", 10);
        dictionary.put("XI", 11);
        dictionary.put("XII", 12);
        dictionary.put("XIII", 13);
        dictionary.put("XIV", 14);
        dictionary.put("XV", 15);
        dictionary.put("XVI", 16);
        dictionary.put("XVII", 17);
        dictionary.put("XVIII", 18);
        dictionary.put("XIX", 19);
        dictionary.put("XX", 20);
        dictionary.put("XXI", 21);
        dictionary.put("XXII", 22);
        dictionary.put("XXIII", 23);
        dictionary.put("XXIV", 24);
        dictionary.put("XXV", 25);
        dictionary.put("XXVI", 26);
        dictionary.put("XXVII", 27);
        dictionary.put("XXVIII", 28);
        dictionary.put("XXIX", 29);
        dictionary.put("XXX", 30);
        dictionary.put("XXXI", 31);
        dictionary.put("XXXII", 32);
        dictionary.put("XXXIII", 33);
        dictionary.put("XXXIV", 34);
        dictionary.put("XXXV", 35);
        dictionary.put("XXXVI", 36);
        dictionary.put("XXXVII", 37);
        dictionary.put("XXXVIII", 38);
        dictionary.put("XXXIX", 39);
        dictionary.put("XL", 40);
        dictionary.put("XLI", 41);
        dictionary.put("XLII", 42);
        dictionary.put("XLIII", 43);
        dictionary.put("XLIV", 44);
        dictionary.put("XLV", 45);
        dictionary.put("XLVI", 46);
        dictionary.put("XLVII", 47);
        dictionary.put("XLVIII", 48);
        dictionary.put("XLIX", 49);
        dictionary.put("L", 50);
        dictionary.put("LI", 51);
        dictionary.put("LII", 52);
        dictionary.put("LIII", 53);
        dictionary.put("LIV", 54);
        dictionary.put("LV", 55);
        dictionary.put("LVI", 56);
        dictionary.put("LVII", 57);
        dictionary.put("LVIII", 58);
        dictionary.put("LIX", 59);
        dictionary.put("LX", 60);
        dictionary.put("LXI", 61);
        dictionary.put("LXII", 62);
        dictionary.put("LXIII", 63);
        dictionary.put("LXIV", 64);
        dictionary.put("LXV", 65);
        dictionary.put("LXVI", 66);
        dictionary.put("LXVII", 67);
        dictionary.put("LXVIII", 68);
        dictionary.put("LXIX", 69);
        dictionary.put("LXX", 70);
        dictionary.put("LXXI", 71);
        dictionary.put("LXXII", 72);
        dictionary.put("LXXIII", 73);
        dictionary.put("LXXIV", 74);
        dictionary.put("LXXV", 75);
        dictionary.put("LXXVI", 76);
        dictionary.put("LXXVII", 77);
        dictionary.put("LXXVIII", 78);
        dictionary.put("LXXIX", 79);
        dictionary.put("LXXX", 80);
        dictionary.put("LXXXI", 81);
        dictionary.put("LXXXII", 82);
        dictionary.put("LXXXIII", 83);
        dictionary.put("LXXXIV", 84);
        dictionary.put("LXXXV", 85);
        dictionary.put("LXXXVI", 86);
        dictionary.put("LXXXVII", 87);
        dictionary.put("LXXXVIII", 88);
        dictionary.put("LXXXIX", 89);
        dictionary.put("XC", 90);
        dictionary.put("XCI", 91);
        dictionary.put("XCII", 92);
        dictionary.put("XCIII", 93);
        dictionary.put("XCIV", 94);
        dictionary.put("XCV", 95);
        dictionary.put("XCVI", 96);
        dictionary.put("XCVII", 97);
        dictionary.put("XCVIII", 98);
        dictionary.put("XCIX", 99);
        dictionary.put("C", 100);
    }

    public static void main(String[] args) throws Exception {
        addRomeNumbers();

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String input = scan.nextLine();
        System.out.println(calc(input));
    }

}



