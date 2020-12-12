/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panlyndrome;

/**
 *
 * @author bachp
 */
public class panlydrome {
    public static boolean isPanlyndrome(String s) 
    { 
        for(int i=0;i<s.length();i++) 
        { 
            if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false; 
        } 
        return true; 
    } 
    public static void main(String[] args) {
        panlydrome p = new panlydrome();
        System.out.println(p.isPanlyndrome("madam"));
    }
}
