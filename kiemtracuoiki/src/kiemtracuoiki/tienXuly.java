/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtracuoiki;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class tienXuly {
    Scanner sc = new Scanner(System.in);
    public String chuanHoa(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        return str;
    }
    public String chuanHoaDanhTuRieng(String str) {
        str = chuanHoa(str);
        String temp[] = str.split(" ");
        str = ""; 
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1)
                str += " ";
        }
        return str;
    }
    
    public int GetAnInteger(int interger)
    {
        while (true)
        {
            try
            {
                return interger;
            }
            catch(InputMismatchException e)
            {
                System.out.print("That’s not "
                + "an integer. Try again: ");
            }
        }

    }
    
    public int isNum(){
        while (true)
        {
            try
            {
                return sc.nextInt();
            }
            catch (InputMismatchException e)
            {
                sc.next();
                System.out.print("That’s not "
                 + "an integer. Try again: ");
            }
        }
    }
}