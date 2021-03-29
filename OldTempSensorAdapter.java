package itec3030.assignments.a2;
import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.TemperatureSensor;
import oldtempinc.drivers.OldTempSensor;


public class OldTempSensorAdapter implements TemperatureSensor {
	private OldTempSensor oldTempsensor = new OldTempSensor();
	private ControllerInterface controllerInterface;
	private String ID;
	private int temperature;
	private boolean enable;

	@Override
	public void disable() {
		// TODO disable the machine
		this.enable = false;
	}

	@Override
	public void enable() {
		// TODO enable the machine
		this.enable = true;
	}

	@Override
	public boolean enabled() {
		// TODO check the status of the devide whether it enable or disable
		return enable;
	}

	@Override
	public ControllerInterface getController() {
		// TODO return the controller interface of the device
		return this.controllerInterface;
	}

	@Override
	public String getID() {
		// TODO return ID of the device
		return this.ID;
	}

	@Override
	public void setController(ControllerInterface controllerInterface) {
		// TODO set the controller interface for the device
		this.controllerInterface = controllerInterface;
	}

	@Override
	public void setID(String id) {
		// TODO set device ID
		this.ID = id;
		
		
	}


	@Override
	public int getReading() {
		// TODO Auto-generated method stub
		this.temperature =  (int) this.oldTempsensor.getTemperature();
		return temperature;
	}

	@Override
	public void newTemperature(int temp) {
		// TODO Auto-generated method stub
		this.oldTempsensor.newTemperature(temp);

	}

}
