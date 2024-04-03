package fr.univrouen.cv24v1.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.univrouen.cv24v1.model.TestCV;

@RestController
public class PostController {
	@RequestMapping(value = "/testpost", method = RequestMethod.POST,
			consumes = "application/xml")
			public String postTest(@RequestBody String flux) {
			return ("<result><response>Message reçu : </response>"
			+ flux + "</result>");
			}
	
}
