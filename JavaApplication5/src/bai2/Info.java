/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class Info {
    Scanner scan = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int zipCode;
    
    public Info() {
        firstName = "";
        lastName = "";
        zipCode = 0;
    }
    
    public Info(String strName) {
        
        // Chuan hoa xau
        strName = chuanHoaXau(strName);
        
        // Tach chuoi
        String[] strSplit = strName.split(" ");
        firstName = strSplit[0];
        lastName = strSplit[1];
        zipCode = Integer.parseInt(strSplit[2]);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = isNumeric(zipCode) ? Integer.parseInt(zipCode) : 0;
    }
    
    public String chuanHoaXau(String strName) {
        //Xoa khoang trang dau va cuoi dong
        strName = strName.trim();
        // Xoa khoang trong giua dong
        while (strName.indexOf("\t") != -1) {
            strName = strName.replaceAll("\t", " ");
        }
        
        while (strName.indexOf("  ") != -1) {
            strName = strName.replaceAll("  ", " ");
        }
            
        return strName;
    }
    public boolean isNumeric(final String str) {

        // null or empty
        if (str == null || str.length() == 0) {
            return false;
        }

        return str.chars().allMatch(Character::isDigit);

    }
    public void nhap() {
        System.out.print("Nhap chuoi can them vao (cach nhau bang Tab): ");
        String strName = scan.nextLine();
        
        // Chuan hoa xau
        strName = chuanHoaXau(strName);
        System.out.println(strName);
        // Tach chuoi
        String[] strSplit = strName.split(" ");
        firstName = strSplit[0];
        lastName = strSplit[1];
        
        zipCode = isNumeric(strSplit[2]) ? Integer.parseInt(strSplit[2]) : 0;
    }
    @Override
    public String toString() {
        return firstName + "\t" + lastName + "\t" + zipCode;
    }
}
