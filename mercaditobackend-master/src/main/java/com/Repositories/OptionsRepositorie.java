package com.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Entities.Options;

public interface OptionsRepositorie extends JpaRepository<Options, Integer> {

    List<Options> findByQuestionId(Integer questionId);

}
