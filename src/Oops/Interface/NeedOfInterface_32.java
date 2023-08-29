package Oops.Interface;

/*

abstract class Computer
{
//	public void code()
//	{
//		
//	}
	public abstract void code();
}

class Laptop extends Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}

}

class Desktop extends Computer
{
	public void code()
	{
		System.out.println("code, compile, faster");
	}
}
class Developer
{
//	public void devApp(Laptop lap)
	public void devApp(Computer lap)
	{
		lap.code();
	}
}

public class Demo {
    public static void main(String[] args) {
//        Laptop lap=new Laptop();
//        Desktop desk=new Desktop();
        
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        
        Developer navin=new Developer();
        navin.devApp(lap);
        
    }
}
*/

interface Computer10 {
	void code();
}

class Laptop10 implements Computer10 {
	public void code() {
		System.out.println("code, compile, run");
	}

}

class Desktop implements Computer10 {
	public void code() {
		System.out.println("code, compile, faster");
	}
}

class Developer {
	// public void devApp(Laptop lap)
	public void devApp(Computer10 lap) {
		lap.code();
	}
}

public class NeedOfInterface_32 {
	public static void main(String[] args) {
		// Laptop lap=new Laptop();
		// Desktop desk=new Desktop();

		Computer10 lap = new Laptop10();
		Computer10 desk = new Desktop();

		Developer navin = new Developer();
		navin.devApp(lap);

	}
}
