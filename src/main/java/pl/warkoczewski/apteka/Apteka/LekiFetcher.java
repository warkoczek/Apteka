package pl.warkoczewski.apteka.Apteka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.warkoczewski.apteka.Apteka.model.Lek;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
@Service
@Slf4j
public class LekiFetcher {

    private static final String LEKI_URL = "http://localhost:8080/wszystkieLeki";
    @EventListener(ApplicationEvent.class)
    public List<Lek> fetchLeki() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        Lek[] leki = restTemplate.getForObject(LEKI_URL, Lek[].class);
        assert leki != null;
        List<Lek> lekiList = Arrays.asList(leki);
        lekiList.forEach(lek -> System.out.println(lek.toString()));
        return lekiList;
    }


}
