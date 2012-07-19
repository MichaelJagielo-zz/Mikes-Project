package com.stickmangame;

import android.graphics.Rect;

import com.drawable.AbstractDrawableObject;
import com.drawable.DrawableObject;
import com.mmm.animation.MMMImage;

public class Dog extends AbstractDrawableObject {

	int x, y, z, scale;
	MMMImage img;
	
	double speed;
	// health field not used
	//int health;
	
	Point3D loc;
	
	// only the WALK & RUN will likely be used. Hitting dog will cause a penalty
	// to player, if dog gets hit, he just runs away.
	// perhaps this enum should be abstracted out and shared with Stickman 
	public enum expression {
		WALK, RUN, HIDE, SKATEBOARD;
	}
	
	
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getZ() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	public int getScale() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int compareTo(DrawableObject other) {
		// TODO Auto-generated method stub
		return 0;
	}
}
