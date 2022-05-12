package stepDefinations;

public class ChildInherit extends ParentInherit {

	public void engine()
	{
		System.out.println("New Vehicle Engine");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildInherit ci = new ChildInherit();
		ci.colour();
		ci.engine();
		ci.breaks();
	}

}
