fun calc(x: Int, y: Int, z: Int){
    if (x <= 100 || x >= 1000){
    println("$x esta no range")
    } else {
    println("$x esta fora do range")
    }
    if (y <= 100 || y >= 1000){
    println("$y esta no range")
    } else {
    println("$y esta fora do range")
    }
    if (z <= 100 || z >= 1000){
    println("$z esta no range")
    } else {
    println("$z está fora do range")
    }
}
fun main(){
    var x: Int = 10
    var y: Int = 150
    var z: Int = 1001
    calc(x,y,z)
}