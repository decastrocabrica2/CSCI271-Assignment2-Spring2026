public class Fraction 
  {
  private long numerator; // private variable for numerator
  private long denominator; // private variable for numerator

  /*****************************<getDenom>****************************
   * Description: Getter for denominator
   *
   * Parameters: none
   *
   * Pre: cannot be a letter or string
   *
   * Post: no changes the object is retrived
   *
   * Returns: the value of the denominator as a long
   *
   * Called by: any code that needs to access the denominator
   * Calls: none
   ************************************************************************/
  public long getDenom() 
  { // getter to return denominator
    return denominator;
  }

  /*****************************<getNum>****************************
   * Description: Getter for numerator
   *
   * Parameters: none
   *
   * Pre: cannot be a letter or string
   *
   * Post: no changes the object is retrived
   *
   * Returns: the value of the numerator as a long
   *
   * Called by: any code that needs to access the numerator
   * Calls: none
   ************************************************************************/
  public long getNum() 
  { // getter to return numerator
    return numerator;
  }

  /*****************************<Fraction>****************************
   * Description: fraction Constructor that takes two parameters
   *
   * Parameters: //access private numerator and sets it equal to a
   *               //access private denominator and sets it equal to b
   *
   * Pre:  most be a number cannot be a letter or string or the program
   * will break
   *
   * Post: goes through the if and else if staments to determine the sign
   * and the gcd of the fraction
   *
   * Returns: nothing, a Constructor.
   *
   * Called by:in main
   * Calls: gcd()
   ************************************************************************/
  public Fraction(long a, long b) 
    { //
    this.numerator = a;
    this.denominator = b;

    //  because gdc cannot handle in the case that the denominator is zero we
    //  use this if statements
    if (b == 0) 
    { // so if b = 0 then that gives the numerator the sign of a
      numerator = Long.signum(
          a); // so if the denominator is 0 then as a fraction that is not
              // allowed, so we throw away what a but we keep its sign
      // got signum from TA
    }

    else if (a == 0) 
    { // so if a = 0 then make the denominator 1
      denominator = 1; // sets denominator to 1
    } else 
    { // long . sum extracts the sign a and b has so if it, so it sets
             // the numerator to the sign of a and b, this when a and b are non
             // zeroes
      long sign = (Long.signum(a))
          * (Long.signum(b)); // gets the sign for both  a and b
      numerator = Math.abs(numerator); // make the numerator positive
      denominator = Math.abs(denominator); // make the denominator negative
      long g = gcd(numerator,
          denominator); // calls gcd, this is so it can reduce the fraction
      this.numerator = (numerator / g)
          * sign; // onece we call gcd we need to dive the numerator by its gcd
                  // and  multiply by its given sign
      this.denominator = denominator
          / g; // onece we call gcd we need to dive the denominator by its gcd,
               // the denominator does not have a sign applied
    }
    
    }

  /*****************************<Fraction>****************************
   * Description: fraction Constructor that takes only 1 parameter and because
   * its only one then it makes the denominator 1
   *
   * Parameters: //access private numerator and sets it equal to a
   *               //access private denominator and sets it equal to b
   *
   * Pre:  most be a number cannot be a letter or string or the program
   * will break
   *
   * Post: a fraction is created with numerator c and denominator 1
   *
   * Returns: nothing, its a Constructor.
   *
   * Called by: in main
   * Calls: gcd()
   ************************************************************************/
  public Fraction(long c) 
    { // this Constructor is in the case that, in the main theres an
                // argument of one, so here theres one parameter
    this.numerator = c; // numerator
    this.denominator =
        1; // sets the denominator to 1 incase were givien only one number
    }

  /*****************************<add>****************************
   * Description: computes the sum of this fraction and another fraction, and
   * it is returned as a normalized fraction.
   *
   * Parameters: one fraction access the second fraction to be added
   *
   *
   * Pre:  oneFraction must be a valid fraction object
   *
   * Post: a new fraction is created by using add
   *
   * Returns: two longs, the numerator and denominator
   *
   * Called by: in main
   * Calls: Fraction Constructor
   ************************************************************************/

  public Fraction add(Fraction oneFraction) 
    {
    // returns the addition of fractions using this . numerator and this .
    // denominator to access the first given varaibles and store that first
    // fraction given
    //  then using oneFraction. numerator and oneFraction.denominator
    // to store the second/other Fraction given, it returns it as a new Fraction
    return new Fraction((this.numerator * oneFraction.denominator)
            + (this.denominator * oneFraction.numerator), this.denominator * oneFraction.denominator);
    }

  /*****************************<subtract>****************************
   * Description: computes the subtraction of this fraction and another
   *fraction, and it is returned as a normalized fraction.
   *
   * Parameters: one fraction access the second fraction to be subtracted
   *
   *
   * Pre:  oneFraction must be a valid fraction object
   *
   * Post: a new fraction is created by using subtract
   *
   * Returns: two longs, the numerator and denominator
   *
   * Called by: in main
   * Calls: Fraction Constructor
   ************************************************************************/

  public Fraction subtract(Fraction oneFraction) 
    {
    // returns the subtraction of fractions using this . numerator and this .
    // denominator
    //  to access the first given varaibles and store that first fraction given
    // then using oneFraction. numerator and oneFraction.denominator
    // to store the second/other Fraction given, it returns it as a new Fraction
    return new Fraction((this.numerator * oneFraction.denominator)  - (this.denominator * oneFraction.numerator),
        this.denominator * oneFraction.denominator);
    }

  /*****************************<multiply>****************************
   * Description: computes the multiplication of this fraction and another
   *fraction, and it is returned as a normalized fraction.
   *
   * Parameters: one fraction access the second fraction to be multiplied
   *
   *
   * Pre:  oneFraction must be a valid fraction object
   *
   * Post: a new fraction is created by using multiply
   *
   * Returns: two longs, the numerator and denominator
   *
   * Called by:  main and in power method
   * Calls: Fraction Constructor
   ************************************************************************/
  public Fraction multiply(Fraction oneFraction) 
    {
    // returns the multiplication of fractions using this . numerator and this .
    // denominator to access the first given varaibles and store that first
    // fraction given
    //  then using oneFraction. numerator and oneFraction.denominator
    // to store the second/other Fraction given, it returns it as a new Fraction
    return new Fraction(this.numerator * oneFraction.numerator, this.denominator * oneFraction.denominator);
    }
  /*****************************<divide>****************************
   * Description: computes the division of this fraction and another fraction,
   *and it is returned as a normalized fraction.
   *
   * Parameters: one fraction access the second fraction to be divided
   *
   *
   * Pre:  oneFraction must be a valid fraction object
   *
   * Post: a new fraction is created by using divide
   *
   * Returns: two longs, the numerator and denominator
   *
   * Called by: main
   * Calls: Fraction Constructor
   ************************************************************************/
  public Fraction divide(Fraction oneFraction) 
    {
    // returns the division of fractions using this . numerator and this .
    // denominator to access the first given varaibles and store that first
    // fraction given
    //  then using oneFraction. numerator and oneFraction.denominator
    // to store the second/other Fraction given, it returns it as a new Fraction
    return new Fraction(this.numerator * oneFraction.denominator,this.denominator * oneFraction.numerator);
    }

  /*****************************<pow>****************************
   * Description: computes the exponent operation of this fraction, and
   * it is returned as a normalized fraction.
   *
   * Parameters: on integer variable
   *
   *
   * Pre:  has to be an integer or it will break
   *
   * Post: a new fraction is created by using pow
   *
   * Returns: two longs, the numerator and denominator
   *
   * Called by: main
   * Calls: Fraction Constructor
   ************************************************************************/

  public Fraction pow(int n) 
    { // takes the power of a fraction, using an interger parameter

    Fraction base =
        new Fraction(numerator, denominator); // the base for the exponent

    if (n == 0) 
    { // in the case that the exponent is 0 then return 1 as the
                  // answer
      return new Fraction(1, 1); // returns 1 as the answer

    } 
    
    else if (n < 0) 
    
    {
      base = new Fraction(this.denominator,
          this.numerator); // if the exponent is negative then flip the fraction
      n = -n; // and makes the exponent positive
    }

    Fraction result =
        new Fraction(1, 1); // starting value of one for multiplication

    for (int i = 0; i < n; i++) 
    { // loop that runs n times
      result = result.multiply(base); // and each time it multiplies the current
                                      // result with the base fraction
    }

    return result; // returns the result
    }

  /*****************************<negation>****************************
   * Description: computes the negation of this fraction, and
   * it is returned as a normalized fraction.
   *
   * Parameters:none
   *
   *
   * Pre:  has to be properly constructed with a non zero denominator
   *
   * Post: a new fraction is created by using negation
   *
   * Returns: two longs, the numerator and denominator
   *
   * Called by: main
   * Calls: Fraction Constructor
   ************************************************************************/

  public Fraction negate() 
    { // negates the fraction

    return new Fraction(numerator * -1,
        denominator); // multiplys the numerator by -1 to make it negative
    }

  public static long gcd(long N, long D) 
    { // greates common divisor, this is to normalize the
                        // fraction, and it uses two parameters

    if (N < 0) // when n is negative
    {
      N = -N; // multiply it by -1 and make it positive
    }
    while (D != 0) // when d is not zero
    {
      long R = N % D; // take the remainder of n
      N = D; // set n  to d
      D = R; // set the d to be the remainder
    }

    if (N == 0) // when n is zero
    {
      N = 1; // then N is 1
    }
    return N; // return n
    }

  /*****************************<toString>****************************
   * Description: computes this into a redable string, and hadles outputs like
   * infinity and negative infinity
   *
   * Parameters:none
   *
   *
   * Pre:  has to be properly constructed with its denominator and
   * numerator values
   *
   * Post: a string is output to represent the fraction
   *
   * Returns: numerator when denominator is 1
   *          infinity when denominator is 0
   *          -Infinity when the numerator is negative and the denominator is 0
   *          nan when the numerator and denominator are both 0
   *          returns both if otherwise
   *
   * Called by: main in system.out
   * Calls: none
   ************************************************************************/

  @Override
  public String toString() 
    {
    if (denominator == 1) // wehn the denominator is equal to 1
    {
      return "" + numerator; // returns only the numerator

    }

    else if (numerator > 0 && denominator == 0) // when the numerator is positive, but the
                             // denominator is zero, its positive Infinity
    {
      return "Infinity";
    }

    else if (numerator < 0 && denominator == 0) { // when the numerator is negative, but the
                               // denominator is zero, its negative Infinity
      return "-Infinity";
    }

    else if (numerator == 0
        && denominator == 0) { // when both the numerator and denominator are 0
                               // then its not a number
      return "NaN";
    }

    else {
      return "" + numerator + "/"
          + denominator; // if its neither of those cases then return numerator
                         // and denominator
    }
    }

    } // last bracket do not delete
