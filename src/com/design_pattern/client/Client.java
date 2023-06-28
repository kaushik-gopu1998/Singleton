package com.design_pattern.client;
import com.design_pattern.singleton.ChoclateBoilerEnumVersion;

public class Client {
	public static void main(String[] args) {
		ChoclateBoilerEnumVersion singleton = ChoclateBoilerEnumVersion.UNIQUE_INSTANCE;
		System.out.println("is full ->"+singleton.isEmpty());
		singleton.fill();
		System.out.println("is full ->"+singleton.isEmpty());
		System.out.println("boil..");
		singleton.boil();
	}
}
