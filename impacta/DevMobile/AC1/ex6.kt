fun par(x: Int, y: Int) {
    var cont: Int = 0
    for (valpares in x .. y){
        if (valpares % 2 == 0){
            contador += valpares
            println(cont)
        }
    }
}
fun impar(x: Int, y: Int) {
    var valimpares: Int = 0

    for (valor in x .. y){
        if (valor % 2 != 0){
            valimpares += 1
            println(valimpares)
        }
    }
}
fun main(){
    var x: Int = 1
    var y: Int = 800
    par(x, y)
    impar(x, y)
}