package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dao.CodderRepository;
import com.model.Codder;

@Service
public class CodderManServiceImpl implements CodderManService{

	@Autowired
	CodderRepository codderRepository;
	
	
	public Codder addCoder(Codder cd) {
		// TODO Auto-generated method stub
		return codderRepository.save(cd);
	}

	

	@Override
	public Codder getCodderById(int id) {
		// TODO Auto-generated method stub
		return codderRepository.findById(id).orElse(null);
	}



	@Override
	public String deleteOneCodder(int id) {
		// TODO Auto-generated method stub
		codderRepository.deleteById(id);
		return "Delete Record."+id;
	}



	@Override
	public Codder updateCodder(Codder cd) {
		// TODO Auto-generated method stub
		Codder existCodder= codderRepository.findById(cd.getId()).orElse(null);
		existCodder.setFirstName(cd.getFirstName());
		existCodder.setLastName(cd.getLastName());
		existCodder.setEmailId(cd.getEmailId());
		return codderRepository.save(existCodder);
        	
	}
	

}
