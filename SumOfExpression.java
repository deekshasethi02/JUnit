class SumOfExpression{

	public int calculateSum(){
				
		String str = "2+3+4";
		int sum=0, temp=0 ;

		for(int i=0 ; i<str.length() ; i++)	{
		
			if(Character.isDigit(str.charAt(i))) {

				temp= Character.getNumericValue(str.charAt(i));	
				sum = sum + temp;		

			}	

		}return sum;

	}
}