package com.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entities.Questions;


public interface QuestionsRepositories extends JpaRepository<Questions, Integer>{

    
}
