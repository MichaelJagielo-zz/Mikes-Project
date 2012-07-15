package com.stickmangame;

public class PaintballGun {

	double shot_angle;
	private Paintball [] paintball;
	public int ammo_count;
	
	public void setPaintball(Paintball [] paintball) {
		this.paintball = paintball;
	}
	public Paintball [] getPaintball() {
		return paintball;
	}
	
}
