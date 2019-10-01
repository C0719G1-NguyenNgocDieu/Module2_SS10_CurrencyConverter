package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControlServlet {
    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @PostMapping("/converter")
    public String convert(@RequestParam Long usd, Model model) {
        Long result = usd * 23000;
        model.addAttribute("result",result);
        return "convert";
    }

}
