package org.example.springboot.web;

import org.example.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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


    @GetMapping("/hello/dto")
    //RequestParam은 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션이다.
    //외부에서 name이란 이름으로 넘긴 파라미터를 메소드 파라미터 name에 저장한다.
    public HelloResponseDto helloDto(@RequestParam("name") String name,
        @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
        }

}

