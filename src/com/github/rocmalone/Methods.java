package com.github.rocmalone;

public class Methods {
	public int random(int min, int max) {
		int randNum = min + (int)(Math.random() * ((max - min) + 1));
		return randNum;
	}
}
