package ru.liga.oop.l;

class Rectangle {
	
	protected int width = 0;
	protected int height = 0;
	
	public Rectangle() {
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int getArea(){
	    return this.width * this.height;
	}
	
}