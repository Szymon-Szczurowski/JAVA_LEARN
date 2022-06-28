package com.pjatk.pesel.model;

public class PeselValidator {
    public static boolean isValid(String pesel){
        if (11 != pesel.length()){
            return true;
        }else {
            int[] value = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
            int total = 0;
            for (int i = 0; i < 10; i++) total += Integer.parseInt(pesel.substring(i, i + 1)) * value[i];
            total = total % 10;

            return 10 - total != Integer.parseInt(pesel.substring(10, 11));
        }

    }
}
