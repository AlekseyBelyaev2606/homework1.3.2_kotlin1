fun main() {
    val limits = limitTransfer(50)
    val commission = userCom("VK Pay", 50, 0)
    val result = limits + commission
}

fun userCom(typeCard: String, transfer: Int, sumMonth: Int
): Int {
    val fee = when (typeCard) {
        "MasterCard", "Maestro" -> if (transfer > 300 && sumMonth < 75000) 0 else transfer * 0.006 + 20
        "Visa", "Мир" -> if (transfer * 0.075 > 35) transfer * 0.075 else 35
        else -> 0.0
    }
    return fee.toInt()
}


fun limitTransfer(transfer: Int): Int {
    var transfer: Int = 0
    var sumMonth = transfer++
    var sumDay = transfer++
    var sumTransfer = 0
    when {
        sumTransfer < 40000 && sumDay < 15000 -> sumTransfer = transfer++
        else -> println("Вы превысили доступные лимиты")
    }
    return sumTransfer
}



