package com.javapr.javaPr;
import com.javapr.javaPr.Vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


	@RepositoryRestResource(collectionResourceRel = "vehicle", path = "vehicle")
	public interface VehicleRepository extends CrudRepository<Vehicle, Integer>
	{List<Vehicle> findByName(String name);
	List<Vehicle> findByColor(String color);
	List<Vehicle> findByYear(String year);
	List<Vehicle> findByBelong(String belong);
	List<Vehicle> findByReg(String reg);
	List<Vehicle> findByOname(String oname);
	List<Vehicle> findByAddr(String addr);
	List<Vehicle> findByModel(String model);
	List<Vehicle> findByNumber(String number);
	
	
	

}
