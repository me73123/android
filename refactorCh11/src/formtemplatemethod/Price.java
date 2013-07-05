package formtemplatemethod;

abstract class Price {
    abstract int getPriceCode();            // ��o���N��
    abstract double getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}