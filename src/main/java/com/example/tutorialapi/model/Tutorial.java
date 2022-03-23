package com.example.tutorialapi.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Entity
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Table(name = "test_table_liquebase")
public class Tutorial {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    @Column(name = "create_date")
    LocalDate creationDate;

    @Column(name = "update_date")
    LocalDate updateDate;

    public Tutorial(){}

    public Tutorial(String title, String description, boolean published){
        this.title = title;
        this.description = description;
        this.published = published;
        this.creationDate = LocalDate.parse(LocalDate.now()
                .format(DateTimeFormatter.ofPattern( "uuuu-MM-dd" , Locale.UK )));
        this.updateDate = LocalDate.parse(LocalDate.now()
                .format(DateTimeFormatter.ofPattern( "uuuu-MM-dd" , Locale.UK )));
    }


    @Override
    public String toString() {
        return "Tutorial{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", published=" + published +
                ", creationDate=" + creationDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
