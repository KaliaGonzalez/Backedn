package com.ofipensiones.usuraio_microservice.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(value = "usuario") 
@Getter 
@Setter 
@NoArgsConstructor
public class Usuario { 
    @Id
    private String id;
    private String name; 
    private String rol; 
    private String identificacion;
}
