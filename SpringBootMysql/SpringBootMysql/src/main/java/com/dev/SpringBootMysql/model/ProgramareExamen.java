package com.dev.SpringBootMysql.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "scoala_de_soferi")
public class ProgramareExamen {

    @Id
    @Column(name = "id_programare")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idProgramare;

    @Column(name = "data_sala")
    private Date dataSala;

    @Column(name = "data_oras")
    private Date dataOras;


    private Cursanti cursanti;

    public ProgramareExamen(){

    }

    public ProgramareExamen(Date dataSala, Date dataOras) {
        this.dataSala = dataSala;
        this.dataOras = dataOras;
    }

    public int getIdProgramare() {
        return idProgramare;
    }

    public void setIdProgramare(int idProgramare) {
        this.idProgramare = idProgramare;
    }

    public Date getDataSala() {
        return dataSala;
    }

    public void setDataSala(Date dataSala) {
        this.dataSala = dataSala;
    }

    public Date getDataOras() {
        return dataOras;
    }

    public void setDataOras(Date dataOras) {
        this.dataOras = dataOras;
    }
}
