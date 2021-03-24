public class FindSalesCommission {

    public static void main(String[] args) {

// sales commission calculated //using variable
        int salesId = 001;
        String sellerName = "Vipul";
        int basicSalary = 20000;
        double salesAmount = 20000;
        double saleCommission = basicSalary + salesAmount;
        double salesCommission0 = salesAmount * 35 / 100;
        double salesCommission1 = salesAmount * 20 / 100;
        double salesCommission2 = salesAmount * 10 / 100;
        double salesCommission3 = salesAmount * 5 / 100;
        double salesCommission4 = salesAmount * 2 / 100;
        System.out.println("salesId" + "=" + salesId);
        System.out.println("Name=" + "=" + sellerName);
        System.out.println("basicSalary" + "=" + basicSalary);
        System.out.println("saleAmount" + "=" + salesAmount);
        System.out.println("SaleCommission" + "=" + (basicSalary + salesAmount));

        if (salesAmount >= 50000) {
            System.out.println(("SalesCommission0" + "=" + salesAmount * 35 / 100));
        } else if (salesAmount >= 30000) {
            System.out.println(("SalesCommission1" + "=" + salesAmount * 20 / 100));
        } else if (salesAmount >= 20000) {
            System.out.println(("SalesCommission2" + "=" + salesAmount * 10 / 100));
        } else if (salesAmount >= 10000) {
            System.out.println(("SalesCommission3" + "=" + salesAmount * 5 / 100));
        } else if (salesAmount < 10000) {
            System.out.println(("SalesCommission4" + "=" + salesAmount * 2 / 100));
        }


    }


}

