package sheridan.assignment1_woloszym.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import sheridan.assignment1_woloszym.domain.User;

@Controller
public class outputController {

    private final Logger logger = LoggerFactory.getLogger(outputController.class);

    @GetMapping("/Output")
    public String output(@Validated @ModelAttribute User user,
                         BindingResult bindingResult,
                         Model model) {
        logger.trace("output() is called");
        logger.debug("user = " + user);
        if(bindingResult.hasErrors()){
            return "Input";
        }
        model.addAttribute("user", user);

        return "Output";
    }
}