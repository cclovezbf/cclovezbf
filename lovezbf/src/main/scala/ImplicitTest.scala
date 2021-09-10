object ImplicitTest {
  implicit def dogToPerson(dog:Dog)={
    val name: String = dog.name
    new Person(name)
  }
  def main(args: Array[String]): Unit = {
    new Dog("二哈").say1()
    var xx = (x: Int) => x + 1
    def xx1 = (x: Int) => x + 1
    List(1,2,3).map(xx1)
  }
}

 class Person(name : String){
  def  say1(): Unit ={
    println("我是人"+name)
  }
}
 class Dog(val name : String){
  def  say(): Unit ={
    println("我是狗"+name)
  }
}
