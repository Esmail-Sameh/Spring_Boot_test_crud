
package com.test.crud.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.test.crud.model.StaffModel;




@Controller
public class staff_controller {

    @GetMapping("/staffdetials")
    public String getStaffDetials(Model model) {
        StaffModel mymodel = new StaffModel("Esmail Sameh" , "Cairo" , 2500);
        
        model.addAttribute("staff",mymodel);
        return "staffdetials";
    }
    
}