package com.dev.SpringBootMysql.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "scoala_de_soferi")
public class Cursanti {

    @Id
    @Column(name = "id_cursant")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCursant;

    @Column(name = "nume_cursant")
    private String numeCursant;

    @Column(name = "prenume_cursant")
    private String prenumeCursant;

    @Column(name = "CNP_cursant")
    private String cnpCursant;

    @Column(name = "data_nastere")
    private Date dataNastere;

    public Cursanti(){

    }

    public Cursanti(String numeCursant, String prenumeCursant, String cnpCursant, Date dataNastere) {
        this.numeCursant = numeCursant;
        this.prenumeCursant = prenumeCursant;
        this.cnpCursant = cnpCursant;
        this.dataNastere = dataNastere;
    }

    public int getIdCursant() {
        return idCursant;
    }

    public void setIdCursant(int idCursant) {
        this.idCursant = idCursant;
    }

    public String getNumeCursant() {
        return numeCursant;
    }

    public void setNumeCursant(String numeCursant) {
        this.numeCursant = numeCursant;
    }

    public String getPrenumeCursant() {
        return prenumeCursant;
    }

    public void setPrenumeCursant(String prenumeCursant) {
        this.prenumeCursant = prenumeCursant;
    }

    public String getCnpCursant() {
        return cnpCursant;
    }

    public void setCnpCursant(String cnpCursant) {
        this.cnpCursant = cnpCursant;
    }

    public Date getDataNastere() {
        return dataNastere;
    }

    public void setDataNastere(Date dataNastere) {
        this.dataNastere = dataNastere;
    }
}
