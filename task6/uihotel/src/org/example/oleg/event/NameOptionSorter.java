package org.example.oleg.event;

import org.example.oleg.reader.Printer;
import org.example.oleg.reader.Reader;

import com.example.oleg.controller.Facade;

public class NameOptionSorter implements IEvent {

	private Facade facade=Facade.getFacade();

	public void action() {
		// TODO Auto-generated method stub
	//	Reader reader= new Reader();
		for (int i = 0; i < facade.sortByNameOption().size(); i++) {
			Printer printer=new Printer(facade.sortByNameOption().get(i).toString());
			
		}
	}

}
