package assignmentmdk;

public class FinalVar_local {
 final int x=10;
 void modify()
 {
	// x=20;not initialized again when final is there
	 System.out.println(x);
 }
	public static void main(String[] args) {
	
		FinalVar_local test=new FinalVar_local();
		test.modify();
	}

}
