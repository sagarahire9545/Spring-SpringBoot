package com.service;

import java.util.List;

import com.model.Recruiter;

public interface RecruiterService {
    List<Recruiter> getAllRecruiters();
    Recruiter getRecruiterById(Long id);
    Recruiter createRecruiter(Recruiter recruiter);
    Recruiter updateRecruiter(Long id, Recruiter recruiter);
    boolean deleteRecruiter(Long id);
}
