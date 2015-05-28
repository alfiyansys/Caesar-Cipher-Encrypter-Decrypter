
import alfiyan.ced.core.Coder;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian
 */
public class RunCaesar {
    public static void main(String[] args){
        String teks = "a z";
        for(int i=0;i<=26;i++){
            teks = Coder.convert(teks, i);
            System.out.println(teks);
        }
    }
}
