package com.example.tutorialapi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "tutorials")
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    public Tutorial(){}

    public Tutorial(String title, String description, boolean published){
        this.title = title;
        this.description = description;
        this.published = published;
    }


    @Override
    public String toString(){
        return "Tutorial [id="+ id +", title="+ title +"decr="+description+", published="+published+"]";
    }
}
