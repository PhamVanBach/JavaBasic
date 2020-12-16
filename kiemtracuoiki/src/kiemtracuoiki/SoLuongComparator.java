/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kiemtracuoiki;

import java.util.Comparator;

/**
 *
 * @author bachp
 */
class SoLuongComparator implements Comparator<DanhSachMayTinh>{
    public int compare(DanhSachMayTinh cmp1, DanhSachMayTinh cmp2){
        if(cmp1.getSoLuong()< cmp2.getSoLuong()){
            return 0;
        }
        else if(cmp1.getSoLuong()< cmp2.getSoLuong()){
            return 1;
        }
        else return -1;
    }
}
