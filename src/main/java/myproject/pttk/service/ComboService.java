package myproject.pttk.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import myproject.pttk.model.Combo;
import myproject.pttk.model.MonAn;
import myproject.pttk.repository.ComboRepository;
import myproject.pttk.repository.MonAnRepository;

@Service
public class ComboService {
	
	private final ComboRepository comboRepository;
	private final MonAnRepository monanRepository;
	
	public ComboService(ComboRepository comboRepository,MonAnRepository monanRepository) {
		this.comboRepository = comboRepository;
		this.monanRepository = monanRepository;
	}
	
	public Iterable<Combo> findAllCombo() {
		Iterable<Combo> list =  comboRepository.findAll();
		for(Combo c : list) {
			c.setListMonAn((List<MonAn>) monanRepository.findAllByComboId(c.getId()));
		}
		return list;
	}
	
	public Iterable<Combo> findComboByName(String ten) {
		Iterable<Combo> list = comboRepository.findAllByName(ten);
		for(Combo c : list) {
			c.setListMonAn((List<MonAn>) monanRepository.findAllByComboId(c.getId()));
		}
		return list;
	}
	
	public void addCombo(Combo combo) {
		ArrayList<Combo> l = (ArrayList<Combo>) comboRepository.findAllByName(combo.getTen());
		if(!l.isEmpty()) {
			throw new IllegalStateException("combo name existed");
		}
		comboRepository.save(combo);
	}
	
	@Transactional
	public void updateCombo(Combo combo) {
		Combo c = comboRepository.findById(combo.getId()).orElseThrow(() -> new IllegalStateException("combo with id " + combo.getId() + " does not existed"));
		c.setTen(combo.getTen());
		c.setMota(combo.getMota());
		c.setGia(combo.getGia());
		c.setListMonAn(combo.getListMonAn());
	}
	
	public void deleteCombo(int id) {
		comboRepository.findById(id).orElseThrow(() -> new IllegalStateException("combo with id " + id + " does not existed"));
		comboRepository.deleteById(id);
	}
}
