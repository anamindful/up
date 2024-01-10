package org.greencoding.TravelUP.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.greencoding.TravelUP.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HomeController {

    @Autowired
    AuthenticationController authenticationController;
    @GetMapping("/")
    public String home(HttpServletRequest request, Model model)  {
        HttpSession session = request.getSession();
        User user = authenticationController.getUserFromSession(session);
//        model.addAttribute("loggedIn", session.getAttribute("user") != null);
        model.addAttribute("authUser", user);
        return "home";
    }


//    @GetMapping("login")
//    public String login(){
//        return "login";
//    }

    @GetMapping("addreview")
    public String addreview(){
        return "addreview";
    }

    @GetMapping("reviews")
    public String reviews(){
        return "reviews";
    }

    @GetMapping("submitedreview")
    public String submitedreview(){
        return "submitedreview";
    }

//    @GetMapping("createaccount")
//    public String createaccount(){
//        return "createaccount";
//    }


}
