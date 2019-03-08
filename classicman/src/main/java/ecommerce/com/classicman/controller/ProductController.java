package ecommerce.com.classicman.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ProductController {

    @GetMapping("/admin/add/product")
    public ModelAndView createProduct(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/productfrom");
        return mv;
    }
}
