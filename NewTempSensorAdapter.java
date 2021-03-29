package itec3030.assignments.a2;
import itec3030.smarthome.standards.ControllerInterface;
import itec3030.smarthome.standards.TemperatureSensor;
import newtemp.NewTempSensor.NewTempSensorDriver;
import newtemp.NewTempSensor.Observer;

public class NewTempSensorAdapter implements AbstractNewTempSensorAdapter, TemperatureSensor, Observer {
	
	private NewTempSensorDriver newTempSensorDriver;
	private String name;
	private ControllerInterface controllerInterface;
	private int temperature;
	private boolean enable;
	
	
	public NewTempSensorAdapter() {
		// TODO Auto-generated constructor stub
		newTempSensorDriver = new NewTempSensorDriver();
		newTempSensorDriver.registerObserver(this);
	}
	@Override
	public NewTempSensorDriver getAdatptee() {
		// TODO Auto-generated method stub
		return this.newTempSensorDriver;
	}

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
		// TODO Auto-generated method stub
		return this.enable;
	}

	@Override
	public ControllerInterface getController() {
		// TODO Auto-generated method stub
		return this.controllerInterface;
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setController(ControllerInterface controllerInterface) {
		// TODO Auto-generated method stub
		this.controllerInterface = controllerInterface;
	}

	@Override
	public void setID(String ID) {
		// TODO Auto-generated method stub
		this.name = ID;
	}

	@Override
	public int getReading() {
		// TODO Auto-generated method stub

		return this.temperature;
	}

	@Override
	public void newTemperature(int temperature) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		System.out.println( "Sensor (" + this.name + ") receiving new temperature: " + this.getReading());
	}
	@Override
	public void update(int temperature) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		System.out.println( "Sensor (" + this.name + ") receiving new temperature: " + this.getReading());
		
	}

}
