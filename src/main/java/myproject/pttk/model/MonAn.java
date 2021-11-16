package myproject.pttk.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblmonan")
public class MonAn {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String ten;
	private String mota;
	private float gia;
	private int comboId;
	
	public MonAn() {
		
	}

	public MonAn(int id, String ten, String mota, float gia, int comboId) {
		this.id = id;
		this.ten = ten;
		this.mota = mota;
		this.gia = gia;
		this.comboId = comboId;
	}

	public MonAn(String ten, String mota, float gia, int comboId) {
		this.ten = ten;
		this.mota = mota;
		this.gia = gia;
		this.comboId = comboId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

	public int getComboId() {
		return comboId;
	}

	public void setComboId(int comboId) {
		this.comboId = comboId;
	}
	
}
