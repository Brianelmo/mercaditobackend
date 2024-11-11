package com.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "options")
public class Options {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer questionId;
    private String option_text;
    private Integer next_question_id;
    private Boolean is_final_answer;
    private String answer_text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuestion_id() {
        return questionId;
    }

    public void setQuestion_id(Integer question_id) {
        this.questionId = question_id;
    }

    public String getOption_text() {
        return option_text;
    }

    public void setOption_text(String option_text) {
        this.option_text = option_text;
    }

    public Integer getNext_question_id() {
        return next_question_id;
    }

    public void setNext_question_id(Integer next_question_id) {
        this.next_question_id = next_question_id;
    }

    public Boolean getIs_final_answer() {
        return is_final_answer;
    }

    public void setIs_final_answer(Boolean is_final_answer) {
        this.is_final_answer = is_final_answer;
    }

    public String getAnswer_text() {
        return answer_text;
    }

    public void setAnswer_text(String answer_text) {
        this.answer_text = answer_text;
    }

}
