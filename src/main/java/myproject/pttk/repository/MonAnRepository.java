package myproject.pttk.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import myproject.pttk.model.MonAn;

public interface MonAnRepository extends CrudRepository<MonAn, Integer> {
	
	@Query("SELECT m FROM MonAn m WHERE m.ten LIKE %?1%")
	public Iterable<MonAn> findAllByName(String ten);
	
	
	@Query("SELECT m FROM MonAn m WHERE m.comboId = ?1")
	public Iterable<MonAn> findAllByComboId(int comboId);
}
