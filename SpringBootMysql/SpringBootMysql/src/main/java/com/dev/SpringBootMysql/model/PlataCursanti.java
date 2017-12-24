package com.dev.SpringBootMysql.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "scoala_de_soferi")
public class PlataCursanti {

    @Id
    @Column(name = "id_plata")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idPlata;

    @Column(name = "suma")
    private double suma;

    @Column(name = "data_platii")
    private Date dataPlatii;

    @Column(name = "nota_suplimentara")
    private String notaSuplimentara;

    @Column(name = "nr_ore")
    private int nrOre;

    public PlataCursanti(){

    }

    public PlataCursanti(double suma, Date dataPlatii, String notaSuplimentara, int nrOre) {
        this.suma = suma;
        this.dataPlatii = dataPlatii;
        this.notaSuplimentara = notaSuplimentara;
        this.nrOre = nrOre;
    }

    public int getIdPlata() {
        return idPlata;
    }

    public void setIdPlata(int idPlata) {
        this.idPlata = idPlata;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public Date getDataPlatii() {
        return dataPlatii;
    }

    public void setDataPlatii(Date dataPlatii) {
        this.dataPlatii = dataPlatii;
    }

    public String getNotaSuplimentara() {
        return notaSuplimentara;
    }

    public void setNotaSuplimentara(String notaSuplimentara) {
        this.notaSuplimentara = notaSuplimentara;
    }

    public int getNrOre() {
        return nrOre;
    }

    public void setNrOre(int nrOre) {
        this.nrOre = nrOre;
    }
}
