package com.drawable;

import android.content.Context;


public abstract class AbstractDrawableObject implements DrawableObject,
Comparable<DrawableObject>{
	
	private int z;
	
	private Context context;
	
	public void draw (Context mContext, int x, int y, int z, int scale) {
		// draw....
	}
	
	public int compareTo(DrawableObject other) {
		if (this.z < other.getZ()) 
			return -1;
		
		else if (this.z == other.getZ()) 
			return 0;
		
		else 
			return 1;
		
	}
	
	// Override HashCode method as well?



}
