package com.lec.exerxise.answer;

public class Exercise7_10_11 {
	public static void main(String[] args) {
		
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		
	}
}


class MyTv2 {
	boolean isPowerOn;
	int channel;
	int past_channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if((MIN_CHANNEL<=channel) || (channel<=MAX_CHANNEL)) {
			past_channel = this.channel;
			this.channel = channel;
		}
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if((MIN_VOLUME<=volume) || (volume<=MAX_CHANNEL))
		this.volume = volume;
	}
	
	//gotoPrevChannel메서드를 추가해 완성하기
	void gotoPrevChannel() {
		int bwl = channel;
		channel = past_channel;
		past_channel = bwl;
	}
}