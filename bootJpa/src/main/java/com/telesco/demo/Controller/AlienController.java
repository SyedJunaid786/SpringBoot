package com.telesco.demo.Controller;
import java.util.List;
import java.util.Optional;

/*import java.util.List;*/
import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.stereotype.Controller;*/
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
/*import org.springframework.web.bind.annotation.RequestParam;*/
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/*import org.springframework.web.servlet.ModelAndView;*/
import com.telesco.demo.dao.AlienRepo;
import com.telesco.demo.model.Alien;

@RestController
public class AlienController
{
	@Autowired
	private AlienRepo repo;
	
    
     @PostMapping("alien")
	 public Alien addAlien(@RequestBody Alien alien)
	 {
	     repo.save(alien);
		 return alien;
	 }
     
	/*
	 * @RequestMapping("getAlien") public ModelAndView getAlien(@RequestParam int
	 * aid) { ModelAndView mv=new ModelAndView("showAlien.jsp"); Alien
	 * alien=repo.findById(aid).orElse(new Alien()); mv.addObject(alien); return mv;
	 * }
	 */    
     
     @RequestMapping("aliens")
     @ResponseBody
     public List<Alien> getAliens()
     {
    	 return repo.findAll();
     }
     
     @RequestMapping("aliens/{aid}")
     @ResponseBody
     public Optional<Alien> getAlien(@PathVariable("aid") int aid)
     {
    	 return repo.findById(aid);
     }
     
     @DeleteMapping("aliens/{aid}")
     public String deleteAlien(@PathVariable int aid)
     {
    	Alien a=repo.getOne(aid);
    	repo.delete(a);
    	return "Deleted"; 
     }
     
     
     @PutMapping("alien")
	 public Alien SaveOrUpdateAlien(@RequestBody Alien alien)
	 {
	     repo.save(alien);
		 return alien;
	 }
     
}
