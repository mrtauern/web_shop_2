package com.database.web_shop.controllers;

import com.database.web_shop.models.Products;
import com.database.web_shop.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Controller
public class CustomerController {
    public CustomerController(){

    }

    Logger log = Logger.getLogger(CustomerController.class.getName());

    @Autowired
    ProductsService productsService;

    @GetMapping("/")
    public String index(Model model){
        log.info("index called");

        return "index";
    }

    @GetMapping("/getProductList")
    public String getProductList(Model model){
        log.info("getProductList called");

        return "redirect:/getProductList/1";
    }

    @GetMapping("/getProductList/{page_no}")
    public String getProductList(@PathVariable("page_no") int page_no, Model model){
        log.info("getProductList called");

        List<Products> products = productsService.getProductList(10, page_no);
        model.addAttribute("products", products);

        return "get_product_list";
    }
}
