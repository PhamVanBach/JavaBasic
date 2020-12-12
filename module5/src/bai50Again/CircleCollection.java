/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai50Again;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bachp
 * arr la mang chua tat ca  cac hinh tron
 */
public class CircleCollection {
    ArrayList<Circle> arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    
    public void randomCircle(){
        System.out.println("Nhap vao so hinh tron: ");
        int max = 99;
        int min = 2;
        int soHinhTron = sc.nextInt();
        for(int i = 0; i <  soHinhTron; i++){
            int radius = rd.nextInt(max - min + 1) + min;
            Circle circl = new Circle(radius);  
            arr.add(circl);
        }
    }
    
    public void addCircle(){
        System.out.println("Nhap vao ban kinh hinh tron: ");
        int radius = sc.nextInt();
        Circle circl = new Circle(radius);  
        arr.add(circl);
    }
    
    public int getSizeOfCircle(){
        return arr.size();
    }
    
    public Circle getCircleAt(int position){
        return arr.get(position);
    }
    
    public void setCircleToArr(Circle circle, int position){   
        arr.set(position, circle);
    }
    
    public double SumOfAreaCircle(){
        double sum =0;
        for(int i = 0; i < arr.size(); i++){
            sum += arr.get(i).getArea();           
        }
        return sum;
    }
    
    public void MaxAreaValue(){
        double maxArea = 0.0;
        for(Circle circle : arr){
            double area = circle.getArea();
            
            if(maxArea < area){
                maxArea = area;
            }
        }
        System.out.println("dien tich lon nhat la: " + maxArea);
    }
    public void MinCircleValue(){
        int viTri_minArea = 0;
        for(Circle circle : arr){
            double area = circle.getArea();
            if(area < arr.get(viTri_minArea).getArea()){
                viTri_minArea = arr.indexOf(circle);
            }
        } 
        System.out.println(arr.get(viTri_minArea));
    }
    public void outputArr(){
        for(int i = 0; i < arr.size(); i++){
            System.out.println("Hinh tron so " + (i+1));
            System.out.println(arr.get(i).toString());
            System.out.println("--------------------");
        }
    }

    @Override
    public String toString() {
        return "Size of Circle= " + this.getSizeOfCircle(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
