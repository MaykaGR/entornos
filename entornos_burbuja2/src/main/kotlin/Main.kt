fun menorMayor(lista:IntArray, cant:Int): IntArray{
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

fun mayorMenor(lista:IntArray, cant:Int): IntArray{
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
    var lista = IntArray(cant)
    for (i in 0..cant-1){
        println("Introduce valor: ")
        lista[i]=readLine()?.toInt()?: 0
    }
    print("Lista: ")
    for(i in lista){
        print("$i,")
    }
    println()
    var listaOrdenada = menorMayor(lista,cant)
    print("Lista ordenada de menor a mayor: ")
    for (i in listaOrdenada){
        print("$i,")
    }
    println()
    listaOrdenada = mayorMenor(lista,cant)
    print("Lista ordenada de mayor a menor: ")
    for (i in listaOrdenada){
        print("$i,")
    }
    println()
}