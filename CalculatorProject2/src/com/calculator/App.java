package com.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String answer;
        Calculator Calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요:");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력하세요:");
            int num2 = scanner.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = scanner.next().charAt(0);

            int result = Calculator.calculate(num1,num2,operator);
            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            answer = scanner.next();

            if (answer.equals("exit")) {
                break;
            }
        }
    }
}
