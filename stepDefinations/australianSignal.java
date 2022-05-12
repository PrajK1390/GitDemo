package stepDefinations;

public class australianSignal implements CentralTraffic, ContinentalTraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentralTraffic t = new australianSignal();
		t.GreenGo();
		t.RedStop();
		t.YellowFlash();
		
		ContinentalTraffic co = new australianSignal();
		co.trainRules();
		
		australianSignal ss = new australianSignal();
		ss.interCountryRule();
	}

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("When Gree, you can go...");
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("When Red, you have to stop..");
	}

	@Override
	public void YellowFlash() {
		// TODO Auto-generated method stub
		System.out.println("When Yellow flashes, you have to wait..");
	}

	@Override
	public void trainRules() {
		// TODO Auto-generated method stub
		System.out.println("Long route trains should be sopped if they are not fast onces..");
	}
	
	public void interCountryRule()
	{
		System.out.println("Penalty for unfollowing should be $250.");
	}

}
