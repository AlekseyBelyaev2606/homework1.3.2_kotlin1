fun main() {
    val limits = limitTransfer(50, 0, 0, 0)
    val commission = userCom("VK Pay", 50, 0)
    val result = limits + commission
    println(result)
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


fun limitTransfer(
    transfer: Int,
    sumMonth: Int = 0,
    sumDay: Int = 0,
    sumTransfer: Int
): Int {
    var a = when {
        (sumMonth < 40000 && sumDay < 15000) -> transfer
        else -> 0
    }

    return sumTransfer + a
}



