package com.batsman.record;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamThreeBatsManData {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("records.dat"));
		BatsManData[] bArray = new BatsManData[3];
		for (int i = 0; i < 3; i++) {
			bArray[i] = (BatsManData) ois.readObject();
		}
		for (BatsManData b : bArray) {
			System.out.println(b);
		}
	}
}