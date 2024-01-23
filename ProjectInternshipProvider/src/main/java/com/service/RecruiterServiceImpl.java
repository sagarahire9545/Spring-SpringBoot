package com.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.RecruiterRepository;
import com.model.Recruiter;

import java.util.List;

@Service
public class RecruiterServiceImpl implements RecruiterService {

    private final RecruiterRepository recruiterRepository;

    @Autowired
    public RecruiterServiceImpl(RecruiterRepository recruiterRepository) {
        this.recruiterRepository = recruiterRepository;
    }

    @Override
    public List<Recruiter> getAllRecruiters() {
        return recruiterRepository.findAll();
    }

    @Override
    public Recruiter getRecruiterById(Long id) {
        return recruiterRepository.findById(id).orElse(null);
    }

    @Override
    public Recruiter createRecruiter(Recruiter recruiter) {
        return recruiterRepository.save(recruiter);
    }

    @Override
    public Recruiter updateRecruiter(Long id, Recruiter recruiter) {
        Recruiter existingRecruiter = recruiterRepository.findById(id).orElse(null);
        if (existingRecruiter != null) {
            existingRecruiter.setRecName(recruiter.getRecName());
           
            existingRecruiter.setEmail(recruiter.getEmail());
            existingRecruiter.setCompany(recruiter.getCompany());
            return recruiterRepository.save(existingRecruiter);
        }
        return null;
    }

    @Override
    public boolean deleteRecruiter(Long id) {
        Recruiter existingRecruiter = recruiterRepository.findById(id).orElse(null);
        if (existingRecruiter != null) {
            recruiterRepository.delete(existingRecruiter);
            return true;
        }
        return false;
    }
}
