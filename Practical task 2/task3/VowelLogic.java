package com.company;

public class VowelLogic {
    public static void isVowel(char letter) {
        if (letter == 'а' || letter == 'ё' || letter == 'я' || letter == 'у' || letter == 'ю' || letter == 'и' ||
                letter == 'ы' || letter == 'э' || letter == 'е' || letter == 'о') {
            Output.print("This is vowel");
        } else {
            Output.print("This is not vowel");
        }
    }
}
