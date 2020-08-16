import java.util.*;
class FibonacciExample2{
	static int n1=0,n2=1,n3=0;

	static int Fibonacci(int count){
		if (count<=1)
		{
			return count;
		}
		else
		{
			return Fibonacci(count-1)+Fibonacci(count-2);
		}
	}
	public static void main(String args[]){
		int number=10;
		for(int i =0;i < number;i++)
		System.out.print(Fibonacci(i)+" ");
	}
}  