
//In this exercise, complete the function that "returns a value".
//When you call this function, it should calculate the area of the triangle using Heron's formula and return it.

public class AreaT {


        public static void main(String[] args) {
            //Write a java program to ask the user for his/her name, age, and salary (double). Follow the input/output format.
            double a;
            a = triangleArea(3, 3, 3);
            System.out.println("A triangle with sides 3,3,3 has an area of:" + a);

            a = triangleArea(3, 4, 5);
            System.out.println("A triangle with sides 3,4,5 has an area of:" + a);

            a = triangleArea(9, 9, 9);
            System.out.println("A triangle with sides 9,9,9 has an area of:" + a );

        }
    public static double triangleArea( int a, int b, int c )
    {

        double s = (a + b + c)/2.0;
        double Area = Math.sqrt(((s) * (s-a) * (s-b) * (s-c)));
        return Area;

        }
    }
