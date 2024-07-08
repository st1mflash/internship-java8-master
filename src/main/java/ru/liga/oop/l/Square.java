package ru.liga.oop.l;

class Square extends Rectangle {
	
	public Square() {
	}
	
	public void setWidth(int width) {
		this.width = width;
		this.height = width;
	}
	
	public void setHeight(int height) {
		this.height = height;
		this.width = height;
	}
	
}
