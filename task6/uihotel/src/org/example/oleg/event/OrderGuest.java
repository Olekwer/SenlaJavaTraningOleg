package org.example.oleg.event;

import org.example.oleg.reader.Printer;
import org.example.oleg.reader.Reader;
import org.example.oleg.writer.Input;
import org.example.oleg.writer.Writer;

import com.example.oleg.controller.Facade;

public class OrderGuest implements IEvent {
	private static final String PLECE_ENTER_ID_GUEST = "Plece enter id Guest";
	private Facade facade=Facade.getFacade();
	public void action() {
		
		Input input=new Input();
		Printer printer=new Printer(PLECE_ENTER_ID_GUEST);
		
		int idGuest=input.numberInt();
		for(int i=0;i<facade.optionGuestOrder(idGuest).size();i++){
			printer=new Printer(facade.optionGuestOrder(idGuest).get(i).toString());
			
		}
	}

}
