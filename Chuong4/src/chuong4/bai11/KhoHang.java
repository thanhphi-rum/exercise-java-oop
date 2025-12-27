/**
 * @description: TODO
 * @author: phibu
 * @version: 1.0
 * @created: Oct 9, 2025 3:04:43 PM
 */

package chuong4.bai11;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class KhoHang {
	private List<HangHoa> danhSach;
	
	
	public List<HangHoa> getDanhSach() {
		return danhSach;
	}

	public void setDanhSach(List<HangHoa> danhSach) {
		this.danhSach = danhSach;
	}

	public HangHoa them(HangHoa hang) {
		if(hang == null) return null;
		if(danhSach.contains(hang)) return null;
		danhSach.add(hang);
		return hang;
	}
	
	public HangHoa xoa(HangHoa hang) {
		for (int i = 0; i < danhSach.size(); i++) {
			return danhSach.remove(i);
		}
		return null;
	}
	
	public HangHoa capNhat(String ma, String ten, int soLuong, double donGia,
			LocalDate ngaySanXuat, LocalDate ngayHetHan, String nhaSanXuat) {
		for (int i = 0; i < danhSach.size(); i++) {
			if(danhSach.get(i).getMa().equals(ma) && danhSach.get(i) 
					instanceof HangThucPham hang) {
				hang.setTen(ten);
				hang.setSoLuong(soLuong);
				hang.setDonGia(donGia);
				hang.setNgaySanXuat(ngaySanXuat);
				hang.setNgayHetHan(ngayHetHan);
				hang.setNhaCungCap(nhaSanXuat);
			}
		}
		return null;
	}
	
	public HangHoa capNhat(String ma, String ten, int soLuong, double donGia,
			int baoHanh, double congSuat) {
		for (int i = 0; i < danhSach.size(); i++) {
			if(danhSach.get(i).getMa().equals(ma) && danhSach.get(i) 
					instanceof HangDienMay hang) {
				hang.setTen(ten);
				hang.setSoLuong(soLuong);
				hang.setDonGia(donGia);
				hang.setBaoHanh(baoHanh);
				hang.setCongSuat(congSuat);
			}
		}
		return null;
	}
	
	public HangHoa capNhat(String ma, String ten, int soLuong, double donGia,
			String nhaSanXuat, LocalDate ngayNhapKho) {
		for (int i = 0; i < danhSach.size(); i++) {
			if(danhSach.get(i).getMa().equals(ma) && danhSach.get(i) 
					instanceof HangSanhSu hang) {
				hang.setTen(ten);
				hang.setSoLuong(soLuong);
				hang.setDonGia(donGia);
				hang.setNhaSanXuat(nhaSanXuat);
				hang.setNgayNhapKho(ngayNhapKho);
			}
		}
		return null;
	}
	
	public HangHoa capNhat(String ma, String ten, int soLuong, double donGia) {
		for (int i = 0; i < danhSach.size(); i++) {
			if(danhSach.get(i).equals(ma)) {
				HangHoa hangHoa = danhSach.get(i);
				if(hangHoa instanceof HangThucPham hang) {
					hang.setTen(ten);
					hang.setSoLuong(soLuong);
					hang.setDonGia(donGia);
				} else if(hangHoa instanceof HangDienMay hang) {
					hang.setTen(ten);
					hang.setSoLuong(soLuong);
					hang.setDonGia(donGia);
				} else if(hangHoa instanceof HangSanhSu hang){
					hang.setTen(ten);
					hang.setSoLuong(soLuong);
					hang.setDonGia(donGia);
				} else {
					break;
				}
			}
		}
		return null;
	}
	
	public List<HangHoa> timKiem1(String text) {
		return danhSach.stream()
				.filter(hang -> hang.getTen().toLowerCase()
						.contains(text.toLowerCase()))
				.collect(Collectors.toList());
	}
	
	public List<HangHoa> timKiem2(int n) {
		return danhSach.stream()
				.filter(hang -> hang.getSoLuong() > n)
				.collect(Collectors.toList());
	}
	
	public Map<String, Set<HangHoa>> timKiem3() {
		return danhSach.stream()
				.collect(Collectors.groupingBy(
						hang -> hang.getClass().getSimpleName(), 
						Collectors.toSet()
						));
	}
	
	public Map<String, Set<HangHoa>> timKiem4() {
		return danhSach.stream()
				.collect(Collectors.groupingBy(
						hang -> hang.getClass().getSimpleName(), 
						Collectors.toCollection(
								() -> new TreeSet<>(Comparator.comparing(HangHoa::getTen)))
						));
	}
}

