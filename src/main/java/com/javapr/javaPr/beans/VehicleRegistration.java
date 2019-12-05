//package com.javapr.javaPr.beans;
//import java.util.ArrayList;
//import java.util.List;
//
//public class VehicleRegistration {
//private List<Vehicle> vehicleRecords;
//private static VehicleRegistration vchregd=null;
//private  VehicleRegistration() {
//	vehicleRecords = new ArrayList<Vehicle>();}
//	public static VehicleRegistration getInstance() {
//		 if(vchregd == null) {
//             vchregd = new VehicleRegistration();
//             return vchregd;
//           }
//           else {
//               return vchregd;
//           }
//	}
//	public void add(Vehicle vch) {
//	vehicleRecords.add(vch);	}
//	public String upDateVehicle(Vehicle vch) {
//		for(int i=0; i<vehicleRecords.size(); i++)
//        {
//            Vehicle vchn = vehicleRecords.get(i);
//            if(vchn.getVehicleNumber().equals(vchn.getVehicleNumber())) {
//              vehicleRecords.set(i, vchn);//update the new record
//              return "Update successful";
//            }
//        }
//return "Update un-successful";
//	}
//	public String deleteVehicle(String vehicleNumber) {
//		for(int i=0; i<vehicleRecords.size(); i++)
//		        {
//		            Vehicle stdn = vehicleRecords.get(i);
//		            if(stdn.getVehicleNumber().equals(vehicleNumber)){
//		              vehicleRecords.remove(i);//update the new record
//		              return "Delete successful";
//		            }
//		        }
//		return "Delete un-successful";
//		}
//	public List<Vehicle> getVehicleRecords() {
//	    return vehicleRecords;
//	    }
//
//	
//}
//	
//
