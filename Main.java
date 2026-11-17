package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        try {
            System.out.print("Введіть операцію (+, -, *, /, sqrt): ");
            String operation = scanner.next();

            if (operation.equals("sqrt")) {
                System.out.print("Введіть число: ");
                double a = scanner.nextDouble();
                double result = calc.sqrt(a);
                System.out.println("Результат: " + result);
            } else {
                System.out.print("Введіть перше число: ");
                double a = scanner.nextDouble();
                System.out.print("Введіть друге число: ");
                double b = scanner.nextDouble();

                double result = 0;

                switch (operation) {
                    case "+":
                        result = calc.add(a, b);
                        break;
                    case "-":
                        result = calc.subtract(a, b);
                        break;
                    case "*":
                        result = calc.multiply(a, b);
                        break;
                    case "/":
                        result = calc.divide(a, b);
                        break;
                    default:
                        System.out.println("Невідома операція: " + operation);
                        return;
                }

                System.out.println("Результат: " + result);
            }
        } catch (InputMismatchException e) {
            System.out.println("Помилка: введено некоректне значення (очікувалось число)");
        } catch (ArithmeticException e) {
            System.out.println("Помилка: ділення на нуль");
        } catch (InvalidInputException e) {
            System.out.println("Помилка: " + e.getMessage());
        } finally {
            System.out.println("Обробка запиту завершена");
            scanner.close();
        }
    }
}
