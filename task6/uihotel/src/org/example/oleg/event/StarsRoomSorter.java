package org.example.oleg.event;

import org.example.oleg.reader.Printer;
import org.example.oleg.reader.Reader;

import com.example.oleg.controller.Facade;

public class StarsRoomSorter implements IEvent {

	private Facade facade=Facade.getFacade();

	
	public void action() {
		// TODO Auto-generated method stub
		for (int i = 0; i < facade.sortByStarsRoom().size(); i++) {
			Printer printer=new Printer(facade.sortByStarsRoom().get(i).toString());
		}
	}

}
