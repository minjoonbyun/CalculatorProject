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
                } else {
                    result = num1 / num2;
                }
                break;
        }

        arrayList.add(result);
        return result;
    }
}
