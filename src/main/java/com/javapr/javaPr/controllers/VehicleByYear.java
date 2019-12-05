//package com.javapr.javaPr.controllers;
//import com.javapr.javaPr.beans.*;
//
//import java.util.*;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//@Controller
//public class VehicleByYear {
//	@RequestMapping(method = RequestMethod.GET, value="/vehicle/getByYear/{year}")
//	  @ResponseBody
//	  public List<Vehicle> getAllStudents(@PathVariable("year") String year) {
//		System.out.println("Gettin vehicle by year");
//	  List<Vehicle> vch=VehicleRegistration.getInstance().getVehicleRecords();
//	  List<Vehicle> vrep=new ArrayList<Vehicle>();
//	  for(Vehicle vehicle:vch) {
//		  if(vehicle.getVehicleBoughtOnYear().contains(year)) {
//			  vrep.add(vehicle);
//		  }
//		  
//	  }
//	  return vrep;
//	  
//	  }
//
//
//
//}
