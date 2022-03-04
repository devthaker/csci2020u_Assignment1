package com.csci2020ppt.builder.client;

import org.w3c.dom.ls.LSOutput;

import com.csci2020ppt.builder.Printer;

public class ClientTest { 
	
	public static void main(String[] args) {
		Printer HPLazerJetPro =  new Printer.PrinterBuilder(512, 2019, 38).setTouchScreen(false).setBluetoothOn(true).build();
		System.out.println("Printer Configuration: "+ HPLazerJetPro);
		
		Printer LexmarkC34 = new Printer.PrinterBuilder(256, 2020, 26).setTouchScreen(true).setBluetoothOn(true).build();
		System.out.println("Printer Configuration: "+ LexmarkC34);
		
		Printer EpsonXP7100 = new Printer.PrinterBuilder(516, 2020, 16).setTouchScreen(false).setBluetoothOn(true).build();
		System.out.println("Printer Configuration: "+ EpsonXP7100);
		
	}
	
	
	
}
