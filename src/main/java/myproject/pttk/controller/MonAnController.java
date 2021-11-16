package myproject.pttk.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import myproject.pttk.model.MonAn;
import myproject.pttk.service.MonAnService;

@RestController
@RequestMapping("/api/monan")
public class MonAnController {
	
	private final MonAnService monanService;
	
	public MonAnController(MonAnService monanService) {
		this.monanService = monanService;
	}

	@GetMapping("/listMonAn")
	public @ResponseBody Iterable<MonAn> danhsachMonAn() {
		return monanService.findAllMonAn();
	}
	
	@GetMapping("/findMonAn")
	public @ResponseBody Iterable<MonAn> timMonAn(@RequestParam String ten) {
		return monanService.findMonAnByName(ten);
	}
	
	@GetMapping("/findAllByComboId")
	public @ResponseBody Iterable<MonAn> timMonAnTheoComboId(@RequestParam int comboId) {
		return monanService.findAllByComboId(comboId);
	}
	
	@PostMapping("/addMonAn")
	public void themMonAn(@RequestBody MonAn monan) {
		monanService.addMonAn(monan);
	};
	
	@PutMapping("/updateMonAn")
	public void suaMonAn(@RequestBody MonAn monan) {
		monanService.updateMonAn(monan);
	}
	
	@DeleteMapping("/deleteMonAn") 
	public void xoaMonAn(@RequestBody int id) {
		monanService.deleteMonAn(id);
	}
}
