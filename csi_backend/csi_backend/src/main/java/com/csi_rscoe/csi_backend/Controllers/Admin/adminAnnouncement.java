package com.csi_rscoe.csi_backend.Controllers.Admin;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class adminAnnouncement {

    @PostMapping("/announcement")
    String postAnnouncement(){
return "Announcement is created";
    }


    @PutMapping("/announcement")
     void updateAnnouncement(){

    }

    @DeleteMapping("/announcement")
    void deleteAnnouncement(){

    }


}
