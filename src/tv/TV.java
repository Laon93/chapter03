package tv;


/*
 * V 1) 모든 필드는 private으로 접근 제어를 하고 getter만 작성합니다. (channel, volume, power 필드는 read-only) 
 * V 2) channel, volume, power의 초기값을 각각 7, 20, false 로 초기화 하는 생성자 작성 
 * V 3) 기본 생성자 오버로딩 
 * V 4) void power( boolean on ) 메소드 구현 
 * V 5) void channel( int channel )메소드 구현 (1~255 유지) 
 * V 6) void channel( boolean up ) 메소드 오버로딩 (1~255 유지, 1씩 증감) 
 * V 7) void volume( int voluem ) 메소드 구현 ( 0 ~ 100 유지 ) 
 * V 8) void volume( boolean up ) 메소드 오버로딩 (0 ~ 100 유지, 1씩 증감) 
 * V 9) void status() 메소드 구현( TV 정보 출력)
 */



public class TV {

	private int channel;
	private int volume;
	private boolean power;

	// channel int 는 숫자를 입력하는 것
	// channel boolean 은 true 인 경우 + false 인 경우 -
	// volume도 동일 한 방식으로 하지만 숫자를 제한을 둔다.

	public int getChannel() {
		return channel;
	}

	public int getVolume() {
		return volume;
	}

	public boolean isPower() {
		return power;
	}
	public TV() {
		this.channel = 7;
		this.volume = 20;
		this.power = false;
	}
	
	public TV(int channel, int volume, boolean power)
	{
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	public void checkChannel()
	{
		if(this.channel > 255 )
			this.channel = 0;
		else if(this.channel < 0)
			this.channel = 255;
			
	}
	public void channel(int channel)
	{
		this.channel = channel;
		
		checkChannel();
	}
	public void channel (boolean up)
	{
		if(up)
			this.channel++;
		else
			this.channel--;
		
		checkChannel();
	}
	
	public void checkVolume() {
		if(this.volume > 100)
			this.volume = 100;
		else if(this.volume < 0)
			this.volume = 0;
	}
	
	public void volume(int voluem)
	{
		this.volume = voluem;
		checkVolume();
	}
	public void volume(boolean up)
	{
		if(up)
			this.volume++;
		else
			this.volume--;
		
		checkVolume();
	}
	
	public void power(boolean on)
	{
		this.power = on;
	}
	
	public void status()
	{
		if(power)
			System.out.println("power : " + power + ", channel : " + channel + ", volume : " + volume );
		else
			System.out.println("전원이 꺼져있습니다.");
	}

}
