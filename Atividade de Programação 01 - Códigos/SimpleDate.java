/* A simple date class
   Anderson, Franceschi
*/

public class SimpleDate{
  private int month;
  private int day;
  private int year;

  
  public SimpleDate( ){
    setDate( 1, 1, 2000 );
  }

  public SimpleDate( int mm, int dd, int yyyy ){
    setMonth( mm );
    setYear( yyyy );
    setDay( dd );
  }

  int getMonth( ) { 
     return month; 
  }
  
  int getDay( ){
     return day; 
  }
  
  int getYear( ){
     return year;
  }

  public void setMonth( int mm ){
    month = ( mm >= 1 && mm <= 12 ? mm : 1 );
  }

  public void setDay( int dd ){
    day = ( dd >= 1 && isValidDay( dd ) ? dd : 1 );
  }

  public void setYear( int yyyy ){
    year = yyyy;
  }

  public void nextDay( ){
     if ( ! isValidDay( ++day ) )
     {
         day = 1;
		 if ( ++month > 12 )
		 {
			 month = 1;
			 year++;
		 }
	 }
  }

  private boolean isValidDay( int newDay ){
	int [] daysInMonth = { 0, 31, 28, 31,
	                          30, 31, 30,
	                          31, 31, 30,
                              31, 30, 31 };

    if ( newDay > daysInMonth[month] )
    {
	   if ( month == 2 && isLeapYear( ) && newDay == 29 )
	      return true;
	   else
	      return false;
    }
    else
       return true;

  }

  private boolean isLeapYear( ){
	 return !( year % 4 != 0
	           ||( year % 100 == 0 && year % 400 != 0 ) );
  }

  public void setDate( int mm, int dd, int yyyy ){
    setYear(yyyy);  // set year first (could be leap year)
    setMonth( mm ); // set month next
    setDay( dd );   // set day
  }

  public String toString( ){
    return month + "/" + day + "/" + year;
  }

  public boolean equals( Object d ){
    if ( !( d instanceof SimpleDate ) )
       return false;
    SimpleDate d1 = (SimpleDate)d;
    if ( month == d1.month
         && day == d1.day
         && year == d1.year )
      return true;
    else
      return false;
  }
}