package com.example.socialmediaapp.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {
    @GetMapping("/v1/Person")
    public PersonV1 getFirstVersionOfPerson(){
        return new PersonV1("Bob Charlie");
    }
    @GetMapping("/v2/Person")
    public PersonV2 getSecondVersionOfPerson(){
        return new PersonV2(new Name("Bob","Charlie"));
    }
    @GetMapping(path="/Person", params = "version=1")
    public PersonV1 getFirstVersionOfPersonRequestParam(){
        return new PersonV1("Bob Charlie");
    }
    @GetMapping(path="/Person", params = "version=2")
    public PersonV2 getSecondVersionOfPersonRequestParam(){
        return new PersonV2(new Name("Bob","Charlie"));
    }
    @GetMapping(path="/Person/header", headers = "X-API-VERSION=1")
    public PersonV1 getFirstVersionOfPersonRequestHeader(){
        return new PersonV1("Bob Charlie");
    }
    @GetMapping(path="/Person/header", headers = "X-API-VERSION=2")
    public PersonV2 getSecondVersionOfPersonRequestHeader(){
        return new PersonV2(new Name("Bob","Charlie"));
    }
}
