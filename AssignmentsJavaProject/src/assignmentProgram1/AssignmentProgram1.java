package assignmentProgram1;

public class AssignmentProgram1 {

	int maths;
	int physics;
	int chemistry;
	public static void main (String [] arg) {
		System.out.println("Raju Marks");
		AssignmentProgram1 raju = new AssignmentProgram1();
		raju.maths = 30;
		raju.physics = 70;
		raju.chemistry = 88;
		System.out.println("maths="+raju.maths);
		System.out.println("Physics="+raju.physics);
		System.out.println("Chemistry="+raju.chemistry);
		
		System.out.println("Avdhut Marks");
		AssignmentProgram1 avdhut = new AssignmentProgram1();
		avdhut.maths = 55;
		avdhut.physics = 77;
		avdhut.chemistry = 58;
		System.out.println("maths="+avdhut.maths);
		System.out.println("Physics="+avdhut.physics);
		System.out.println("Chemistry="+avdhut.chemistry);
		
		System.out.println("Joy Marks");
		AssignmentProgram1 joy = new AssignmentProgram1();
		joy.maths = 68;
		joy.physics = 58;
		joy.chemistry = 51;
		System.out.println("maths="+joy.maths);
		System.out.println("Physics="+joy.physics);
		System.out.println("Chemistry="+joy.chemistry);
	}	
}
