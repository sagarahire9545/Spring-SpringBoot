package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Codder;

@Repository
public interface CodderRepository extends JpaRepository<Codder, Integer>{

}
