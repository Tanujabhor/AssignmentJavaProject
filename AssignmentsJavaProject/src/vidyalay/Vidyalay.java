package vidyalay;



public class Vidyalay {

	public Vidyalay (int maths, int physics, int chemistry, String studentname, String pass ) {
		String a ="pass";
		String b = "fail";
		System.out.println("marks of "+studentname);
		System.out.println("maths" + maths);
		System.out.println("physics" + physics);
		System.out.println("chemistry" + chemistry);
		int totalmark = maths + physics + chemistry;
		System.out.println("total marks of " + studentname +" = "+ totalmark );
		
		if (( totalmark >150) && (a.equals(pass))) {
		System.out.println("Result of " + studentname +" = Pass ");
		System.out.println("Congratulations \n");
		}
		
		else if (b.equals(pass)) {
			System.out.println("Result of " + studentname +" = Fail ");
			System.out.println("better luck next time \n");}
		}
	
		public static void main(String[] args) {
			new Vidyalay(88,87,63, "joy","pass");
			new Vidyalay(36,28,30, "Milind", "fail");
			new Vidyalay(50,70,80, "Kumar", "pass");
			new Vidyalay(30,66,12, "Jyoti", "fail");
		}
}
