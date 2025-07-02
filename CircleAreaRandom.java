package assignmentmdk;

public class CircleAreaRandom {

	public static void main(String[] args) {
	
		for (int i=1;i<=50;i++)
		{
			double radius = 1 + Math.random() * 9; // range: 1 to 10
            double area = Math.PI * radius * radius;

            System.out.printf("Circle %d: Radius = %.2f, Area = %.2f%n", i, radius, area);
        
		}

	}

}
