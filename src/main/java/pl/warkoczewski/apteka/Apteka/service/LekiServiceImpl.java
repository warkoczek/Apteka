package pl.warkoczewski.apteka.Apteka.service;

import org.springframework.stereotype.Service;
import pl.warkoczewski.apteka.Apteka.model.Lek;
import pl.warkoczewski.apteka.Apteka.repository.LekRepository;

import java.util.List;
@Service
public class LekiServiceImpl implements  LekiService {

    private final LekRepository lekRepository;

    public LekiServiceImpl(LekRepository lekRepository) {
        this.lekRepository = lekRepository;
    }

    @Override
    public List<Lek> getLeki() {
        return lekRepository.findAll();
    }
}
