package com.spring.mvc.controller;

import com.spring.mvc.service.LottoService;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/lotto")
public class Lotto {
    
    @Autowired
    private LottoService lottoService;
    
    @RequestMapping("/get")
    public String get() {
        Set<Integer> lotto = lottoService.getLotto();
        return "lotto_page"; // <-- jsp 的檔案(可含子路徑)
    }
}