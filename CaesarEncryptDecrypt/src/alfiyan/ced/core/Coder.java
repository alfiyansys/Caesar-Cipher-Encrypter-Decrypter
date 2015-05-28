/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alfiyan.ced.core;

/**
 *
 * @author Ian
 */
public class Coder {
    public static String convert(String text, int shift){
        text = text.toUpperCase();
        char[] hurufs = text.toCharArray();
        int[] ascii = new int[text.length()];
        for(int i = 0; i<text.length();i++){
            ascii[i] = (int)hurufs[i] + shift;
            if(ascii[i] - shift == 32){
                continue;
            }
            if(ascii[i] > 90){
                ascii[i] = ascii[i] - 26;
            }else if(ascii[i] < 65){
                ascii[i] = ascii[i] + 26;
            }
            hurufs[i] = (char)ascii[i];
        }
        return new String(hurufs);
    }
}
