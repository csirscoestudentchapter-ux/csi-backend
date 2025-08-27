package com.csi_rscoe.csi_backend.Controllers.Public;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class Announcement {

    @GetMapping("/announcement")
    void getAnnouncement(){

    }

}
