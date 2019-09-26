package com.example.invitation.controller;


import com.example.invitation.InvitationApplication;
import com.example.invitation.model.Description;
import com.example.invitation.model.Invitation;
import com.example.invitation.repository.InvitationRepository;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class InvitationController {

    private MongoTemplate mongoTemplate;

    private InvitationRepository repository;


    public InvitationController(MongoTemplate mongoTemplate, InvitationRepository repository) {
        this.mongoTemplate = mongoTemplate;
        this.repository =repository;
    }



    @GetMapping("/all")
    public String show(Model model){
      List<Invitation> invitations= this.mongoTemplate.findAll(Invitation.class);
        model.addAttribute("invitations",invitations);
      return "showtable";
    }

    @GetMapping("/showform")
    public String showform(Model model){

        model.addAttribute("invitation",new Invitation());
        model.addAttribute("dprice",new Description());
        return "formgroup/showform";
    }

    @PostMapping("/showform")
    public String processform(Invitation invitation){

        this.mongoTemplate.save(invitation);
        return "redirect:/all";

    }


}
