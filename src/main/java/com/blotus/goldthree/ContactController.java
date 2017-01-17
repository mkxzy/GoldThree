package com.blotus.goldthree;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/1/18.
 */
@Controller
@RequestMapping("/")
public class ContactController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}
