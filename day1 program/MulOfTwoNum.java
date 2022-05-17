package main;

class TwoNumbers{
	void MultiplyNumbers(){
		int num1 = 15;
		int num2 = 20;
		int result = num1 * num2;
		
		System.out.println("Multipication of two Numbers " + result);
		
	}
}
public class MulOfTwoNum {

	public static void main(String[] args) {
		TwoNumbers object= new TwoNumbers();
		object.MultiplyNumbers();
	}

}
