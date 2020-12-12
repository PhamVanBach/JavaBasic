/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2Again;

import java.util.ArrayList;

/**
 *
 * @author bachp
 */
public class ListInfo {
    ArrayList<Info> listInfo = new ArrayList<>();
    
    int maxSize = 25;
    
    public void inputInfo(int x){
        //khoi tao chuoi nhanh
        if(x == 1){
            if(listInfo.size()>25){
                System.out.println("Khong them duoc");
            }else{
                listInfo.add(new Info("Bach     Pham    7562"));
                listInfo.add(new Info("Bach     Pham    7562"));
                listInfo.add(new Info("Bach     Pham    7562"));
                listInfo.add(new Info("Bach     Pham    7562"));
                listInfo.add(new Info("Bach     Pham    7562"));
            }
        }else if(x == 2){
            if(listInfo.size() > 25){
                System.out.println("Khong them duoc!!!");
            }else{
                Info temp = new Info();
                temp.Nhap();
                listInfo.add(temp);
            }       
        } 
    }
    
    public void xuat(){
        System.out.println("\n----------------------------------");
        System.out.println("Xuat Du Lieu");
        //output      
        System.out.println("Ten\tHo\tBuu Dien");
        for(Info temp : listInfo){
            System.out.println(temp);
        }
    }
}
