package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("The desktopsize is 32 inch");
	}

	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.computerModel();
		obj.desktopSize();
	}
}
