//package com.javapr.javaPr.controllers;
//import com.fasterxml.jackson.annotation.JsonFormat;
//
//import com.javapr.javaPr.beans.*;
//import java.util.List;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//@Controller
//public class VehicleRegistrationController {
//	@JsonFormat(shape=JsonFormat.Shape.ARRAY)
//	 @RequestMapping(method = RequestMethod.POST, value="/register/vehicle")
//	  @ResponseBody
//	  public VehicleRegistrationReply registerStudent(@RequestBody Vehicle vehicle) {
//	  System.out.println("In registerVehicle");
//	        VehicleRegistrationReply stdregreply = new VehicleRegistrationReply();           
//	        VehicleRegistration.getInstance().add(vehicle);
//	        //We are setting the below value just to reply a message back to the caller
//	        stdregreply.setVehicleName(vehicle.getVehicleName());
//	        stdregreply.setVehicleNumber(vehicle.getVehicleOwnerName());
//	        stdregreply.setVehicleRegistrationNumber(vehicle.getVehicleRegistrationNumber());
//	        stdregreply.setVehicleOwnerAadharCardNo(vehicle.getVehicleOwnerAadharCardNo());
//	        stdregreply.setvehicleBoughtOnYear(vehicle.getVehicleBoughtOnYear());
//	        stdregreply.setVehicleOwnerName(vehicle.getVehicleOwnerName());
//	        stdregreply.setVehicleColor(vehicle.getVehicleColor());
//	        stdregreply.setVehicleOwnerAdress(vehicle.getVehicleOwnerAddress());
//	        return stdregreply;
//	}
//
//}
