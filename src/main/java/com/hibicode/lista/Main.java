package com.hibicode.lista;

public class Main {

    public static void main(String[] args) {
        final String word = "a1b2c3";
        final DigitUtil digitUtil = new BadStringUtils();
        digitUtil.getDigits(word).forEach(System.out::println);
    }
}
