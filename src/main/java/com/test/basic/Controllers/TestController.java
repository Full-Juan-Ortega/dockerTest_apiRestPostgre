package com.test.basic.Controllers;


import com.test.basic.Entities.Test;
import com.test.basic.Services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*Testing Controller for ensure correctly working */

@RestController
public class TestController {
    @Autowired
    TestService testService;

    @GetMapping("/test/get")
    public String simpleGetTest() {
        return "Greetings from Spring Boot asdasd!";
    }

    @GetMapping("/test/get-path/{randomParam}")
    public String getPath(@PathVariable("randomParam") String entryTest) {
        return "getUrlParamTest : " +entryTest;
    }

    @PutMapping("/test/put/{randomParam}")
    public String putTest (@PathVariable("randomParam") String entryTest){
        return "putTest : " + entryTest;
    }

    @PostMapping("/test/post")
    public String postTest (@RequestBody Test entryTest){

        return "postRequestBodyTests : " + testService.save(entryTest);
    }

    @GetMapping("/test/getAll")
    public List<Test> getAll (){
        return testService.getAll();
    }

}
