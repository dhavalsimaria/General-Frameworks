/**
 * 
 */
package com.dhaval.so;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author a611021
 *
 */
@Controller
public class AppController {

    @RequestMapping("/display")
    public String display(Model model) {
        model.addAttribute("now", "Test");
        return "index";
    }
}
