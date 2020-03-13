package accessmodifiers;

import java.util.ArrayList;
import java.util.List;

import accessmodifiers2.Voertuig;

public class Car extends Voertuig{
	
	private List<String> sensors = new ArrayList<>();
	
	String merk;
	int sensor64x;
	private int sensor789;
	public int sensor78954;
	public int sensor78955;
	public int sensor78956;
	public int sensor78957;
	public int sensor78959;
	public int sensor7895444;
	public int sensor7895458;
	public int sensor789544;
	public int sensor789548;
	public int sensor7895496;
	public int sensor7895487;
	public int sensor7895445;
	
	public Car(int maxspeed, String merk) {
		super(maxspeed);
		this.merk = merk;
	}
	
	public boolean isBandenSpanningOK() {
		if (sensor64x < 70) {
			return false;
		}
		if (maxspeed < 200 && sensor64x <80) {
			return false;
		}
		return checkHeatSensors();
		
	}

	boolean checkHeatSensors() {
		if (sensor789 > 795) {
			return false;
		}
		if (sensor78954 > 16) {
			return false;
		}
		return true;
	}

}
