package Portfolio;

public class NumberAnalyzer {

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.println("Enter the number of items: ");
		int n = input.nextInt();
		
		double[] numbers = new double[n];
		double sum = 0;
		
		
		System.out.print("enter the nubers: ");
		for (int i = 0 ; i<n ; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
			
		}
		double average = sum/numbers.length;
		int lower=0;
		int high=0;
		for (double element:numbers) {
			if (element < average) {
				lower++;
			}
			else {
				high++;
			}
			
		}
		double min = numbers[0];
		double max = numbers[0];
		for (double element:numbers) {
			if (element < min) {
				min = element;
			}
			if (element > max) {
				max = element;
			}
			
			
			
			
			
			
		}
		int i, j;
		double temp;
		for (i = 0; i < n-1; i++) {
			for (j = 0; j < n-i-1; j++) {
				if (numbers[j] > numbers[j+1]) {
					temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		int median = (numbers.length + 1)/ 2;
		
		double medianvalue =numbers[median];
		
				
		
		
		
		double maxValue = 0;
		int maxCount = 0;
		 
        for (int i1 = 0; i1 < numbers.length; ++i1) 
        {
            int count = 0;
            for (int j1 = 0; j1 < numbers.length; ++j1) 
            {
                if (numbers[j1] == numbers[i1])
                    ++count;
            }
            if (count > maxCount) 
            {
                maxCount = count;
                maxValue = numbers[i1];
            }
        }
        System.out.println("The mode is: "+ maxValue);
		System.out.println("The median is: "+ medianvalue);
		System.out.println("The mean is: "+average);

	}
	

}
