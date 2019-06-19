package com.hibicode.lista;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class GoodStringUtils implements DigitUtil {

    @Override
    public List<Character> getDigits(String word) {
        return word.chars().mapToObj(i -> (char) i).filter(Character::isDigit).collect(toList());
    }

}
