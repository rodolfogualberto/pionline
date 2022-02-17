package br.senai.pioonline.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan

public class Aluno {

    //@Id

    //@GeneratedValue(strategy=GenerationType.AUTO)

    private Integer id;

    private String name;

    private String email;

    

    public Integer getId() {

        return id;

    }

    public void setId(Integer id) {

        this.id = id;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public String getEmail() {

        return email;

    }

    public void setEmail(String email) {

        this.email = email;

    }

}
