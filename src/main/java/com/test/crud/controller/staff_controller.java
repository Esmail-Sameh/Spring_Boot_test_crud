 
 
package com.test.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.test.crud.model.StaffModel;
import com.test.crud.model.UserModel;

@Controller
public class staff_controller {

    @GetMapping("/staffdetials")
    public String getStaffDetials(Model model) {
        StaffModel myModel = new StaffModel(
            "Esmail Sameh" , 
            "Cairo" , 
            2500);
        model.addAttribute("staff",myModel);
        return "staff_detials";
    }

    @GetMapping("/userdata")
    public String getUserData(Model model) {
        UserModel userModel = new UserModel(
            1, 
            "Esmail", 
            "Sameh", 
            "Abdo", 
            "Software Engneer",
            "Esmail_Sameh2005@gmail.com", 
            40000);
        model.addAttribute("user", userModel);
        return "user_data";
    }

    
    
}