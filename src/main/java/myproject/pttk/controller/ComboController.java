package myproject.pttk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import myproject.pttk.model.Combo;
import myproject.pttk.service.ComboService;

@RestController
@RequestMapping("/api/combo")
public class ComboController {
	
	@Autowired
	private ComboService comboService;
	
	public ComboController(ComboService comboService) {
		this.comboService = comboService;
	}

	@GetMapping("/listCombo")
	public @ResponseBody Iterable<Combo> danhsachCombo() {
		return comboService.findAllCombo();
	}
	
	@GetMapping("/findCombo")
	public @ResponseBody Iterable<Combo> timCombo(@RequestParam String ten) {
		return comboService.findComboByName(ten);
	}
	
	@PutMapping("/updateCombo")
	public void suaCombo(@RequestBody Combo combo) {
		comboService.updateCombo(combo);
	}
	
	@DeleteMapping("/deleteMonAn") 
	public void xoaMonAn(@RequestBody int id) {
		comboService.deleteCombo(id);
	}
}
