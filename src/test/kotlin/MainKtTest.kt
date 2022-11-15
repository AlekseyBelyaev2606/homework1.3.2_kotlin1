import junit.framework.Assert.assertEquals
import org.junit.Test

class MainKtTest {

    @Test
    fun firstLimitDayTransfer() {
        var transfer: Int = 300
        var sumMonth = 0
        var sumDay = 0
        var sumTransfer = 0

        val result = limitTransfer(transfer, sumMonth, sumDay, sumTransfer)

        assertEquals(transfer, result)
    }

    @Test
    fun secondLimitDayTransfer() {
        var transfer: Int = 300
        var sumMonth = 150000
        var sumDay = 0
        var sumTransfer = 0

        val result = limitTransfer(transfer, sumMonth, sumDay, sumTransfer)

        assertEquals(0, result)
    }

    @Test
    fun threeLimitDayTransfer() {
        var transfer: Int = 300
        var sumMonth = 0
        var sumDay = 15000
        var sumTransfer = 0

        val result = limitTransfer(transfer, sumMonth, sumDay, sumTransfer)

        assertEquals(0, result)
    }

    @Test
    fun fourlimitDayTransfer() {
        var transfer = 300
        var sumMonth = 0
        var sumDay = 0
        var sumTransfer = 300

        val result = limitTransfer(transfer, sumMonth, sumDay, sumTransfer)

        assertEquals(600, result)
    }

    @Test
    fun fiveLimitDayTransfer() {
        var transfer: Int = 300
        var sumMonth = 150000
        var sumDay = 15000
        var sumTransfer = 300

        val result = limitTransfer(transfer, sumMonth, sumDay, sumTransfer)

        assertEquals(300, result)
    }


    @Test
    fun masterCom() {
        var transfer = 500
        var typeCard = "MasterCard"
        var sumMonth = 0

        val result = userCom(typeCard, transfer, sumMonth)

        assertEquals(0, result)
    }

    @Test
    fun maestroCom() {
        var transfer = 200
        var typeCard = "Maestro"
        var sumMonth = 0

        val result = userCom(typeCard, transfer, sumMonth)

        assertEquals(21, result)
    }

    @Test
    fun worldCom() {
        var transfer = 500
        var typeCard = "Мир"
        var sumMonth = 0

        val result = userCom(typeCard, transfer, sumMonth)

        assertEquals(37, result)
    }

    @Test
    fun visaCom() {
        var transfer = 100
        var typeCard = "Visa"
        var sumMonth = 0

        val result = userCom(typeCard, transfer, sumMonth)

        assertEquals(35, result)
    }

    @Test
    fun vkpayUserCom() {
        var transfer = 1000
        var typeCard = "VK Pay"
        var sumMonth = 0

        val result = userCom(typeCard, transfer, sumMonth)

        assertEquals(0, result)
    }
}