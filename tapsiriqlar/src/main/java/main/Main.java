/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author turko
 */
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.generateDocument("faadabcbbebdf"));
    }

    public int generateDocument(String string) {
        int sonuc=-1;
        int count=0;
        for (int i = 0; i < string.length(); i++) {
            count=0;
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(j) == string.charAt(i)) {
                    if (i == j) {
                        continue;
                    } else {
                        count++;
                    }
                }

            }
            if(count==0){
                sonuc= i;
            }
        }
        return sonuc;
    }
}