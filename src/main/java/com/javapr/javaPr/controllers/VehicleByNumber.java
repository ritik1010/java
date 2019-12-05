//package com.javapr.javaPr.controllers;
//
//import com.fasterxml.jackson.annotation.JsonFormat;
//import com.javapr.javaPr.beans.Vehicle;
//import com.javapr.javaPr.beans.VehicleRegistration;
//import com.javapr.javaPr.beans.VehicleRegistrationReply;
//
//import java.util.List;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class VehicleByNumber {
//	@JsonFormat(shape=JsonFormat.Shape.ARRAY)
//	 @RequestMapping(method = RequestMethod.GET, value="/vehicle/findByNumber/{vehicleNumber}")
//	  @ResponseBody
//	  public VehicleRegistrationReply getVehicleByNumber(@PathVariable("vehicleNumber") String vehicleNumber) {
//		vehicleNumber=vehicleNumber.replace('_', ' ');
//	  System.out.println("In get register by number"+vehicleNumber);
//	  	List<Vehicle> vch =VehicleRegistration.getInstance().getVehicleRecords();
//	  	for (Vehicle  vehicle: vch) {
//	  		System.out.println(vehicle.getVehicleNumber());
//			if(vehicle.getVehicleNumber().equals(vehicleNumber)) {
//				 VehicleRegistrationReply stdregreply = new VehicleRegistrationReply();           
//			        VehicleRegistration.getInstance().add(vehicle);
//			        //We are setting the below value just to reply a message back to the caller
//			        stdregreply.setVehicleName(vehicle.getVehicleName());
//			        stdregreply.setVehicleNumber(vehicle.getVehicleOwnerName());
//			        stdregreply.setVehicleRegistrationNumber(vehicle.getVehicleRegistrationNumber());
//			        stdregreply.setVehicleOwnerAadharCardNo(vehicle.getVehicleOwnerAadharCardNo());
//			        stdregreply.setvehicleBoughtOnYear(vehicle.getVehicleBoughtOnYear());
//			        stdregreply.setVehicleOwnerName(vehicle.getVehicleOwnerName());
//			        stdregreply.setVehicleColor(vehicle.getVehicleColor());
//			        stdregreply.setVehicleOwnerAdress(vehicle.getVehicleOwnerAddress());
//			        return stdregreply;
//			}
//		}
//	  	return new VehicleRegistrationReply();
//	       
//	}
//
//}
