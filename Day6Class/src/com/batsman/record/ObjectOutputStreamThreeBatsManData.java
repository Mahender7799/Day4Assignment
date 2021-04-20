package com.batsman.record;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamThreeBatsManData {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		BatsManData bt1 = new BatsManData(101, "scahin", 60, 720, 87621);
		BatsManData bt2 = new BatsManData(101, "Dhoni", 600, 1200, 358762145);
		BatsManData bt3 = new BatsManData(101, "samcarun", 60, 420, 87621221);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("records.dat"));
		oos.writeObject(bt1);
		oos.writeObject(bt2);
		oos.writeObject(bt3);
	}
}