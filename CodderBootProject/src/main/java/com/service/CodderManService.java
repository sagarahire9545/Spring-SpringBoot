package com.service;

import com.model.Codder;

public interface CodderManService {
	
	Codder addCoder(Codder cd);

	Codder getCodderById(int id);
	
	String deleteOneCodder(int id);

	Codder updateCodder(Codder cd);
}
