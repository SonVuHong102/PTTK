package myproject.pttk.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import myproject.pttk.model.Combo;

public interface ComboRepository extends CrudRepository<Combo, Integer>{
	
	@Query("SELECT c FROM Combo c WHERE c.ten LIKE %?1%")
	public Iterable<Combo> findAllByName(String ten);
}
