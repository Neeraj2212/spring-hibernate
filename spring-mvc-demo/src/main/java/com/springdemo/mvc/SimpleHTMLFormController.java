package com.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello") // Hirarchichal mapping
public class SimpleHTMLFormController {

    // Controller method to show the form
    @RequestMapping(value = "/show-form", method = RequestMethod.GET)
    public String showForm() {
        return "simple-html-form";
    }

    // Controller method to process the form
    @RequestMapping(value = "/process-form", method = RequestMethod.GET)
    public String processFormString() {
        return "process-html-form";
    }

    // Controller to read form data and add data to the model
    @RequestMapping(value = "/process-form-2", method = RequestMethod.GET)
    public String shoutOut(HttpServletRequest request, Model model) {

        // Read data from the form
        String theName = request.getParameter("studentName");

        // Convert data to all caps
        theName.toUpperCase();

        // Create a Message
        String result = "Yo! " + theName;

        // Add Message to the model
        model.addAttribute("message", result);

        return "process-html-form";

    }

     // use of Requestparam annotation
    @RequestMapping(value = "/process-form-3", method = RequestMethod.GET)
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

        // Convert data to all caps
        theName.toUpperCase();

        // Create a Message
        String result = "Hello My Friend! " + theName;

        // Add Message to the model
        model.addAttribute("message", result);

        return "process-html-form";

    }
}
