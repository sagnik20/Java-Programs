class Exception5{
    	public static void main(String sagnik[]){
        	Exception5 a = null;
		try{
			a.sum();
		}
		catch(NullPointerException t){
			System.out.println("The object is pointed to NULL");
			throw t;
		}
		finally{
			System.out.println("End OF Program");
		}
	}

	void sum(){
		System.out.println("Sum to be calculated here");
	}
}
