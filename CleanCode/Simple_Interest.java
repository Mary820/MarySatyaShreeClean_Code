import java.util.*;

class Simple_Interest{
	public static double SimpleInt(double p,double t1,double rate1)
	{
		return (p * t1 * rate1)/100;
	}
	public static double CompoundInt(double p1,double t2,double rate2)
	{
		return p1 * Math.pow(1.0+rate2/100.0,t2) - p1;
	}
}



