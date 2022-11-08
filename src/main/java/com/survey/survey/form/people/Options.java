package com.survey.survey.form.people;

import javax.persistence.*;

@Entity
@Table
public class Options {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int question_no;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "person_id", nullable = false)
    private People people;
    @Column(nullable = false)
    private int option;



    public Options(int id,
                   int question_no,
                   People people,
                   int option) {
        this.id = id;
        this.question_no = question_no;
        this.people = people;
        this.option = option;
    }

    public Options() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuestion_no() {
        return question_no;
    }

    public void setQuestion_no(int question_no) {
        this.question_no = question_no;
    }

    public People getPerson() {
        return people;
    }

    public void setPerson(People people) {
        this.people = people;
    }

    public int getOption() {
        return option;
    }

    public void setOption(int option) {
        this.option = option;
    }

    @Override
    public String toString() {
        return "Options{" +
                "id=" + id +
                ", question_no=" + question_no +
                ", person=" + people +
                ", option=" + option +
                '}';
    }
}
