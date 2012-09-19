package com.model;

public class Gear {
	public Gear(String camera, String lens, float price) {
		this.camera = camera;
		this.lens = lens;
		this.price = price;
	}
	String camera;
	String lens;
	float price;
	public String getCamera() {
		return camera;
	}
	public String getLens() {
		return lens;
	}
	public float getPrice() {
		return price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((camera == null) ? 0 : camera.hashCode());
		result = prime * result + ((lens == null) ? 0 : lens.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gear other = (Gear) obj;
		if (camera == null) {
			if (other.camera != null)
				return false;
		} else if (!camera.equals(other.camera))
			return false;
		return true;
	}
}
