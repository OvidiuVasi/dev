package com.dev.SpringBootMysql;

import com.dev.SpringBootMysql.model.Vehicule;
import com.dev.SpringBootMysql.repository.VehiculeRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMysqlApplicationTests {

//	@Autowired
//	VehiculeRepository vehiculeRepository;

//	@Test
//	public void testLoadVehicule(){
//		List<Vehicule> vehicule = (ArrayList<Vehicule>) vehiculeRepository.findAll();
//		assertEquals("Nu am primit tot", 10, vehicule.size());
//	}

//	@Before
//	public void setUp() throws Exception{
//		vehiculeRepository.deleteAll();
//		Vehicule vehicule = new Vehicule("Vw", "PH-15-VOV", "GPL");
//
//		Vehicule vehicule1 = new Vehicule("DACIA", "PH-15-VOV", "GPL");
//
//		Vehicule vehicule2 = new Vehicule("ROVER", "PH-15-VOV", "GPL");
//
//		vehiculeRepository.save(vehicule);
//		vehiculeRepository.save(vehicule1);
//		vehiculeRepository.save(vehicule2);
//	}
//
//	@Test
//	public void testFindVehicul() throws Exception {
//		List<Vehicule> vehicule = (List<Vehicule>) vehiculeRepository.findOne(1);
//		assertEquals("Pam Pam 1", 1, vehicule.size());
//		assertEquals("wrong wrong", 1, vehicule.get(0).getIdVehicule());
//	}

}
