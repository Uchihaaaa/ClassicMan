package ecommerce.com.classicman.controller;

import ecommerce.com.classicman.model.Product;
import ecommerce.com.classicman.servcie.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/admin/product")
    public ModelAndView product(){
        ModelAndView mv = new ModelAndView();
        List<Product> productList= productService.findAllProduct();
        mv.addObject("productList",productList);
        mv.setViewName("admin/product");
        return mv;
    }

    @GetMapping("/admin/add/product")
    public ModelAndView getProductForm(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin/productfrom");
        return mv;
    }

    @PostMapping("/admin/product")
    public ModelAndView createProduct(@Valid Product productForm, BindingResult bindingResult){
        ModelAndView mv = new ModelAndView();
        if(bindingResult.hasErrors()){
            mv.addObject("message","Failed");
            mv.setViewName("/admin/add/product");
            return mv;
        }
        try {
            productService.createNewProduct(productForm);
            System.out.println(productForm.getProductName());
            mv.addObject("message","Success");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        mv.setViewName("admin/product");
        return mv;
    }
}
