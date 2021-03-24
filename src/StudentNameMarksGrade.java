public class StudentNameMarksGrade {
    public static void main(String[] args) // static method
    {
        String name = "Vipul";
        int rollNo = 1;
        double maths = 80; // variable method
        double english = 40.00;
        double computer = 20.00;
        double result = maths+english+computer;
        double percentage = (result / 300) * 100;
        System.out.println("Student name is " + name );
        System.out.println("Student roll no is " + rollNo );
        System.out.println( name + " result is = " + result);
        System.out.println( name + " percentage is ="+ percentage + "%");

        // using  logic condition
        if (percentage >= 35 ) {
            System.out.println(name + " is pass");
        }else {
            System.out.println(name + " is fail");
        }
            if (percentage >= 80){
                System.out.println(name + " grade is A+");
            }

        else if(percentage >= 60){
        System.out.println(name + " grade is A");
        }
    else if(percentage >= 50){
        System.out.println(name + " grade is B");

    }
    else if(percentage >= 35){
        System.out.println(name + " grade is C");
    }


    }


}
