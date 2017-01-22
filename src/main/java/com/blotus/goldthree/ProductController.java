package com.blotus.goldthree;

import com.blotus.goldthree.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/22.
 */
@RestController
public class ProductController {

    @RequestMapping(value = "/products", method = RequestMethod.GET, produces = "application/json")
    public List<Product> getProducts(){
        List<Product> list = new ArrayList<Product>();
        Product p = new Product();
        p.setId(1);
        p.setName("abd");
        list.add(p);
        return list;
    }
}
