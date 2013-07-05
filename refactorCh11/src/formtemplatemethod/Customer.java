package formtemplatemethod;

import java.util.Enumeration;
import java.util.Vector;

class Customer {
	
	/*
	 * 1. 新建一個父類別Statement與兩個subclass TextStatement HtmlStatement
	 * 2. 將statement(),htmlStatement()分別放入對應的subclass
	 * 3. 將兩個函式rename成同一個名稱,在Customer新增一個getRentals(),取代elements()
	 * 4. 將組合列印表頭字串(result)的部分寫成一個函式
	 * 5. 將中間組合列印字串部分(result)寫成函式
	 * 6. 將最後面組合列印字串部分(result)寫成函式
	 * 7. 將statement()抽至父類別
	 * 8. 在父類別中將宣告組合列印字串的函式宣告成抽象函式
	 * 9. 將子類別的statement()刪除
	 * 
	 */
	  private String _name;
	  private Vector _rentals = new Vector();

	  public Customer(String name) {
	      _name = name;
	  }

	  public void addRental(Rental arg) {
	      _rentals.addElement(arg);
	  }

	  public String getName() {
	      return _name;
	  }

	  public String statement() {
	      Enumeration rentals = _rentals.elements();
	      String result = "Rental Record for " + getName() + "\n";

	      while (rentals.hasMoreElements()) {
	          Rental each = (Rental) rentals.nextElement();

	          //show figures for this rental
	          result += "\t" + each.getMovie().getTitle()+ "\t" +
	                      String.valueOf(each.getCharge()) + "\n";
	      }

	      //add footer lines�]�����C�L�^
	      result += "Amount owed is " +
	                  String.valueOf(getTotalCharge()) + "\n";
	      result += "You earned " +
	                  String.valueOf(getTotalFrequentRenterPoints()) +
	                  " frequent renter points";
	      return result;
	  }

	  public String htmlStatement() {
	           Enumeration rentals = _rentals.elements();
	           String result = "<H1>Rentals for <EM>" + getName() +
	                              "</EM></H1><P>\n";
	           while (rentals.hasMoreElements()) {
	                   Rental each = (Rental) rentals.nextElement();
	                   //show figures for each rental
	                   result += each.getMovie().getTitle()+ ": " +
	                     String.valueOf(each.getCharge()) + "<BR>\n";
	           }
	           //add footer lines
	           result +=  "<P>You owe <EM>" +
	                        String.valueOf(getTotalCharge()) +
	                        "</EM><P>\n";
	           result += "On this rental you earned <EM>" +
	                   String.valueOf(getTotalFrequentRenterPoints()) +
	                   "</EM> frequent renter points<P>";
	           return result;
	  }

	  // Ķ��G���Y�ҿ�query method
	  private int getTotalFrequentRenterPoints(){
	       int result = 0;
	       Enumeration rentals = _rentals.elements();
	       while (rentals.hasMoreElements()) {
	           Rental each = (Rental) rentals.nextElement();
	           result += each.getFrequentRenterPoints();
	       }
	       return result;
	  }

	  // Ķ��G���Y�ҿ�query method
	  private double getTotalCharge() {
	       double result = 0;
	       Enumeration rentals = _rentals.elements();
	       while (rentals.hasMoreElements()) {
	           Rental each = (Rental) rentals.nextElement();
	           result += each.getCharge();
	       }
	       return result;
	  }
	}