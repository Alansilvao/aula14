/*
*
* 
*
 */
package io.spring.aula.natan.repository;

import io.spring.aula.natan.entity.Usuario;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Alan Oliveira <alan.s.o@hotmail.com>
 */
public interface UsuarioRepository extends MongoRepository<Usuario, String> {

    List<Usuario> findByNomeLikeIgnoreCase(String nome);
    
    Usuario findByEmail(String email);
}
