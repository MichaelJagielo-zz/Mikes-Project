package com.drawable;

public interface DrawableObject {

	
	public int getX();
	
	public int getY();
	
	public int getZ();
	
	public void draw();
	
	public int getScale();

	int compareTo(DrawableObject other);
		
	
}
