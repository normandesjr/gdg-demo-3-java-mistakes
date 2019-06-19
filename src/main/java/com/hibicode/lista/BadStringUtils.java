package com.hibicode.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BadStringUtils implements DigitUtil {

    @Override
    public List<Character> getDigits(String word) {
        List<Character> result = new ArrayList<>();

        for (char caracter : word.toCharArray()) {
            if (Character.isDigit(caracter)) {
                result.add(caracter);
            }
        }

        if (result.isEmpty()) {
            return null;
        } else {
            return Collections.unmodifiableList(result);
        }
    }


}
