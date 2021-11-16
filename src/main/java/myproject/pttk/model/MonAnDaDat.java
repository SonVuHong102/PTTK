package myproject.pttk.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name = "tblmonandadat")
public class MonAnDaDat {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private float gia;
	private int soluong;
	private float khuyenmai;
	private int monanId;
	private int bandadatId;
	
	@Transient
	private MonAn monan;
	
	public MonAnDaDat() {
		
	}
	
	public MonAnDaDat(int id, float gia, int soluong, float khuyenmai, int monanId, int bandadatId) {
		this.id = id;
		this.gia = gia;
		this.soluong = soluong;
		this.khuyenmai = khuyenmai;
		this.monanId = monanId;
		this.bandadatId = bandadatId;
	}
	public MonAnDaDat(float gia, int soluong, float khuyenmai, int monanId, int bandadatId) {
		this.gia = gia;
		this.soluong = soluong;
		this.khuyenmai = khuyenmai;
		this.monanId = monanId;
		this.bandadatId = bandadatId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getGia() {
		return gia;
	}
	public void setGia(float gia) {
		this.gia = gia;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public float getKhuyenmai() {
		return khuyenmai;
	}
	public void setKhuyenmai(float khuyenmai) {
		this.khuyenmai = khuyenmai;
	}
	public int getMonAnId() {
		return monanId;
	}
	public void setMonAnId(int MonAnId) {
		this.monanId = MonAnId;
	}
	public int getBandadatId() {
		return bandadatId;
	}
	public void setBandadatId(int bandadatId) {
		this.bandadatId = bandadatId;
	}
	public MonAn getMonAn() {
		return monan;
	}
	public void setMonAn(MonAn monan) {
		this.monan = monan;
	}
	
}
