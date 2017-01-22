package com.blotus.goldthree;

import com.blotus.goldthree.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/1/18.
 */
@Controller
@RequestMapping(value = "/")
public class ContactController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}
