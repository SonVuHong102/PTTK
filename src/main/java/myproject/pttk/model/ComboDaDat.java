package myproject.pttk.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name = "tblcombodadat")
public class ComboDaDat {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private float gia;
	private int soluong;
	private float khuyenmai;
	private int comboId;
	private int bandadatId;
	
	@Transient
	private Combo combo;
	
	public ComboDaDat() {
		
	}
	
	public ComboDaDat(int id, float gia, int soluong, float khuyenmai, int comboId, int bandadatId) {
		this.id = id;
		this.gia = gia;
		this.soluong = soluong;
		this.khuyenmai = khuyenmai;
		this.comboId = comboId;
		this.bandadatId = bandadatId;
	}
	public ComboDaDat(float gia, int soluong, float khuyenmai, int comboId, int bandadatId) {
		this.gia = gia;
		this.soluong = soluong;
		this.khuyenmai = khuyenmai;
		this.comboId = comboId;
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
	public int getComboId() {
		return comboId;
	}
	public void setComboId(int comboId) {
		this.comboId = comboId;
	}
	public int getBandadatId() {
		return bandadatId;
	}
	public void setBandadatId(int bandadatId) {
		this.bandadatId = bandadatId;
	}
	public Combo getCombo() {
		return combo;
	}
	public void setCombo(Combo combo) {
		this.combo = combo;
	}
	
}
