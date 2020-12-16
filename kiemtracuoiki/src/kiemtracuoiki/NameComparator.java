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
class NameComparator implements Comparator<DanhSachMayTinh> {
	public int compare(DanhSachMayTinh s1, DanhSachMayTinh s2) {
		return s1.getTenPhong().compareTo(s2.getTenPhong());
	}
}
