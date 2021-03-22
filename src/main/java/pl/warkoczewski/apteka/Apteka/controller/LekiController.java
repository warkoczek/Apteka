package pl.warkoczewski.apteka.Apteka.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.warkoczewski.apteka.Apteka.model.Lek;
import pl.warkoczewski.apteka.Apteka.service.LekiService;

import java.util.List;

@RestController
public class LekiController {

    private final LekiService lekiService;

    public LekiController(LekiService lekiService) {
        this.lekiService = lekiService;
    }

    @GetMapping(value = "/wszystkieLeki", produces = "application/json")
    public ResponseEntity<List<Lek>> displayAllLek(){
        List<Lek> leki = lekiService.getLeki();
        return new ResponseEntity<>(leki, HttpStatus.OK);
    }
}
