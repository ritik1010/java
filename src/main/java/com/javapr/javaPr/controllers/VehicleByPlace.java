//package com.javapr.javaPr.controllers;
//
//import com.javapr.javaPr.beans.*;
//import java.util.List;
//import java.util.*;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//@Controller
//public class VehicleByPlace {
//	@RequestMapping(method = RequestMethod.GET, value="/vehicle/getByPlace/{place}")
//	  @ResponseBody
//	  public List<Vehicle> getAllStudents(@PathVariable("place") String place) {
//		System.out.println("Gettin vehicle by place");
//	  List<Vehicle> vch=VehicleRegistration.getInstance().getVehicleRecords();
//	  List<Vehicle> vrep=new ArrayList<Vehicle>();
//	  for(Vehicle vehicle:vch) {
//		  if(vehicle.getVehicleOwnerAddress().contains(place)) {
//			  vrep.add(vehicle);
//		  }
//		  
//	  }
//	  return vrep;
//	  
//	  }
//
//}
//
