package com.bojesenmark.thymeleafDemo.controller;

import com.bojesenmark.thymeleafDemo.model.Thing;
import com.bojesenmark.thymeleafDemo.service.ThingDAO;
import com.bojesenmark.thymeleafDemo.serviceimpl.ThingDAOImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private ThingDAO thingDAO;

    @GetMapping("/")
    public String showIndex(Model model) {
        thingDAO = new ThingDAOImpl();
        List<Thing> list = thingDAO.getAllThings();
        model.addAttribute("list", list);
        return "index";
    }
}
