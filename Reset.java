public class Reset {
	Race race = new Race();
	Channel c;
	public void reset(){
		race.setEvent(Race.Event.IND);
		race.runNum = 1;
		for(Channel ch : c.channels){
			if(ch.channelOn()) c.toggleChannelState(ch);
		}
	}
}
