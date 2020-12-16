/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtracuoiki;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author bachp
 */
public class AllFuntionsInPro {
    Computer cmp = new Computer();
    PhongThucHanh phth = new PhongThucHanh();
    DanhSachMayTinh danhSachMayTinh = new DanhSachMayTinh();
    ArrayList<Computer> computers = new ArrayList<>();
    ArrayList<PhongThucHanh> rooms = new ArrayList<>();
    ArrayList<DanhSachMayTinh> danhSachMayTinhs = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void RunProgram(){
        renderComs();
        renderRooms();
        int n;
        boolean flag = true;
        do{
            System.out.println("Your choise: ");
            System.out.println("1.Nhap them thiet bi vao may tinh.");
            System.out.println("2.Nhap them phong thuc hanh.");
            System.out.println("3.Sap xep theo ten phong.");
            System.out.println("4.Sap xep theo so luonh may tinh(desc).");
            System.out.println("5.Sap xep theo ten phong.");
            System.out.println("6.Tim kiem in danh sach thiet bi trong phong theo ten thiet bi.");
            System.out.println("7. Xuat may tinh");
            System.out.println("8. Xuat phong thuc hanh");
            System.out.print("--> ");
            
            n = sc.nextInt();
            
            switch(n){
                case 1: 
                    addComputer();
                    break;
                case 2: 
                    addPhongThucHanh();
                    break;
                case 3:
                    SortTheoTenPhong();
                    break;
                case 4:
                    SortTheoSL();
                    break;
                case 5:
                    QuanLiMayTinh();
                    break;
                case 6: 
                    FindSomeProduct();
                    break;
                case 7: 
                    xuatMayTinh();
                    break;
                case 8: 
                    xuatPhongThucHanh();
                    break;
                default:
                    flag = false;
                    System.out.println("bye");
                    break;
            }
        }while (flag);
    }
    
    //-----------method tien xu ly------//
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

    
    
    //------------------------Method--------------------------------------------//
    public void renderComs(){
        Computer cp1 = new Computer("MSI-20", "China", 2020, "Core i5 Ram 8G");
        Computer cp2 = new Computer("Lenovo-18", "China", 2018, "Core i7 Ram 8G");
        Computer cp3 = new Computer("HP-17", "China", 2017, "Core i7 Ram 8G");
        Computer cp4 = new Computer("Mac-20", "China", 2020, "Core i7 Ram 8G");
        Computer cp5 = new Computer("Dell-16", "China", 2016, "Core i7 Ram 8G");
        computers.add(cp1);
        computers.add(cp2);
        computers.add(cp3);
        computers.add(cp4);
        computers.add(cp5);
    }
    public void renderRooms(){

        PhongThucHanh pth1 = new PhongThucHanh(1, "Ke toan", 50);
        PhongThucHanh pth2 = new PhongThucHanh(2, "Nhan Su", 10);

        rooms.add(pth1);
        rooms.add(pth2);
    }
    
    
    //-----------add Computer---------//
    public void addComputer(){
        System.out.println("So may tinh muon them: ");
        int n = isNum(); 
        for(int i = 0; i < n; i ++){             
            System.out.println("May Tinh So " + (i+1));
            
            System.out.println("Nhap vao ten may tinh");
            String t;
            while (true) {            
                t = sc.nextLine();
                boolean check = cmp.setTen(t);
                if(check){
                    break;
                }
            }

            System.out.println("Nhap vao xuat xu may tinh");
            String xx;
            while (true) {       
                xx = sc.nextLine();
                boolean check = cmp.setXuatXu(xx);
                if(check){
                    break;
                }
            }

            System.out.println("Nhap vao nam nhap may tinh");      
            int nn = isNum();sc.nextLine();

            System.out.println("Nhap vao cau hinh may tinh");
            String ch;
            while (true) {            
                ch = sc.nextLine();
                boolean check = cmp.setCauHinh(ch);
                if(check){
                    break;
                }
            }
            
            Computer cp = new Computer(t, xx, nn, ch);
            computers.add(cp);     
        }
    }
    
    public void xuatMayTinh(){
        for (int i = 0; i < computers.size(); i++) {
            System.out.println("May tinh so" + (i+1));
            System.out.println(computers.get(i).toString());
        }
    }    
    
    //-----------add Rooms---------//
    public void addPhongThucHanh(){
        System.out.println("So phong thuc hanh muon them: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i ++){
            System.out.println("Phong Thuc hanh So " + (i+1));
            
            System.out.println("Nhap vao ma phong");
            int mp = isNum();sc.nextLine();

            System.out.println("Nhap vao ten phong");
            String tp;
            while (true) {            
                tp = sc.nextLine();
                boolean check = phth.setTenPhong(tp);
                if(check){
                    break;
                }
            }

            System.out.println("Nhap vao so may");
            int sm = isNum();   
            PhongThucHanh pth = new PhongThucHanh(mp, tp, sm);
            rooms.add(pth);
        }
    }
    public void xuatPhongThucHanh(){
        for (int i = 0; i < rooms.size(); i++) {
            System.out.println("Phong Thuc Hanh so" + (i+1));
            System.out.println(rooms.get(i).toString());
        }
    }
    
    
    //-----------add Danh Sach may tinh---------//
    public void QuanLiMayTinh(){
        for(PhongThucHanh ph : rooms){
            System.out.println("Nhap vao loai may tinh");
            String lmt;
            while (true) {       
                lmt = sc.nextLine();
                boolean check = danhSachMayTinh.setLoaiMayTinh(lmt);
                if(check){
                    break;
                }
            }
            System.out.println("Nhap vao so luong may tinh");
            int slmt = isNum();sc.nextLine();
            
            System.out.println("Nhap vao tinh trang may tinh");
            String ttmt;
            while (true) {       
                ttmt = sc.nextLine();
                boolean check2 = danhSachMayTinh.setLoaiMayTinh(ttmt);
                if(check2){
                  
                    break;
                }
            }
            DanhSachMayTinh danhsach = new DanhSachMayTinh(ph.getMaPhong(), ph.getTenPhong(), ph.getSoMay(), lmt, slmt, ttmt);
            
            danhSachMayTinhs.add(danhsach);
        }
        
        for(DanhSachMayTinh danhsach : danhSachMayTinhs){
            System.out.println(danhsach.toString());
        }
    }
    
    //---------Sort Theo SL------------//
    public void SortTheoSL(){
        Collections.sort(danhSachMayTinhs, new SoLuongComparator());
        for(DanhSachMayTinh danhsach : danhSachMayTinhs) {
            System.out.println(danhsach);
        }
    }
   
    //---------Sort Theo Ten Phong------------//
    
    public void SortTheoTenPhong(){
        Collections.sort(danhSachMayTinhs, new NameComparator());
        for(DanhSachMayTinh danhsach : danhSachMayTinhs) {
            System.out.println(danhsach);
        }
    }
    
    public void FindSomeProduct(){
        System.out.println("Nhap San Pham Muon Tim: ");    
        String sanpham = sc.next();
        while (true) {            
            if(!sanpham.isEmpty()){
                break;
            }
            else{
                System.out.println("Nhap lai");
            }
        }
        for(DanhSachMayTinh danhsach : danhSachMayTinhs){
            if(danhsach.getLoaiMayTinh().equalsIgnoreCase(sanpham)){
                System.out.println(danhsach);
                break;
            }
            else{
                System.out.println("Can't find product");
                break;
            }
        }
    }
}
