package com.csi_rscoe.csi_backend.Controllers.Public;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class Login {


    @PostMapping("/createAccount")
    void createAccount(){

        /*
        * name
        * email id {unique id}
        * username   (check that the username is available or not)
        * mobile no
        * Password
        * DOB
        *
        */


    }


    @PostMapping("/login")
  void login(){
/*
* email   (is email not exist redirect to create account)
* password
* */
  }

  @PostMapping("/forgetPass")
    void forgetPass(){

  }

  @PostMapping("/changePass")
    void changePass(){

  }


}


