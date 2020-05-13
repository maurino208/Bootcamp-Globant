package helloworld.api;

import helloworld.model.helloWorldResponse;
import helloworld.model.RequestBody;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello/world")
    public helloWorldResponse sayHi(@RequestParam(required = false , name = "name") String name){
        if(name==null){
            return new helloWorldResponse("Hello World");
        }
        return new helloWorldResponse("Hello World, my name is: " + name);
    }

    @PostMapping(path = "/hello/world", consumes = "application/json")
    public helloWorldResponse postHi(@org.springframework.web.bind.annotation.RequestBody RequestBody body){
        return new helloWorldResponse(body.getMessage() + body.getName());
    }
}
