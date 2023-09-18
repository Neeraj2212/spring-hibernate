package com.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/show-form")
    public String showForm(Model mode) {

        Student theStudent = new Student();

        mode.addAttribute("student", theStudent);

        return "student-form";

    }

    @RequestMapping("/process-form")
    public String processForm(@ModelAttribute("student")Student theStudent){

        System.out.println("Full Name = " + theStudent.getFirstName() + " " + theStudent.getLastName());
        System.out.println("Student Country: "+ theStudent.getCountry());

        return "student-confirmation";
    }

}
