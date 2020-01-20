object Patterns
{
    def main(args: Array[String]): Unit =
    {
      println(test(20))
      println(test("pizza"))
      println(test(5))
      println(test(Dollar(5)))
      println(test(Dollar(5,3)))
      println(test(Dollar(20)))
      println(test(Dollar(20,30)))
      println(test(Dollar(1,10)))
    }
    def test(item: Any) = item match
    {
     case s: String => item
     case i: Int => (item)
     case d5: Dollar
        if item.dollars == 5 => "Honest Abe"
     case d1: Dollar
        if item.dollars == 1 => "GW"
     case d20: Dollar
        if item.dollars == 20 && item.cents == 0 => "only AJ"
     case _ => "Forged"
    }
}