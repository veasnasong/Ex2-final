    class Sale implements DiscountRate {
        private CustomerType customerType;
        private double serviceExpense;
        private double productExpense;

        public Sale(CustomerType customerType, double serviceExpense, double productExpense) {
            this.customerType = customerType;
            this.serviceExpense = serviceExpense;
            this.productExpense = productExpense;
        }

        // Implementing interface methods
        @Override
        public double getServiceDiscountRate() {
            switch (customerType) {
                case PREMIUM:
                    return 0.2; // 20% discount
                case GOLD:
                    return 0.15; // 15% discount
                case SILVER:
                    return 0.1; // 10% discount
                default:
                    return 0.0; // 0% discount for NORMAL
            }
        }

        @Override
        public double getProductDiscountRate() {
            // For product, discount rates are the same for all customer types
            return 0.1; // 10% discount
        }

        public double getTotalBill() {
            double totalServiceExpense = serviceExpense - (serviceExpense * getServiceDiscountRate());
            double totalProductExpense = productExpense - (productExpense * getProductDiscountRate());
            return totalServiceExpense + totalProductExpense;
        }
    }





