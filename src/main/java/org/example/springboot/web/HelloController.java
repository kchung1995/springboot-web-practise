package org.example.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//컨트롤러를 JSON을 반환하는 컨트롤러로 만들어 준다.
//@ResponseBody를 각 메소드마다 선언하던 것을 한번에 사용할 수 있게 해준다고 생각하면 된다.
@RestController

public class HelloController {

    //HTTP Method인 Get의 요청을 받을 수 있는 API를 만들어 준다.
    //예전에는 @RequestMapping으로 사용되었다.
    @GetMapping("/hello")
    public String hello() {
    return "hello";
    }
}

