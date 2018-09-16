package com.tuacy.microservice.framework.user.manage.controller;

import com.tuacy.microservice.framework.user.manage.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app/")
public class UserController {

    @Value("${version}")
    private String version;

    private IUserService userService;

    @Autowired
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "getUser", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity getUser() {
        return ResponseEntity.ok(version);
    }
}
