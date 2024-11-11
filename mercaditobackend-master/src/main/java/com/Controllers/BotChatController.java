package com.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Entities.Options;
import com.Entities.Questions;
import com.Repositories.OptionsRepositorie;
import com.Repositories.QuestionsRepositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/bot")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE })
public class BotChatController {

    @Autowired
    private QuestionsRepositories questionsRepositories;    
    
    @Autowired
    private OptionsRepositorie optionsRepositorie;

    public void questionController(QuestionsRepositories questionsRepositories) {
        this.questionsRepositories = questionsRepositories;
    }

    @GetMapping("/question")
    public List<Questions> getQuestion() {
        return questionsRepositories.findAll();
    }
    @GetMapping("/question/{id}")
    public Optional<Questions> getQuestionId(@PathVariable Integer id) {
        return questionsRepositories.findById(id);
    }

    @GetMapping("/{questionId}/options")
    public List<Options> getOptionsList(@PathVariable Integer questionId) {
        return optionsRepositorie.findByQuestionId(questionId);
    }
    


}
