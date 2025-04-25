
public class Student {
    private String name;
    private int[] scores = { 85, 92, 78, 90 };


    public double getAverage() {
        int sum = 0;
        for (int s : scores) {
            sum = sum + s;
        }
        return (double) sum / scores.length;
    }

    public void printAverage() {
        System.out.printf("%sさんの平均点は %.2f 点です%n", name, getAverage());
    }
    
    public static void main(String[] args) {
    	
    	
    	Student student = new Student();
    	
    	student.name = "田中";
    	
    	student.printAverage();    	
    	
    	
    }

}
