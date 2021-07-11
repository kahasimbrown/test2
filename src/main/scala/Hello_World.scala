import org.antlr.runtime.tree.RewriteEmptyStreamException
import scala.io.StdIn
import scala.Console.{BOLD, UNDERLINED,RESET}
import scala.collection.immutable.ListMap
import scala.collection.immutable.Seq
import scala.collection.immutable.Set
import scala.Console


object Hello_World {


  //Question #1
  def printout(): Unit = {
   // println("{")
    println("donum_name: Vanilla Donut,")
    println("quantity_purchased: 10,")
    println("price: 2.50")
   // println("}")
  }

  
  def NameandAge(): Unit = {
    //val name = readLine(s"${BOLD}Name: ${RESET}")
    //print(s"${UNDERLINED}${name}${RESET}")
    println()
    print(s"${BOLD}Age: ${RESET}")
    val age = readInt()
    print(s"${UNDERLINED}${age}${RESET}")
    println()
  }
  

  //Question #3
  def Character8th(): Char = {
    val str = "http:allaboutscala"
     println("The eighth character is: " + str(7))
    return str(7)
  }

  //Question #4
    def calculate(): Double = {
      val donut = 10
      val cost = 2.5
      val total = donut*cost
      println(total)
      return total
    }

    //Question #5
    def favoritemovie(): Unit = {
      println()
      println("What is your Favorite Movie?")
    }

    //Question #6
    def myfavorite(): Unit = {
      println()
      println("First Name: Kahasim")
      println("Last Name: Brown")
      println("Favortie Movie: Turn!")
      println("")
    }

    //Question #7
    def cast(): Unit = {
      val String = ("vanilla Donut", 10, 2.25)
      println(String)
      println()
    }

    //Question #8
    def mapso(): Unit = {
    var children1 = Map("Bill" -> 9, "Johny" -> 8, "Tommy" -> 11, "Cindy" -> 13)
    val sortchildren = ListMap(children1.toSeq.sortWith(_._1 > _._1):_*)
    println(sortchildren)
    println()
    }

    //Question #9(Sets)-Intersection
    def myset(): Unit = {
      val myset1 = Set("Cake","Milk","Cheese","Toilet Paper")
      val myset2 = Set("Bread","Water","Juice", "Milk", "Cheese")
      val s1 = myset1.intersect(myset2)
      println("Common items in the two shopping baskets: ")
      println(s1)
      println()
    }

    //Question #10
    def sequel(): Unit = {
      //var seq:Seq[Int] = Seq(100,101,102,103,104,105,106,107,108,109,110)
      //seq.foreach(element:Int) => print(element+",")
      //val seq = 100 to 110
      seq.foreach(print(element:Int))
      println(seq)
      println(100,101,102,103,104,105,106,107,108,109,110)
    }



    def main(args: Array[String]): Unit = {
    println("Hello, world!")
    //val name = readLine("Enter your name: ")
    println()


 

    //Call Methods or Questions:
   // NameandAge
    printout
    println()

    Character8th
    println()
    calculate
    favoritemovie
    myfavorite
    cast
    mapso
    myset
    sequel

  }
}
