package com.telesco.demo.Controller;


/*import java.util.List;*/
import org.springframework.stereotype.Controller;
/*import org.springframework.stereotype.Controller;*/

import org.springframework.web.bind.annotation.RequestMapping;
/*import org.springframework.web.bind.annotation.RequestParam;*/

/*import org.springframework.web.servlet.ModelAndView;*/

@Controller
public class HomeController 
{

	
     @RequestMapping("/")    
	 public String home()
	 {
		 return "home.jsp";
	 }
    
     
	/*
	 * @RequestMapping("getAlien") public ModelAndView getAlien(@RequestParam int
	 * aid) { ModelAndView mv=new ModelAndView("showAlien.jsp"); Alien
	 * alien=repo.findById(aid).orElse(new Alien()); mv.addObject(alien); return mv;
	 * }
	 */    
    
     
}
