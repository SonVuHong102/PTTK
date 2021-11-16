package myproject.pttk.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import myproject.pttk.model.MonAn;
import myproject.pttk.repository.MonAnRepository;

@Service
public class MonAnService {
	
	private final MonAnRepository monanRepository;
	
	public MonAnService(MonAnRepository monanRepository) {
		this.monanRepository = monanRepository;
	}
	
	public Iterable<MonAn> findAllMonAn() {
		return monanRepository.findAll();
	}
	
	public Iterable<MonAn> findMonAnByName(String ten) {
		return monanRepository.findAllByName(ten);
	}
	
	public Iterable<MonAn> findAllByComboId(int comboId) {
		return monanRepository.findAllByComboId(comboId);
	}
	
	public void addMonAn(MonAn monan) {
		ArrayList<MonAn> l = (ArrayList<MonAn>) monanRepository.findAllByName(monan.getTen());
		if(!l.isEmpty()) {
			throw new IllegalStateException("combo name existed");
		}
		monanRepository.save(monan);
	}
	
	@Transactional
	public void updateMonAn(MonAn monan) {
		MonAn m = monanRepository.findById(monan.getId()).orElseThrow(() -> new IllegalStateException("monan with id " + monan.getId() + " does not existed"));
		m.setGia(monan.getGia());
		m.setMota(monan.getMota());
		m.setTen(monan.getTen());
		m.setComboId(monan.getComboId());
	}
	
	public void deleteMonAn(int id) {
		monanRepository.findById(id).orElseThrow(() -> new IllegalStateException("monan with id " + id + " does not existed"));
		monanRepository.deleteById(id);
	}
}
