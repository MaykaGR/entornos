fun ordenarMayor(listNum: ArrayList<Int>, cant: Int) {
    var tmp = 0
    for(x in 0 until cant) {
        for(y in 0 until cant) {
            if(listNum[x] > listNum[y]) {
                tmp = listNum[x]
                listNum[x] = listNum[y]
                listNum[y] = tmp
            }
        }
    }
    println("\nArray ordenado: $listNum")
}
fun ordenarMenor(listNum: ArrayList<Int>, cant: Int) {
    var tmp = 0
    for(x in 0 until cant) {
        for(y in 0 until cant) {
            if(listNum[x] < listNum[y]) {
                tmp = listNum[y]
                listNum[y] = listNum[x]
                listNum[x] = tmp
            }
        }
    }
    println("\nArray ordenado: $listNum")
}
fun main(Args: Array<String>) {
    val listNum = arrayListOf<Int>()
    var cant: Int
    var opt: Int
    var valor: Int
    print("¿Cuantos valores desea ingresar?: ")
    cant = readLine()!!.toInt()
    for(v in 1..cant) {
        print("Ingrese el valor #$v: ")
        valor = readLine()!!.toInt()
        listNum.add(valor)
    }
    println("\n" + """
        Selecciones una de las siguientes opciones
        ------------------------------------------
        1) Ordenar de mayor a menor
        2) Ordenar de menor a mayor
        ------------------------------------------
    """.trimIndent())
    print("Seleccione una opcion: ")
    opt = readLine()!!.toInt()
    when(opt) {
        1 -> ordenarMayor(listNum, cant)
        2 -> ordenarMenor(listNum, cant)
        else -> "Opcion no valida!!"
    }
}