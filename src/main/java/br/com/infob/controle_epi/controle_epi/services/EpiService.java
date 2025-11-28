package br.com.infob.controle_epi.controle_epi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infob.controle_epi.controle_epi.models.Epi;
import br.com.infob.controle_epi.controle_epi.repositories.EpiRepository;

@Service
public class EpiService {
    
    @Autowired
    public EpiRepository epiRepository;

    public long count() {
        return epiRepository.count();
    }

    public Epi salvar(Epi epi) {
        return epiRepository.save(epi);

    }
    
    public boolean delete(Integer id) {
        Epi epi = epiRepository.findById(id).get();
        if(epi != null) {
            epiRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Epi buscar(Integer id) {
        return epiRepository.findById(id).get();
    }

    public List<Epi> listar() {
        return epiRepository.findAll();
    }

    public Epi atualizar(Epi epi, Integer id) {
        Epi e = buscar(id);
        if (e != null) {
            epi.setId(id);
            return epiRepository.save(epi);
        }
        return null;

    }
}
