package com.nithin.sellmycar;

import org.springframework.stereotype.Component;

@Component
public class Result {
    private int num1;
    private int num2;

    // Getter and Setter for num1
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    // Getter and Setter for num2
    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // toString method
    @Override
    public String toString() {
        return "Result{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }
}
