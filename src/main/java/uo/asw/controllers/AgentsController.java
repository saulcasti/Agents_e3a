package uo.asw.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import uo.asw.agents.util.LoaderMin;
import uo.asw.controllers.AgentsController;
import uo.asw.services.AgentsService;

import java.io.IOException;
import java.util.Map;

@RestController
public class AgentsController {

	@Autowired
	private AgentsService agentsService;

	@RequestMapping(value = "/user", method = RequestMethod.POST,
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<LoaderMin> getLoader(@RequestBody Map<String, Object> payload) throws IOException {
		//if(!payload.keySet().containsAll(Arrays.asList("login", "password"))){
		//	return new ResponseEntity<CitizenMin>(HttpStatus.BAD_REQUEST);
		//}

		String login, password, kind;
		login = (String) payload.get("login");
		password = (String) payload.get("password");
		kind = (String) payload.get("kind");
		LoaderMin c = agentsService.getAgentInfo(login, password, kind);
		if(c == null){
			return new ResponseEntity<LoaderMin>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<LoaderMin>(c, HttpStatus.OK);

	}
	
}