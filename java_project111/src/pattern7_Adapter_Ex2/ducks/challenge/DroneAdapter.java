package pattern7_Adapter_Ex2.ducks.challenge;

import pattern7_Adapter_Ex2.ducks.Duck;

public class DroneAdapter implements Duck {
	Drone drone;
 
	public DroneAdapter(Drone drone) {
		this.drone = drone;
	}
    
	public void quack() {
		drone.beep();
	}
  
	public void fly() {
		drone.spin_rotors();
		drone.take_off();
	}
}
