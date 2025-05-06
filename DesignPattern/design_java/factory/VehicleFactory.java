package factory;

class VehicleFactor {
			  
		   public Vehicle getVehicle(String vehicleType){
		      if(vehicleType == null){
		         return null;
		      }		
		      if(vehicleType.equalsIgnoreCase("Two Wheeler")){
		         return new TwoWheeler();
		         
		      } else if(vehicleType.equalsIgnoreCase("Three Wheeler")){
		         return new ThreeWheeler();
		         
		      } else if(vehicleType.equalsIgnoreCase("Four Wheeler")){
		         return new FourWheeler();
		      }
		      
		      return null;
		   }
		}


public class VehicleFactory {

	   public static void main(String[] args) {
	      VehicleFactor vf= new VehicleFactor();

	      
	      Vehicle v1 = vf.getVehicle("Two Wheeler");

	     
	      v1.maximumSpeed();

	      
	      Vehicle v2 = vf.getVehicle("Three Wheeler");

	     
	      v2.maximumSpeed();

	     
	      Vehicle v3 = vf.getVehicle("Four Wheeler");

	      
	      v3.maximumSpeed();
	   }
	}







