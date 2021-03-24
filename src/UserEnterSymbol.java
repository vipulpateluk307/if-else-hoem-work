public class UserEnterSymbol {
// user enter +,-,/,*
    public static void main(String[] args){

        double a= 10;
        double b= 20;
        char symbol1='/';

        if (symbol1=='+')
        {
            System.out.println(a+b);
        }
       else if(symbol1=='-')
        {
            System.out.println(a-b);
        }
       else if(symbol1=='*')
        {
            System.out.println(a*b);
        }
        else if(symbol1=='/')
        {
            System.out.println(a/b);

        }else
            System.out.println(" invalid");







    }


}
