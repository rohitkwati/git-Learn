class Main {
public static void main(String[] args){

	double num1 = 5.5;
        double num2 = 10.2;

        double sum = addNumbers(num1, num2);

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

}
public static double addNumbers(double a, double b) {
        return a + b;
    }	
}