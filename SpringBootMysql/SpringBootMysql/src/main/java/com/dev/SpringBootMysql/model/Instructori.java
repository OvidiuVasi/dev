package com.dev.SpringBootMysql.model;

import javax.persistence.*;

@Entity
@Table(name = "scoala_de_soferi")
public class Instructori {

    @Id
    @Column(name = "id_instructor")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idInstructori;

    @Column(name = "nume_instructor")
    private String numeInstructor;

    @Column(name = "prenume_instructor")
    private String prenumeInstructor;

    @Column(name = "CNP")
    private String CnpInstructor;

    @Column(name = "localitate")
    private String localitate;

    public Instructori(){

    }

    public Instructori(String numeInstructor, String prenumeInstructor, String cnpInstructor, String localitate) {
        this.numeInstructor = numeInstructor;
        this.prenumeInstructor = prenumeInstructor;
        CnpInstructor = cnpInstructor;
        this.localitate = localitate;
    }

    public int getIdInstructori() {
        return idInstructori;
    }

    public void setIdInstructori(int idInstructori) {
        this.idInstructori = idInstructori;
    }

    public String getNumeInstructor() {
        return numeInstructor;
    }

    public void setNumeInstructor(String numeInstructor) {
        this.numeInstructor = numeInstructor;
    }

    public String getPrenumeInstructor() {
        return prenumeInstructor;
    }

    public void setPrenumeInstructor(String prenumeInstructor) {
        this.prenumeInstructor = prenumeInstructor;
    }

    public String getCnpInstructor() {
        return CnpInstructor;
    }

    public void setCnpInstructor(String cnpInstructor) {
        CnpInstructor = cnpInstructor;
    }

    public String getLocalitate() {
        return localitate;
    }

    public void setLocalitate(String localitate) {
        this.localitate = localitate;
    }
}
