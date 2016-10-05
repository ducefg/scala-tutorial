package week01

object TailRecursion {
	//@tailrec
	def gcd(a: Int, b: Int): Int =
		if (b == 0) a else gcd(b, a % b)  //> gcd: (a: Int, b: Int)Int
		
	gcd(14, 21)                               //> res0: Int = 7
	
	def factorial(n: Int): Int =
		if (n == 0) 1 else n * factorial(n - 1)
                                                  //> factorial: (n: Int)Int
		
	factorial(4)                              //> res1: Int = 24
}