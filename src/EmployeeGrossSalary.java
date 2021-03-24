public class EmployeeGrossSalary {

   public static void main(String[] args){
// calculated employee Gross salary = Basic salary + hra + ta + da - pf
       int employee_id = 001;
       String name = "raj";
       double basicsalary = 10000.00;
       double hra = basicsalary * 10/100;
       double da = basicsalary * 8/100;
       double ta = basicsalary * 9/100;
       double pf = basicsalary * 20/100;
       double grosssalary = basicsalary + hra + ta + da - pf;

       System.out.println( "Employee id" + " = " + employee_id );
       System.out.println("Name "+ " = "+ name );
       System.out.println("Basic salary"+ " = "+ basicsalary );
       System.out.println("HRA " + " = " + basicsalary * 10/100);
       System.out.println("DA " + " = " + basicsalary * 8/100);
       System.out.println("TA" + " = " + basicsalary * 9/100);
       System.out.println("PF" + " = " + basicsalary * 20/100);
       System.out.println("Gross salary" + " = " + (basicsalary + hra + ta + da - pf));












   }












}


