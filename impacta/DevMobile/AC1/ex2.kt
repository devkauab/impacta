fun calc(x: Int, y: Int){
    var dif: Int
    if (x > y){
    dif = x - y
    println("Maior: $x")
    println("Menor: $y")
    println("A diferença é $dif")
    } else {
    dif = y - x
    println("Maior: $y")
    println("Menor: $x")

    println("A diferença é $dif")
    }
}
fun main(){
    var x: Int = 60
    var y: Int = 50
    calc(x, y)
}