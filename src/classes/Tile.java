package classes;

import exceptions.*;
import java.util.*;

public class Tile {
	/*
	 Class for one of the 576 HOLY SHIT tiles
	 */
	
	ArrayList<String> tileTypes = new ArrayList<>(Arrays.asList(
			"air",
			"none",
			"north",
			"east",
			"south",
			"west",
			"northeast",
			"southeast",
			"southwest",
			"northwest",
			"northeastsouth",
			"eastsouthwest",
			"southwestnorth",
			"westnortheast",
			"all"
	));
	
	
	public int x;
	public int y;
	public String type;
	
	// Constructor
	public Tile(int startX, int startY, String startType) throws InvalidXException, InvalidYException, InvalidTypeException {
		// Validate input
		if (startX < 0 || startX > 31) {
			throw new InvalidXException();
		} else {
			x = startX;
		}
		
		if (startY < 0 || startY > 17) {
			throw new InvalidYException();
		} else {
			y =  startY;
		}
		
		if (!tileTypes.contains(startType)) {
			throw new InvalidTypeException();
		} else {
			type = startType;
		}
	}
	
	// Set Coords
	public void setCoords(int newX, int newY) {
		// Set the new values
		x = newX;
		y = newY;
	}
	
	// Set Type
	public void setType(String newType) {
		// Set new type
		type = newType;
	}
}
