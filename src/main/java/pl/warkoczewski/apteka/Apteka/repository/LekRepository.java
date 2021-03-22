package pl.warkoczewski.apteka.Apteka.repository;

import pl.warkoczewski.apteka.Apteka.model.Lek;

import java.util.List;

public interface LekRepository {
    List<Lek> findAll();
}
