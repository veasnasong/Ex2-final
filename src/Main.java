public class Main {
    public static void main(String[] args)
    {
                Sale sale1 = new Sale(CustomerType.PREMIUM, 100.0, 200.0);
                Sale sale2 = new Sale(CustomerType.SILVER, 150.0, 250.0);

                System.out.println("Total Bill for Sale 1: $" + sale1.getTotalBill());
                System.out.println("Total Bill for Sale 2: $" + sale2.getTotalBill());
            }


}
