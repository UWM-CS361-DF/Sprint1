
public class Race {
	
	enum Event {IND, PARIND, GRP, PARGRP;}
	private Event event;
	public int runNum;//not sure
	
	public Race(Event event) {
		switch (this.event) {
		case IND:
			break;
		case PARIND:
			break;
		case GRP:
			break;
		case PARGRP:
			break;
		}
	}
	
	public void setEvent(Event e){
		event = e;
	}
}
