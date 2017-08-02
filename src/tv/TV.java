package tv;

public class TV {
	
	private int channel;
	private int volume;
	private boolean power;
	
	//channel int 는 숫자를 입력하는 것
	//channel boolean 은 true 인 경우 + false 인 경우 -
	//volume도 동일 한 방식으로 하지만 숫자를 제한을 둔다.
	
	public int getChannel()
	{
		return channel;
	}
	
	public int getVolume()
	{
		return volume;
	}
	
	public boolean isPower()
	{
		return power;
	}

}
