package fr.univrouen.cv24v1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.univrouen.cv24v1.model.TestCV;
import util.Fichier;

@RestController
public class GetController {
	
	@GetMapping("/resume")
	
	public String getListCVinXML() {
	return "Envoi de la liste des CV";
	}
	
	@GetMapping("/cvid")
	public String getCVinXML( 
		@RequestParam(value= "texte") String texte){
		return ("Detail du CV n"+texte);
	}
	
	@GetMapping("/test")
	public String getcvdetail(
		@RequestParam (value="id") int id,@RequestParam(value="titre") String texte) {
		return ("Test:\n"+"id:\n"+id+"titre:\n"+texte);
		
	}
	

	@GetMapping("/testfic")
	public String gettestfic() {
        Fichier fichier= new Fichier();
		return fichier.loadFileXML();
        
	}
	@RequestMapping(value="/testxml", produces=MediaType.APPLICATION_XML_VALUE)
	public @ResponseBody TestCV getXML() {
	TestCV cv = new TestCV("HAMILTON","Margaret","1969/07/21","Appollo11@nasa.us");
	return cv;
	
	}
	}
