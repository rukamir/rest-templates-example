package com.resttemplates.resttemplates.controllers;

import com.resttemplates.resttemplates.Models.MJResponseModel;
import com.resttemplates.resttemplates.Models.PersonModel;
import com.resttemplates.resttemplates.services.MyJson;
import com.resttemplates.resttemplates.services.ZenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class MyController {

    private final ZenService zenService;
    private final MyJson myJson;

    @Autowired
    public MyController(ZenService zenService, MyJson myJson) {
        this.zenService = zenService;
        this.myJson = myJson;
    }


    @GetMapping("/zen")
    String test() {
        return this.zenService.getMessage();
    }

    @PostMapping("/json")
    MJResponseModel createJSON(@RequestBody PersonModel person) {
        return myJson.saveJSON(person);
    }

    @PostMapping("/json/{first}/{last}/{gender}")
    MJResponseModel createJson() {

    }


}
// https://api.myjson.com/bins/1eyyzx