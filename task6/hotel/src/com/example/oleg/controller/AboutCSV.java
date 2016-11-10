package com.example.oleg.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.example.oleg.model.Room;

public class AboutCSV {
	private Logger log = Logger.getLogger(AboutCSV.class.getName());	
	// private BufferedWriter bufferedWriter;
	private String path;

	public AboutCSV(String path) {
		this.path = path;
		

	}

	public void outputRoom(List<Room> roomList) throws IOException {
		// pw.println(str);
		Parser parser = new Parser();
		BufferedWriter bufferedWriter = null;
		try {
			bufferedWriter = new BufferedWriter(new FileWriter(new File(path)));
			for (int i = 0; i < roomList.size(); i++) {
				String str = parser.roomParsing(roomList.get(i));
				bufferedWriter.write(str+'\n');
			}
			bufferedWriter.close();
		} catch (IOException e) {
			log.info(e);
		}
	}

	public List<Room> importRoom() {
		List<Room> roomList = new ArrayList<Room>();
		Parser parser = new Parser();
		Scanner sc = null;
		try {
			sc = new Scanner(new File(path));
			while (sc.hasNext()) {
				String strRoom = sc.nextLine();
				Room room = parser.stringToRoom(strRoom);
				roomList.add(room);
			}
		} catch (FileNotFoundException e) {
			log.info(e);
		} finally {
			sc.close();
		}

		return roomList;

	}

}
