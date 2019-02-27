class ConvertToBinary{
	String binaryNumber ="";
	int num=17;

	public String calculateBinaryEquantOf17(){
		
		while(num>0){
			int rem= num %2;
			num = num/2;
			binaryNumber= binaryNumber + rem;
		}

		StringBuilder obj=new StringBuilder(binaryNumber);
		return obj.reverse().toString();		
	}
}