package com.stickmangame;

import android.content.Context;
import android.graphics.Canvas;

import com.mmm.animation.MMMAnimation;

public class PaintballGun {

	
	private Paintball [] paintball;
	private MMMAnimation anim;
	public double shot_angle;
	public static final double DEFAULT_ANGLE = 90.0;
	public int ammo_count;
	
	
	
	public static enum Direction {
		LEFT, RIGHT
	}
	
	public PaintballGun(int ammo_num, Context c, final float x_pos, final float y_pos) {
	
		anim = new MMMAnimation();
		anim.setSpriteSheet(c, R.drawable.pbgun, 3, 4); // TODO: calibrate the drawing of the sprite sheet position / angle update
		anim.setLocation(x_pos, y_pos);
		// load array with proper number of paintballs to shoot
		// in the correct color. The default angle for PaintballGun is 90 degrees
		ammo_count = ammo_num;
		shot_angle = DEFAULT_ANGLE;
		paintball = new Paintball[ammo_count];
	}
	
	/**
	 * Draw the updated PaintballGun.
	 * @param e
	 */
	public void draw(Canvas c) {
		//c.drawBitmap(bitmap, matrix, paint);
		anim.draw(c);
	}
	
	/**
	 * The move method takes a long for the amount of time the button was held and enum
	 * for the direction that the user moved on the button. The method returns a double
	 * for the angle in which the PaintballGun should move.
	 * @param dt
	 * @param d
	 * @return double
	 */
	public double move(final long dt, Direction d) {
		double angle = 0.0;
		// do the math here to determine the angle in which to point PaintballGun.
		
		
		return angle;
	}
	
	/**
	 * 
	 * @return boolean (true if shot was fired)
	 */
	public boolean shoot(){
		
		return true;
	}

}

