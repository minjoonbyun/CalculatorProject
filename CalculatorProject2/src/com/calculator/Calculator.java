package com.calculator;
import java.util.ArrayList;

public class Calculator {
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public void removeResult() {
        if (arrayList.size() > 10)
            arrayList.remove(0);

    }

    public int calculate(int num1, int num2, char operator)
    {
        int result = 0;
        boolean validOperation = true;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':

                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
                break;
            default :
                System.out.println("잘못된 연산자를 입력하셨습니다.");
                validOperation = false;
        }
        if (validOperation == true) {
            arrayList.add(result);
        }
        return result;
    }
}
