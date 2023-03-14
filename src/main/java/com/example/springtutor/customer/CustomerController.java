package com.example.springtutor.customer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
    @PostMapping("customer")
    public ModelAndView page(@RequestParam("name") String name, @RequestParam("age") String age, @RequestParam("gender")String gender, ModelMap modelMap){
        ModelAndView mv = new ModelAndView();
        modelMap.put("name", name);
        modelMap.put("age", age);
        modelMap.put("gender", gender);
        mv.setViewName("ViewCustomer");
        return mv;
    }

}
