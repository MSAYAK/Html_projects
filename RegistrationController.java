package Controller;


import java.dao.RegistrationDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pozo.Registration;

public class RegistrationController {
	private RegistrationDao registrationDao;

	
	@Autowired
	public void setRegistrationDao(RegistrationDao registrationDao) {
		this.registrationDao = registrationDao;
	}
	
	@RequestMapping("/institute")
	public String save(@ModelAttribute("institute1")
	Registration r,BindingResult result,Model model)
			 {
		registrationDao.save(r);
		return "institute";
		
	}
	

}
