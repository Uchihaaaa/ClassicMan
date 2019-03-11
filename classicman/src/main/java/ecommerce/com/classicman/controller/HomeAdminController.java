package ecommerce.com.classicman.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeAdminController {

    @GetMapping("/admin/icons")
    public ModelAndView icons(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/icons");
        return mv;
    }

}
