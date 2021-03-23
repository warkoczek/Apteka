package pl.warkoczewski.apteka.Apteka.tabela;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.warkoczewski.apteka.Apteka.LekiFetcher;
import pl.warkoczewski.apteka.Apteka.model.Lek;

import java.net.URISyntaxException;
import java.util.List;
@Component
public class ListToArrayConverter {

    private final LekiFetcher lekiFetcher;

    public ListToArrayConverter(LekiFetcher lekiFetcher) {
        this.lekiFetcher = lekiFetcher;
    }

    public String[][] convertListToArray() throws URISyntaxException {
        List<Lek> leki = lekiFetcher.fetchLeki();
        String[][] array = leki.stream()
                .map(lek -> new String[]
                        {String.valueOf(lek.getId()), lek.getName(), String.valueOf(lek.getExpiresAt()), String.valueOf(lek.getAmount())}
                )
                .toArray(String[][]::new);
        return array;
    }
}
