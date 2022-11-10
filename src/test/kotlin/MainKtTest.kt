import junit.framework.Assert.assertEquals
import org.junit.Test
import java.time.Month

class MainKtTest {
    @Test
    fun main(){

    }


    @Test
    fun firstLimitDayTransfer(transfer: Int) {
        var transfer: Int = 300
        var sumMonth = 0
        var sumDay = 0
        var sumTransfer = 0

        val result = limitTransfer(transfer)

        assertEquals(transfer, result)
    }

    @Test
    fun secondLimitDayTransfer(transfer: Int) {
        var transfer: Int = 300
        var sumMonth = 150000
        var sumDay = 0
        var sumTransfer = 0

        val result = limitTransfer(transfer)

        assertEquals(transfer, result)
    }

    @Test
    fun threeLimitDayTransfer(transfer: Int) {
        var transfer: Int = 300
        var sumMonth = 0
        var sumDay = 15000
        var sumTransfer = 0

        val result = limitTransfer(transfer)

        assertEquals(transfer, result)
    }

    @Test
    fun fourlimitDayTransfer(transfer: Int) {
        var transfer: Int = 300
        var sumMonth = 0
        var sumDay = 0
        var sumTransfer = 300

        val result = limitTransfer(transfer)

        assertEquals(transfer, result)
    }

    @Test
    fun fiveLimitDayTransfer(transfer: Int) {
        var transfer: Int = 300
        var sumMonth = 0
        var sumDay = 0
        var sumTransfer = 300

        val result = limitTransfer(transfer)

        assertEquals(transfer, result)
    }


    @Test
    fun masterCom(typeCard: String, transfer: Int, sumMonth: Int) {
        var transfer = 300
        var typeCard = "Master"
        var sumMonth = 0

        val result = userCom(typeCard, transfer, sumMonth)

        assertEquals(300, result)
    }

    @Test
    fun maestroCom(typeCard: String, transfer: Int, sumMonth: Int) {
        var transfer = 300
        var typeCard = "Maestro"
        var sumMonth = 0

        val result = userCom(typeCard, transfer, sumMonth)

        assertEquals(300, result)
    }

    @Test
    fun worldCom(typeCard: String, transfer: Int, sumMonth: Int) {
        var transfer = 300
        var typeCard = "Мир"
        var sumMonth = 0

        val result = userCom(typeCard, transfer, sumMonth)

        assertEquals(300, result)
    }

    @Test
    fun visaCom(typeCard: String, transfer: Int, sumMonth: Int) {
        var transfer = 300
        var typeCard = "Visa"
        var sumMonth = 0

        val result = userCom(typeCard, transfer, sumMonth)

        assertEquals(300, result)
    }

    @Test
    fun vkpayUserCom(typeCard: String, transfer: Int, sumMonth: Int) {
        var transfer = 1000
        var typeCard = "VK Pay"
        var sumMonth = 0

        val result = userCom(typeCard, transfer, sumMonth)

        assertEquals(1000, result)
    }
}