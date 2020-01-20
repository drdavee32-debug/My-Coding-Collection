object hw3part2
{
    def printQueue(q:Queue) =
    {
        while(q.poll != None)
        {
            println(q.poll)
            q.dequeue()
        }
    }

    def punish(q:Queue): Queue = q match
    {
        val q1 = q
        val f = q.poll

        case Queue() if (f != None)
        {
            q.dequeue
            val s = q.poll
            if (s != None)
            {
                q.dequeue
                println(s, " may go")
                return (f :: q)
            }
            else 
            {
                return q1
            }
        }
        case _
        {
            println("no one may go")
            return q1
        }
        

    }

    def main(args:Array[String]) : Unit =
    {
        val q1 = new Queue(List("Davis", "Noah", "John"))
        q2 = q1.enqueue("Peter")
        printQueue(q2)
        val q3 = new Queue(List("Lian", "Dyer", "James"))
        printQueue(q3)
        val q4 = q3.dequeue()
        val q5 = q3.punish()
        printQueue(q4)
        val q6 = q4.punish()
        printQueue(q6)

    }


}