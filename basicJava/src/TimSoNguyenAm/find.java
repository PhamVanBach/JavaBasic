/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TimSoNguyenAm;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author bachp
 */
public class find {
    String NegativeNumberInStrings(String s){
        s = s.replaceAll("[^-?0-9]+", " "); 
        Arrays.asList(s.trim().split(" "));
        return s;
    }
    public static void main(String[] args) {
        find f = new find();
        f.NegativeNumberInStrings("abc-5xyz-12k9l--p");
    }
}
