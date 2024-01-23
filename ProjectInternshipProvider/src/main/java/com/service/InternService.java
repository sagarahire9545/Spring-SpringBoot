package com.service;

import java.util.List;
import java.util.Set;

import com.model.Interns;
import com.model.Recruiter;

public interface InternService {
	 List<Interns> getAllInterns();
	    Interns getInternById(Long id);
	    Interns createIntern(Interns intern);
	    Interns updateIntern(Long id, Interns intern);
	    boolean deleteIntern(Long id);
	
}
