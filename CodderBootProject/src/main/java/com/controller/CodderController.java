package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Codder;
import com.service.CodderManService;

@RestController
public class CodderController {

	@Autowired
	CodderManService codderManService;

	@PostMapping("/save")
	public Codder saveCodder(@RequestBody Codder cd) {
		return codderManService.addCoder(cd);
	}

	@GetMapping("/getOne/{id}")
	public Codder getCodder(@PathVariable("id") int id) {
		return codderManService.getCodderById(id);
	}

	@DeleteMapping("/delOneCodderById/{id}")
	public String deleteById(@PathVariable("id") int id) {

		return codderManService.deleteOneCodder(id);

	}

	@PutMapping("/update")
	public Codder updateCodder(@RequestBody Codder cd) {
		return codderManService.updateCodder(cd);

	}

}
