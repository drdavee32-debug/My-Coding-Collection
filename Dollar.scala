case class Dollar(dollars:Int, cents:Int = 0)
{
  val inCents = ((dollars * 100) + cents)
  def + (dollar2:Dollar):Dollar =
  {
    var newCents = dollar2.inCents + this.inCents
    var newDollar = Dollar((newCents / 100), (newCents % 100))
    return newDollar
  }
  def * (dollar2:Dollar):Dollar =
  {
    var newCents = (dollar2.inCents) * (this.inCents)
    var newDollar = Dollar(newCents / 10000, (newCents % 100))
    return newDollar
  }
}


object Dollar
{
  def fromCents(cents:Int):Dollar =
  {
    var newDollar = Dollar((cents / 100), (cents % 100))
    return newDollar
  }
  def main(args: Array[String]): Unit =
  {
    val oneAndHalfDollar = Dollar(1,50)
    val twoDollar = Dollar(2,0)
    val aDollar = Dollar(1,0)
    val halfDollar = Dollar(0,50)
    val myNewDollar = (oneAndHalfDollar + twoDollar)

    println(Dollar(3,50) == myNewDollar)
    val myNewDollar2 = (myNewDollar * twoDollar)

    println(Dollar(7,0) == myNewDollar2)
    
    println(Dollar(1,0) == (aDollar * aDollar))
    
    println(Dollar(5,0) == (oneAndHalfDollar + twoDollar + aDollar + halfDollar))
   
  }
}