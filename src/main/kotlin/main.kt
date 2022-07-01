fun main (){
    val limits = limitTransfer(0,0,50)
    val commission = userCom("VK Pay", 50, 0)
    println(commission)
}

fun userCom(typeCard: String, sumTransfer: Int, sumMonth: Int) = when(typeCard){
    "MasterCard", "Maestro" -> if (sumTransfer > 300 && sumMonth < 75000) 0 else sumTransfer * 0.006 + 20
    "Visa", "Мир" -> if (sumTransfer * 0.075 > 35) sumTransfer * 0.075 else 35
    else -> 0.0
}

fun limitTransfer(sumMonth: Int, sumDay: Int, sumTransfer: Int){
    var sumMonth = 40000
    var sumDay = 15000
    var sumTransfer = 0
    var transfer = 0
    when{
        sumTransfer < 40000 && transfer < 15000 -> sumTransfer += transfer
        else -> println("Вы превысили доступные лимиты")
    }
}



