package pl.warkoczewski.apteka.Apteka.repository;

import org.springframework.stereotype.Repository;
import pl.warkoczewski.apteka.Apteka.model.Lek;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class LekRepositoryImpl implements LekRepository {

    private List<Lek> leki;

    public LekRepositoryImpl() {
        leki = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        leki.add(new Lek(1l, "Apap", LocalDate.of(2021, 12, 12), 20l));
        leki.add(new Lek(2l, "Nurofen", LocalDate.of(2021, 12, 13), 30l));
        leki.add(new Lek(3l, "VitC", LocalDate.of(2030, 01, 01), 20l));
    }

    @Override
    public List<Lek> findAll() {
        return leki;
    }
}
