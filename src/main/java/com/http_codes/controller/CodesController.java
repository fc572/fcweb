package com.http_codes.controller;


import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.http_codes.logic.Codes;
import com.http_codes.logic.RispostaHttpStatus;


@Controller
public class CodesController {

    private Codes codes = new Codes();
    private RispostaHttpStatus rispostaHttpStatus = new RispostaHttpStatus();

    @GetMapping("/codes")
    public String codes(@RequestParam(value = "code") String code, Model model) {
        String message = codes.workOutMeaningOfCode(code);
        model.addAttribute("message", message);
        model.addAttribute("code", code);
        return "codeDisplayPage";
    }

    @GetMapping("/codeswithheaders")
    public ResponseEntity<String> codesWithHeaders(@RequestParam(value="codestatus") String codestatus){
        return rispostaHttpStatus.responseEntity(codestatus);
    }
    
    @GetMapping("/pagewithheaders")
    public String all(@RequestParam(value="codestatus") String codestatus, @RequestHeader Map<String, String> headers,  Model model) {

        String mykey, myvalue;

        for (Map.Entry<String, String> header : headers.entrySet()) {

            mykey = header.getKey().replace('-', '_');
            myvalue = header.getValue().replace('-', '_');

            model.addAttribute(mykey, myvalue);

        }
       
        return "headerDisplayPage";
    }
}