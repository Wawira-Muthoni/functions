fun main(){
    myname("xtine")
    quotient(27,12)
    add(24,10,7,3)
    inter("i like sleeping too much")
}
fun myname(name:String){
    println("Hello" + name)
}

fun quotient(a: Int, b: Int){
    var result=a%b
    println(result)
}

fun add(a:Int, b:Int,c:Int,d:Int){
    var result = a+b+c+d
    println(result)
}

fun inter(funny:String){
    println("i like sleeping too much")
}