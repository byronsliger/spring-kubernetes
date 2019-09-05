package com.byron.sliger.demo.greeting;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;


public class Persona {
    private Long id;
    private String content;
    private List<Otro> otros;


    public List<Otro> getOtros() {
        return otros;
    }

    public void setOtros(List<Otro> otros) {
        this.otros = otros;
    }

    public Persona() {
    }

    public Persona(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
