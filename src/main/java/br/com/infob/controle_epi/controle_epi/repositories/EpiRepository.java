package br.com.infob.controle_epi.controle_epi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.infob.controle_epi.controle_epi.models.Epi;

@Repository
public interface EpiRepository extends JpaRepository<Epi, Integer> {

}