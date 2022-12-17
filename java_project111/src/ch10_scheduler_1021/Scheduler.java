package ch10_scheduler_1021;

public interface Scheduler {

	
	// 추상메서드로 변환됨. 
	public void getNextCall();
	public void sendCallToAgent();
	
}
