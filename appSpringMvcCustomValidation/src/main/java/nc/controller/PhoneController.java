package nc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import nc.model.PhoneModele;

@Controller
public class PhoneController {
	@GetMapping("/validatePhone")
    public String loadFormPage(Model m) {
        m.addAttribute("phoneModele", new PhoneModele());
        return "form";
    }
	
	@PostMapping("/addValidatePhone")
	public String submitForm(@Valid PhoneModele phoneModele, BindingResult result, Model m) {
		if(result.hasErrors()) {
			return "form";
		}
		m.addAttribute("message", "Téléphone : " + phoneModele.toString());
		    return "form";
	}  

}
