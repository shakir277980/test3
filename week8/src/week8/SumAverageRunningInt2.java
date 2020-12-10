package week8;

public class SumAverageRunningInt2 {

	public static void main(String[] args) {
		
		int lowerbound = 1;
		int upperbound = 100;
		int sum = 0;
		double average;
		for (int number = lowerbound; number <= upperbound; ++number) {
		sum = sum+number;
		}

		average=sum/100;
		System.out.println("The average is : " + average);
		System.out.println("The total sum is : " + sum);
		System.out.println();
		
		System.out.println("While loop");
		int lowerboundd = 1;
		int upperboundd = 100;
		int summ = 0;
		int numberr=lowerboundd;
		double averagee;
		while (numberr<=upperboundd)
			summ=summ+numberr;
			numberr=numberr+1;
	    
		averagee=summ/100;
		System.out.println("The average is : " + averagee);
		System.out.println("The total sum is : " + summ);
		System.out.println();
	
		System.out.println("Do While");
		int lowerbounddd = 1;
		int upperbounddd = 100;
		int summm = 0;
		int numberrr=lowerbounddd;
		double averageee;
		do {
			summm=summm+numberrr;
			numberrr=numberrr+1;
		}while (numberrr<=upperbounddd);
		 averageee=summm/100;
		 System.out.println("The average is : " + averageee);
		 System.out.println("The total sum is : " + summm);
		 System.out.println();	

	}

}
