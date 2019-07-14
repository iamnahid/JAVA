class AB implements BasicCalculator,ScientificCalculator{
	
public int sum(int x,int y){
		int sum = x+y;
		System.out.println("Sum:"+sum);
		return sum;
		}
public int sub(int x,int y){
		int sub = x-y;
		System.out.println("Sub:"+sub);
		return sub;
		}
public int mul(int x,int y){
		int mul = x*y;
		System.out.println("Mul:"+mul);
		return mul;
		}
public int div(int x,int y){
		int div=1;
		if ( x > y ){
		div = x/y;
		System.out.println("Div:"+div);
		}
		return div;
/*	else 
	div = (double)x/y;
	System.out.println("Div:"+div);
		return (double)div; */
		}
public int to(int x,int y){
		int to = 1;
		while (y!=0)
		{
		to = to*x;
		--y;
		}
		System.out.println("To:"+to);
		return to;
		}
				
public static void main(String arg[])
		{
			AB o = new AB();
			o.sum(5,9);
			o.sub(5,9);
			o.mul(3,3);
			o.div(18,9);
			o.to(5,3);
			
		}
}