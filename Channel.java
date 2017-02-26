import java.util.*;

public class Channel {
	List<Channel> channels = new ArrayList<Channel>(9);
	private int channelNumber;
	private Sensor sensor;
	private boolean channelState;

	public Channel(int channelNumber, boolean channelState, Sensor sensor) {
		this.channelNumber = channelNumber;
		this.sensor = sensor;
		this.channelState = channelState;
	}
	
	public void toggleChannelState(Channel channel) {
		if (channel.channelOn()) {
			channel.channelState = false;
		} else {
			channel.channelState = true;
		}
	}
	
	public boolean channelOn() {
		if (channelState == true) {
			return true;
		} else {
			return false;
		}
	}
}
