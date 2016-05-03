package com.example.controller;

import com.example.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by daehan on 2016. 5. 3..
 */
@Controller
public class HomeController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("comments", commentService.getAllComments());
        return "home";
    }
}
