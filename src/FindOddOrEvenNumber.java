public class FindOddOrEvenNumber
{
    public static void main(String[] args)//static method
        {
            int number = 2; //Using ternary operator
            String msg = (number % 2 == 0)?"The number is even! " : "The number is odd!";

            System.out.println(msg);

        }
}
