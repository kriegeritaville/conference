package com.kriegerations.conference.controller;

import com.kriegerations.conference.model.Registration;
//import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration")Registration registration){
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration")Registration registration,
                                  BindingResult result){
        System.out.println("name is: " + registration.getName() + ". and " + registration.getName().isEmpty() + " or " + registration.getName().isBlank());
        if(result.hasErrors()){
            System.out.println("There were errors.....");
            return "registration";
        }
        System.out.println("Success in post...." + registration.getName());
        return "redirect:registration";
    }


}
