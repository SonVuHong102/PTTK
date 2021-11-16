package myproject.pttk.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "tblban")
public class Ban {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private int soban;
	private float gia;
	private int songuoitoida;
	private String mota;
	private int nhahangId;
	
	public Ban() {
		
	}

	public Ban(int id, int soban, float gia, int songuoitoida, String mota, int nhahangId) {
		this.id = id;
		this.soban = soban;
		this.gia = gia;
		this.songuoitoida = songuoitoida;
		this.mota = mota;
		this.nhahangId = nhahangId;
	}

	public Ban(int soban, float gia, int songuoitoida, String mota, int nhahangId) {
		this.soban = soban;
		this.gia = gia;
		this.songuoitoida = songuoitoida;
		this.mota = mota;
		this.nhahangId = nhahangId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSoban() {
		return soban;
	}

	public void setSoban(int soban) {
		this.soban = soban;
	}

	public float getGia() {
		return gia;
	}

	public void setGia(float gia) {
		this.gia = gia;
	}

	public int getSonguoitoida() {
		return songuoitoida;
	}

	public void setSonguoitoida(int songuoitoida) {
		this.songuoitoida = songuoitoida;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public int getNhahangId() {
		return nhahangId;
	}

	public void setNhahangId(int nhahangId) {
		this.nhahangId = nhahangId;
	}
	
}
