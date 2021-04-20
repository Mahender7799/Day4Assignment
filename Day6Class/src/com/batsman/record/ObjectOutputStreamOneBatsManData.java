package com.batsman.record;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamOneBatsManData {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		BatsManData bt1 = new BatsManData(101, "MSD", 150, 820, 6532641);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("records.dat"));
		oos.writeObject(bt1);
	}
}