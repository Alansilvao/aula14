/*
*
* 
*
 */
package io.spring.aula.natan.repository;

import io.spring.aula.natan.entity.Perfil;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Alan Oliveira <alan.s.o@hotmail.com>
 */
public interface PerfilRepository extends MongoRepository<Perfil, String> {

    Perfil findByNome(String nome);

}
