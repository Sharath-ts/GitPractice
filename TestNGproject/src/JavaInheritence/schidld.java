package JavaInheritence;

public class schidld extends PS3 {
	int a;
	
	public schidld(int a) {//instance constructor created by the help of Object
		super(a);// used only at first page
		this.a=a;
	}

	public int increment() 
	{
		a= a+1;
		return a;
	}
	
	public int decrement() 
	{
		a= a-1;
		return a;
	}

}
