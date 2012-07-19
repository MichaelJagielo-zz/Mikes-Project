package com.stickmangame;

import android.graphics.Color;

import com.drawable.AbstractDrawableObject;
import com.drawable.DrawableObject;
import com.mmm.animation.MMMImage;

public class Paintball extends AbstractDrawableObject {
	Color color;
	int x, y, z, scale;
	MMMImage img;
	
	public Paintball(MMMImage i, Color c) {
		color = c;
		img = i;
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
