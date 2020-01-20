object Generics
{
    class Box[A]
  {
    var contents: A = null.asInstanceOf[A]

  }
  def main(args: Array[String]): Unit =
  {
    val anIntBox = new Box[5]
    val aStringBox = new Box["Hello"]
    val anEmptyBox = new Box[Nothing]
    
    println(anIntBox.contents)
    println(aStringBox.contents)
    println(anEmptyBox.contents)
  }

}