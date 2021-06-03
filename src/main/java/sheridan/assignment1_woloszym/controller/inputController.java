package sheridan.assignment1_woloszym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sheridan.assignment1_woloszym.domain.User;

@Controller
public class inputController {
    @GetMapping("/Input")
    public String input(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "Input";
    }
}