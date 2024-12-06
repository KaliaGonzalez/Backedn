package com.ofipensiones.usuraio_microservice.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ofipensiones.usuraio_microservice.Entity.Usuario;
@Repository
public interface UsuarioRepository extends MongoRepository<Usuario,String> { 
    
}
