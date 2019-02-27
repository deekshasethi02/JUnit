class EvenOddCount{

	public int calculateEvenCount(){
		int even_count = 0;	
		
		int n= 542587545;
		while(n > 0){

			int rem = n %10;
			if(rem % 2 == 0){
				even_count++;
						
			}
			n=n/10;			
		}
			return even_count;
				
	}
	public  int calculateOddCount(){
		int odd_count = 0;
		int n= 542587545;
		while(n > 0){

			int rem = n %10;
			if(rem % 2 != 0){
				
				odd_count++; 
						
			}
			n=n/10;		
		}
			return odd_count;
				
	}


}