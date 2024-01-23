package com.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Recruiter;

public interface RecruiterRepository extends JpaRepository<Recruiter,Integer>{

	Optional<Recruiter> findById(Long id);


}
