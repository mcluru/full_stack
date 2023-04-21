
public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(16);
		System.out.println(t.getHour());
		t.setHour(100);
		System.out.println(t.getHour());
		
		
		
	}

}


class Time {
	private int hour;
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(hour<0 || 23<hour) return;
		this.hour = hour;
	}
	
	public int getHour() {
		return hour;
	}
}