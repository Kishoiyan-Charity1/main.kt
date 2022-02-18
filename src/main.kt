fun main() {
    greeting("Charity")
     modulus(45,6)
    add(20,45,34,56)
    interestingfact("i love music")


}
fun greeting(name:String) {
    println("hello" + name)

}
fun modulus(x:Int,y:Int){
    var modulus = x%y
    println(modulus)
}
fun add(a:Int,b:Int,c:Int,d:Int){
    var add = a+b+c+d
    println(add)
}
fun interestingfact(funfact:String){
    println(funfact)
}