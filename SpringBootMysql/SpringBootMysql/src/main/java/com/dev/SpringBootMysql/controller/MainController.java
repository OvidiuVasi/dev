package com.dev.SpringBootMysql.controller;

import com.dev.SpringBootMysql.model.*;
import com.dev.SpringBootMysql.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequestMapping("/rest/api")
@RestController
public class MainController {

    @Autowired
    private VehiculeRepository vehiculeRepository;

    @Autowired
    private InstructoriRepository instructoriRepository;

    @Autowired
    private CursantiRepository cursantiRepository;

    @Autowired
    private ProgramareExamenRepository programareExamenRepository;

    @Autowired
    private PlataCursantiRepository plataCursantiRepository;

    @GetMapping(value = "/all/vehicule")
    public List<Vehicule> getVehicule(){
        return vehiculeRepository.findAll();
    }

    @GetMapping(value = "/all/instructori")
    public List<Instructori> getInstructori(){ return instructoriRepository.findAll(); }

    @GetMapping(value = "/all/cursanti")
    public List<Cursanti> getCursanti(){ return cursantiRepository.findAll(); }

    @GetMapping(value = "/all/programari")
    public List<ProgramareExamen> getProgramari() { return programareExamenRepository.findAll(); }

    @GetMapping(value = "/all/plata")
    public List<PlataCursanti> getPlata(){ return plataCursantiRepository.findAll(); }

    @GetMapping(value = "/update/{id_vehicul}")
    public List<Vehicule> update(@PathVariable final int idVehicul){
        Vehicule vehicule = new Vehicule();
        vehicule.setIdVehicule(200);
        vehicule.setMarca("BLABLA");
        vehicule.setNrInmatriculare("IL-01-MDN");
        vehicule.setTipCombustibil("GPL");

        vehiculeRepository.save(vehicule);
        return vehiculeRepository.findAll();
    }

//    @PostMapping(value = "/post/vehicul")
//    public List<Vehicule> vehiculeSubmit(@RequestBody final Vehicule vehicule){
//        vehiculeRepository.save(vehicule);
//        return vehiculeRepository.findAll();
//    }
}
