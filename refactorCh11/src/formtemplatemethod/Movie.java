package formtemplatemethod;

public class Movie {
	  public static final int CHILDRENS = 2;
	  public static final int REGULAR = 0;
	  public static final int NEW_RELEASE = 1;

	  private String _title;        // �W��
	  private Price _price;         // ���   // <-- changed

	  public Movie(String title, int priceCode){
	      _title = title;
	      setPriceCode(priceCode);
	  }

	   public int getPriceCode(){
	      return _price.getPriceCode();   // <-- changed
	  }

	  public void setPriceCode(int arg) {   // <-- changed
	      switch (arg) {
	            case REGULAR:               // ���q��
	                  _price = new RegularPrice();
	                  break;
	            case CHILDRENS:             // �ൣ��
	                  _price = new ChildrensPrice();
	                  break;
	            case NEW_RELEASE:           // �s��
	                  _price = new NewReleasePrice();
	                  break;
	            default:
	               throw new IllegalArgumentException("Incorrect Price Code");
	        }
	  }

	  public String getTitle(){
	      return _title;
	  }

	  // jjhou add
	  public static void main(String[] args) {
	      System.out.println("Refactoring, a First Example, step7");

	      Movie m1 = new Movie("Seven", Movie.NEW_RELEASE);
	      Movie m2 = new Movie("Terminator", Movie.REGULAR);
	      Movie m3 = new Movie("Star Trek", Movie.CHILDRENS);

	      Rental r1 = new Rental(m1, 4);
	      Rental r2 = new Rental(m1, 2);
	      Rental r3 = new Rental(m3, 7);
	      Rental r4 = new Rental(m2, 5);
	      Rental r5 = new Rental(m3, 3);

	      Customer c1 = new Customer("jjhou");
	      c1.addRental(r1);
	      c1.addRental(r4);

	      Customer c2 = new Customer("gigix");
	      c2.addRental(r1);
	      c2.addRental(r3);
	      c2.addRental(r2);

	      Customer c3 = new Customer("jiangtao");
	      c3.addRental(r3);
	      c3.addRental(r5);

	      Customer c4 = new Customer("yeka");
	      c4.addRental(r2);
	      c4.addRental(r3);
	      c4.addRental(r5);

	      System.out.println(c1.statement());
	      System.out.println(c2.statement());
	      System.out.println(c3.statement());
	      System.out.println(c4.statement());
	  }

	  double getCharge(int daysRented) {
	      return _price.getCharge(daysRented);
	  }

	  int getFrequentRenterPoints(int daysRented) {
	      return _price.getFrequentRenterPoints(daysRented);
	  }
	}
