package com.chtti.demo.GitDemo.beans;

import com.chtti.demo.GitDemo.Calculator;

public class SubCalculator implements Calculator {
    @Override
    public int calc(int a, int b) {
        return a - b;
    }
}