/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2Again;

import java.util.Scanner;

/**
 *
 * @author bachp
 * 
 */
public class Info {
    private String firstName;
    private String lastName;
    private int zipCode;
    Scanner sc = new Scanner(System.in);

    public Info() {
        firstName = "";
        lastName = "";
        zipCode = 0;
    }

    public Info(String strName) {
        
        //chuan hoa xau
        strName = ChuanHoaXau(strName);
        //tach chuoi
        String[] strSplit = strName.split(" ");
        
        this.firstName = strSplit[0];
        this.lastName = strSplit[1];
        this.zipCode = Integer.parseInt(strSplit[2]);
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
        this.zipCode = IsNumeric(zipCode) ? Integer.parseInt(zipCode) : 0;
    }
    
    public String ChuanHoaXau(String strName){
        //Xoa khoang trang dau va cuoi dong
        strName = strName.trim();
        // Xoa khoang trang giua dong
        while(strName.indexOf("\t") != -1){
            strName = strName.replace("\t", " ");
        }
        while (strName.indexOf("  ") != -1) {
            strName = strName.replace("  ", " ");      
        }
        return strName;
    }
    public boolean IsNumeric(final String str){
        //null or empty
        if(str == null || str.length() == 0){
            return false;
        }
        return str.chars().allMatch(Character::isDigit);
    }
    
    public void Nhap(){
        System.out.println("Nhap chuoi can them vao (Cac nhau bang Tab): ");
        String strName = sc.nextLine();
        
        //chuan hoa xau
        strName = ChuanHoaXau(strName);
        //tach chuoi
        String[] strSplit = strName.split(" ");
        this.firstName = strSplit[0];
        this.lastName = strSplit[1];
        
        this.zipCode = IsNumeric(strSplit[2]) ? Integer.parseInt(strSplit[2]) : 0;
    }

    @Override
    public String toString() {
        return firstName + "\t" + lastName + "\t" + zipCode; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
