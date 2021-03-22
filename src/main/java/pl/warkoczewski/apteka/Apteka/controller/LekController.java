package pl.warkoczewski.apteka.Apteka.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.warkoczewski.apteka.Apteka.model.Lek;
import pl.warkoczewski.apteka.Apteka.service.LekiService;

import java.util.List;

@Controller
public class LekController {

    private final LekiService lekiService;

    public LekController(LekiService lekiService) {
        this.lekiService = lekiService;
    }

    @GetMapping("/leki")
    public String displayLek(Model model){
        List<Lek> leki = lekiService.getLeki();
        model.addAttribute("leki", leki);
        return "leki";
    }
}
