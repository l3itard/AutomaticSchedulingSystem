package org.AutomaticSchedulingSystem.controller;

import org.AutomaticSchedulingSystem.model.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class ProjectController {
    @RequestMapping(method = RequestMethod.GET)
    public String newRequest(ModelMap model) {
        Request request = new Request();
        model.addAttribute("request", request);
        return "request";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String saveRequest(@Valid Request request, BindingResult result, ModelMap model) {
        if (result.hasErrors())
            return "request";
        model.addAttribute("success", "Your data successfully updated for requestId " + request.getRequestId());
        return "success";
    }

    @ModelAttribute("disciplines")
    public List<String> initializeDisciplines() {
        List<String> disciplines = new ArrayList<>();
        disciplines.add("Maths");
        disciplines.add("Geography");
        disciplines.add("Physics");
        disciplines.add("Chemistry");
        disciplines.add("Biology");
        return disciplines;
    }
}
