package com.example.springtutor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller()
public class HomeController {
    @GetMapping("/home")
    public ModelAndView home(@RequestParam("name") String name){
//        HttpSession session = req.getSession();
//        String name = req.getParameter("name");
//        System.out.println(name);
//        session.setAttribute("name", name);
        System.out.println(name);
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.setViewName("index");
        return mv;
    }

    @PostMapping(value = "/register",
            consumes = "application/json"
    )
    public void register(HttpServletRequest req){
        System.out.println(req);
    }
}
