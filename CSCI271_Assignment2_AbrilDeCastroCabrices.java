/*************************************************************************
* Project 2 for CSCI 271-001 Spring 2026
*
* Author: Abril De Castro
* OS: Windows
* Compiler: javac 25.0.1
* Date: february 5th, 2026
*
* Purpose
* this program performs arithmetic calculations, and return them as fractions
* to avoid floating number division
*
*************************************************************************/

/*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet, either
* modified or unmodified.
* - If any source code or documentation used in my program was
* obtained from other sources, like a text book or course notes,
* I have clearly indicated that with a proper citation in the
* comments of my program.
* - I have not designed this program in such a way as to defeat or
* interfere with the normal operation of the supplied grading code.
*
* <Abril De Castro>
********************************************************************/
public class CSCI271_Assignment2_AbrilDeCastroCabrices
{
	public static void main(String[] args) {
	   
	   // 16 / 3/5 + 7 * 6/7
	   Fraction a = new Fraction(16);
	   Fraction b = new Fraction(3,5).add(new Fraction(7));
	   Fraction c = new Fraction(6,7);
	   Fraction results = c.multiply(a.divide(b));
	   System.out.println(results); 
	   
	   // 16/ 14 * 6
	   Fraction d = new Fraction(16,14);
	   Fraction e = new Fraction(6);
	   Fraction results1 = d.multiply(e);
	   System.out.println(results1); 
	    
	   // 0/ 9 + -1/0
	   Fraction f = new Fraction(0,9);
	   Fraction g = new Fraction(-1,0);
	   Fraction results2 = f.add(g);
	   System.out.println(results2); 
	   
	   // 106/9 + 8/9 / 3
	   Fraction h = new Fraction(16,9);
	   Fraction i = new Fraction(3).pow(-3);
	   Fraction j = new Fraction(8,9).negate();
	   Fraction results3 = h.add(j.divide(i));
	   System.out.println(results3); 
	   
	   // 6/7 * -67 * (67 + 6/7)
	   Fraction k = new Fraction(-1).negate();
	   Fraction l = new Fraction(-6).add(new Fraction(6));
	   Fraction m = new Fraction(7);
	   Fraction results4 = m.multiply(k.multiply(l));
	   System.out.println(results4); 
	
	    
	   // 0/0 / 0/0
	   Fraction n = new Fraction(0,0);
	   Fraction o = new Fraction(0,0);
	   Fraction results5 = n.divide(o);
	   System.out.println(results5); 
	   
	   // 0/0 / 0/0
	   Fraction p = new Fraction(9,0);
	   Fraction q = new Fraction(10);
	   Fraction results6 = q.add(p);
	   System.out.println(results6);
	    
	   // 2 + 10 + 7 ^ 3
	   Fraction r = new Fraction(2);
	   Fraction s = new Fraction(7).pow(3);
	   Fraction t = new Fraction(10).add(s);
	   Fraction results7 = t.add(r);
	   System.out.println(results7);
	   
	   // 2 + 10 + 7 ^ 3
	   Fraction u = new Fraction(4).negate();
	   Fraction v = new Fraction(10).pow(3);
	   Fraction w = new Fraction(7).negate();
	   Fraction results8 = v.divide(u.multiply(w));
	   System.out.println(results8);
	   
	   // 2 + 10 + 7 ^ 3
	   Fraction x = new Fraction(4).pow(2);
	   Fraction y = new Fraction(5).pow(3).negate();
	   Fraction z = new Fraction(8);
	   Fraction results9 = x.divide(y.multiply(z));
	   System.out.println(results9);
	    
	   
	   
	}
}
