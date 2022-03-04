package com.csci2020ppt.builder;

//Creating a Printer class with various attributes
public class Printer {
	private int ram;
	private int modelYear;
	private int printSpeed;
	
	private boolean isTouchScreen;
	private boolean isBluetoothOn;
	
	//Creating public getter methods for the above mentioned fields 
	public int getRam() {
		return ram;
	}
	public int getModelYear() {
		return modelYear;
	}
	public int getPrintSpeed() {
		return printSpeed;
	}
	public boolean isTouchScreen() {
		return isTouchScreen;
	}
	public boolean isBluetoothOn() {
		return isBluetoothOn;
	}
	
	/* Creating a private constructor where we are passing the argument 
	  as a builder object i.e ProjectBuilder */
	private Printer(PrinterBuilder builder) {
		this.ram = builder.ram;
		this.modelYear = builder.modelYear;
		this.printSpeed = builder.printSpeed;
		
		this.isTouchScreen = builder.isTouchScreen;
		this.isBluetoothOn = builder.isBluetoothOn; 
	}
	//creating internal static class and kept is as public
	public static class PrinterBuilder{
		//the mandatory fields (ram, modelYear,printSpeed) 
		private int ram;
		private int modelYear;
		private int printSpeed;
		
		//the optional methods
		private boolean isTouchScreen;
		private boolean isBluetoothOn;
		
		//creating a public constructor for the mandatory fields 
		public PrinterBuilder(int ram, int modelYear, int printSpeed) {
			super();
			this.ram = ram;
			this.modelYear = modelYear;
			this.printSpeed = printSpeed;
		}

		//creating setter methods for the optional class
		//note: the return type for the setter method is kept as PrinterBuilder instead of void
		
		public PrinterBuilder setTouchScreen(boolean isTouchScreen) {
			this.isTouchScreen = isTouchScreen;
			return this; /* returning current class instance "this" i.e. 
						    created object for the PrinterBuilder class */
		}		

		public PrinterBuilder setBluetoothOn(boolean isBluetoothOn) {
			this.isBluetoothOn = isBluetoothOn;
			return this;/* returning current class instance "this" i.e. 
			               created object for the PrinterBuilder class */
		}		
		
		//Finally, created a public builder class Printer that is going to return Printer instance
		public Printer build() {
			return new Printer(this);
			
		}		
		
		/* Note: To get a Printer Object we do not have any direct constructor in the printer class.
		 * To build a Printer object we have only one way and that is to call the build method
		 * This is 	Builder Design Pattern */		
				
	}
	@Override
	public String toString() {
		return "Printer [ram=" + ram + ", modelYear=" + modelYear + ", printSpeed=" + printSpeed + ", isTouchScreen="
				+ isTouchScreen + ", isBluetoothOn=" + isBluetoothOn + "]";
	}
	
}
