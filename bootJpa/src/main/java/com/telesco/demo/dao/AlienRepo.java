package com.telesco.demo.dao;

/*import java.util.List;*/

import org.springframework.data.jpa.repository.JpaRepository;
/*import org.springframework.data.jpa.repository.Query;*/
import com.telesco.demo.model.Alien;


public interface AlienRepo extends JpaRepository<Alien,Integer>
{
	/*
	 * List<Alien> findByTech(String tech); List<Alien> findByName(String name);
	 * List<Alien> findById(int id);
	 */
	/*
	 *  List<Alien> findbyTech(String tech);
	 *  List<Alien> findbyAidGreaterThan(int aid);
	 * 
	 * @Query("from Alien where tech=?1 order by aname") List<Alien>
	 * findbyTechSorted(String tech);
	 */
}
