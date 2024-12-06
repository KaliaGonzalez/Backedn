package com.ofipensiones.usuraio_microservice.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ofipensiones.usuraio_microservice.Entity.Usuario;
import com.ofipensiones.usuraio_microservice.Repository.UsuarioRepository;

@RestController 
@RequestMapping("/api")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;  

    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario>getAllUsuarios(){  
        return usuarioRepository.findAll();
    } 


    @PostMapping 
    @ResponseStatus(HttpStatus.OK)
    public void createUsuario(@RequestBody Usuario usuario){ 
        usuarioRepository.save(usuario);
    }
}
