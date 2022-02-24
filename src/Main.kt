fun main(){
    greeting("xtine")
    modulus(57,2)
    add(25,56,70,43)
    interestingthing("Ilove sleeping")
 }
fun greeting(name:String){
    println("Hello "+name)
}
fun modulus(a:Int,b:Int){
    var modu = a%b
    println(a%b)
}
fun add(a:Int,b:Int,c:Int,d:Int){
    var sum = a+b+c+d
    println(sum)
}
fun interestingthing(name:String){
    println("I love sleeping")
}