object Sequential
{
    def main(args: Array[String]) : Unit =
    {
        var list1 = List.range(1, 100001)
        println(list1.length)
        list1 = list1.filter(_ % 13 == 0)
        println(list1.length)
        println(list1.last)
        println(list1.sum)
        list1 = (13 :: list1.tail.map(_*(-1)))
        println((list1).sum)
        list1 = list1 ++ List.range(5,301)
        println(list1.length)
        println(list1.head)
      

    }
}
