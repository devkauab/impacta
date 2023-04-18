fun main(){
    var x: Double = 3.0
    var y: Double = 5.0
    var z: Double = 2.0
    var notas: Int = 3
    var media: Double = (x + y + z) / notas
    if(media > 6){
    println("aprovado")
    } else {
    var n4: Double = 10.0
    media = (media + n4) / 2
    if (media > 6){
    println("aprovado")
    } else {
    println("reprovado")
    }
    println(media)
    }
}