package stepDefinations;

public class arraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5]; //declares an array and allocates memory space for 5 values of an array
		
		a[0] = 2;
		a[1] = 4;
		a[2] = 6;
		a[3] = 8;
		a[4] = 10;
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		int b[] = {1, 3, 5, 7}; //literal array
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
	}

}
