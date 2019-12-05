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
//public class VehicleByColor {
//	@RequestMapping(method = RequestMethod.GET, value="/vehicle/getByColor/{color}")
//	  @ResponseBody
//	  public List<Vehicle> getAllStudents(@PathVariable("color") String color) {
//		System.out.println("Gettin vehicle by color");
//	  List<Vehicle> vch=VehicleRegistration.getInstance().getVehicleRecords();
//	  List<Vehicle> vrep=new ArrayList<Vehicle>();
//	  for(Vehicle vehicle:vch) {
//		  if(vehicle.getVehicleColor().contains(color)) {
//			  vrep.add(vehicle);
//		  }
//		  
//	  }
//	  return vrep;
//	  
//	  }
//}
