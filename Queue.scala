case class Queue[T](Number:List[T]) 
{
  //def theQ() = Number.map(Some)
  def dequeue() =  new Queue(Number.init)
  def enqueue(element:T) = new Queue(element::Number)
  def poll() =
  {
    try
    {
      Number.last
    }
    catch
    {
      case e: Exception => None
    }
  }
  def isEmpty() = (poll == None)
}
object GfG 
{  
    // Main method 
    def main(args:Array[String]) : Unit =
    {  
      val q = new Queue(List(1))
      val q1 = q.enqueue(2)
      println(q1.poll)
      val q2 = q1.dequeue()
      println(q2.poll)
      val q3 = q2.dequeue()
      println(q3.poll)
    
    } 
} 
