fun calc(x: Double){
    var op1: Double = x * 0.3
    println("Acréscimo de 30%: Adicional de $op1")
    var op2: Double = x * 0.4
    println("Acréscimo de 40%: Adicional de $op2")
    var op3: Double = x * 0.5
    println("Acréscimo de 50%: Adicional de $op3")
    var op4: Double = x * 0.6
    println("Acréscimo de 60%: Adicional de $op4")

}
fun main(){
    var salario: Double = 1250.0
    calc(salario)
}