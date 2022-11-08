package com.survey.survey.form.people;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Person")
public class People {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonAlias("question1")
    private String name;
    @JsonAlias("question2")
    private String email;
    @JsonAlias("question3")
    private String img;
    @JsonAlias("question4")
    private String income;
    @OneToMany
    private Set<Options> options;

    public People(Long id, String name, String email, String img, String income, Set<Options> options) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.img = img;
        this.income = income;
        this.options = options;
    }

    public People() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", img='" + img + '\'' +
                ", income='" + income + '\'' +
                ", options=" + options +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public Set<Options> getOptions() {
        return options;
    }

    public void setOptions(Set<Options> options) {
        this.options = options;
    }

}
