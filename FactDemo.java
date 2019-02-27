 class FactDemo{
public static void main(String [] args){


	int n= Integer.parseInt(args[0]);
	int factorial= factorial(n);

	System.out.println(factorial);	
}
	static int factorial( int n){
		int fact=1;
		for(int i=1;i<=n;i++){
		fact= fact *i ;
		}
	return fact;
	

}

}