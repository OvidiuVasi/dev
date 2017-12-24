package com.dev.SpringBootMysql.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "scoala_de_soferi")
public class Vehicule implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_vehicule")
    private int idVehicule;

    @Column(name = "marca")
    private String marca;

    @Column(name = "nr_inmatriculare")
    private String nrInmatriculare;

    @Column(name = "tip_combustibil")
    private String tipCombustibil;

//    @OneToMany
//    private Cursanti cursanti;

    public Vehicule() {

    }

    public Vehicule(String marca, String nrInmatriculare, String tipCombustibil) {
        this.marca = marca;
        this.nrInmatriculare = nrInmatriculare;
        this.tipCombustibil = tipCombustibil;
    }

    public int getIdVehicule() {
        return idVehicule;
    }

    public void setIdVehicule(int idVehicule) {
        this.idVehicule = idVehicule;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNrInmatriculare() {
        return nrInmatriculare;
    }

    public void setNrInmatriculare(String nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    public String getTipCombustibil() {
        return tipCombustibil;
    }

    public void setTipCombustibil(String tipCombustibil) {
        this.tipCombustibil = tipCombustibil;
    }


//    public Cursanti getCursanti() {
//        return cursanti;
//    }
//
//    public void setCursanti(Cursanti cursanti) {
//        this.cursanti = cursanti;
//    }
}
