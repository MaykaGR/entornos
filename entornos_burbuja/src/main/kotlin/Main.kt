fun menorMayor(lista:MutableList<Int>, cant:Int): MutableList<Int>{
    val listaOrdenada = lista
    repeat (cant){
        var j = 0
        var j2= 1
        repeat(cant-1){
            var temporal: Int
        if(listaOrdenada[j]>listaOrdenada[j2]){
            temporal=listaOrdenada[j]
            listaOrdenada[j]=listaOrdenada[j2]
            listaOrdenada[j2]=temporal
        }
        j= j+1
        j2=j2+1}
    }
    return listaOrdenada
}

fun mayorMenor(lista:MutableList<Int>, cant:Int): MutableList<Int>{
    val listaOrdenada = lista
    repeat (cant){
        var j = 0
        var j2= 1
        repeat(cant-1){
            var temporal: Int
            if(listaOrdenada[j]<listaOrdenada[j2]){
                temporal=listaOrdenada[j]
                listaOrdenada[j]=listaOrdenada[j2]
                listaOrdenada[j2]=temporal
            }
            j= j+1
            j2=j2+1}
    }
    return listaOrdenada
}
fun main() {
var cant: Int?
println("Cantidad de valores a introducir: ")
    cant = readLine()?.toInt()?: 0
    var lista = mutableListOf<Int>()
    for (i in 0..cant-1){
        println("Introduce valor: ")
        lista.add(readLine()?.toInt()?: 0)
    }
    println(lista)
    println(menorMayor(lista,cant))
    println(mayorMenor(lista,cant))
}