package br.com.infob.controle_epi.controle_epi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.infob.controle_epi.controle_epi.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    @Query(value="SELECT u FROM Usuario u WHERE u.email = :email", nativeQuery=true)
    Usuario findByEmail(String email);

}
