package com.senacniteroi.blogpessoal.model;

import java.time.LocalDate;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.aot.generate.GenerationContext;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
 @Table(name="t_postagens")
 public class Postagem {
	 
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@NotBlank(message= "O atributo título é Obrigatótio!")
@Size(min = 5, max = 100, message = " O atributo título deve conter no mínimo 05 e no máximo 100 caracteres")
private String  titulo;

@NotBlank (message = " O atributo texto é Obrigátorio!")
@Size (min = 10, max = 1000, message = "O atribuo texto deve conter no mínimo 10 e no máximo 1000 caracteres")
private String Texto; 


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getTitulo() {
	return titulo;
}


public void setTitulo(String titulo) {
	this.titulo = titulo;
}


public String getTexto() {
	return Texto;
}


public void setTexto(String texto) {
	Texto = texto;
}


public LocalDate getData() {
	return data;
}


public void setData(LocalDate data) {
	this.data = data;
}


@UpdateTimestamp
private LocalDate data;
 }
 
 