package com.bigbass1997.evekey;

/**
 * Used to help simplify the picking out of Fonts through the Assets class.
 * 
 * @see Assets
 */
public class FID {
	
	public String name;
	public int size;
	
	public String id;
	
	/**
	 * FID. Stands for FontIdentification
	 * 
	 * @param name Name of the font
	 * @param size Size of the font
	 */
	public FID(String name, int size){
		this.name = name;
		this.size = size;
		
		id = name.concat(String.valueOf(size));
	}
}
