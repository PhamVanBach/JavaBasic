/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author bachp
 */
public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist();
        
        System.out.println("Hinh chu nhat cd = 8 va cr = 4");
        Shape shape = new Rectangle(8,4);
        artist.drawShape(shape);
        System.out.println("\n Tam giac vuong co canh vuong = 20");
        shape = new RightTriangle(20);
        artist = new Artist();
        artist.drawShape(shape);              
    }    
}
