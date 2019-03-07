package ecommerce.com.classicman.controller;

import ecommerce.com.classicman.model.Product;
import ecommerce.com.classicman.servcie.CatagoryService;
import ecommerce.com.classicman.servcie.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CatagoryService catagoryService;

    @GetMapping("/")
    @ResponseBody
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView();
        List<Product> productList = productService.findAllProduct();
        mv.addObject("productList",productList);
        mv.setViewName("index");
        return mv;
    }

    @GetMapping("/about")
    public ModelAndView about(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("about");
        return mv;
    }

    @GetMapping("/blog")
    public ModelAndView blog(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("blog");
        return mv;
    }

    @GetMapping("/shop")
    public ModelAndView shop(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("shop");
        return mv;
    }

    @GetMapping("/shop-single")
    public ModelAndView shopSingle(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("shop-single");
        return mv;
    }

    @GetMapping("/contact")
    public ModelAndView contact(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("contact");
        return mv;
    }

    @GetMapping("/single")
    public ModelAndView single(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("single");
        return mv;
    }

    @GetMapping("/login")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/login");
        return mv;
    }

    @GetMapping("/admin")
    public ModelAndView admin(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/index");
        return mv;
    }

    @GetMapping("/admin/product")
    public ModelAndView product(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/product");
        return mv;
    }
}
