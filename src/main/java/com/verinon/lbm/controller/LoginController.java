package com.verinon.lbm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@RestController

public class LoginController
{
    

    @GetMapping("/userlogin")
    public String showLoginPage()
    {
        return "log in page";
    }
    
    @GetMapping("/home")
    public String showHomePage()
    {
        return "home";
    }

    @GetMapping("/about")
    public String logoutUser()
    {
        return "about page";
    }

    @GetMapping("/contactus")
    public String contactUsPage(ModelMap model)
    {
        return "contact us";
    }
}
