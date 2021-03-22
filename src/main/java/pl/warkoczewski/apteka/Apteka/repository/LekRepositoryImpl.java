package pl.warkoczewski.apteka.Apteka.repository;

import org.springframework.stereotype.Repository;
import pl.warkoczewski.apteka.Apteka.model.Lek;

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
        leki.add(new Lek(1l, "Apap"));
        leki.add(new Lek(2l, "Nurofen"));
        leki.add(new Lek(3l, "VitC"));

    }

    @Override
    public List<Lek> findAll() {
        return leki;
    }
}
