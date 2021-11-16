package myproject.pttk.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tblcombo")
public class Combo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String ten;
	private String mota;
	private float gia;
	@Transient
	private List<MonAn> listMonAn;
	
	public Combo() {
	}

	public Combo(int id, String ten, String mota, float gia) {
		this.id = id;
		this.ten = ten;
		this.mota = mota;
		this.gia = gia;
	}

	public Combo(String ten, String mota, float gia) {
		this.ten = ten;
		this.mota = mota;
		this.gia = gia;
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

	public List<MonAn> getListMonAn() {
		return listMonAn;
	}

	public void setListMonAn(List<MonAn> listMonAn) {
		this.listMonAn = listMonAn;
	}
		
}
