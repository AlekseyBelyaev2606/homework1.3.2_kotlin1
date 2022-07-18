import junit.framework.Assert.assertEquals
import org.junit.Test

class MainKtTest {
    @Test
    fun main(){

    }


    @Test
    fun limitDayTransfer(transfer: Int) {
        var transfer: Int = 300
        var sumMonth = 0
        var sumDay = 0
        var sumTransfer = 0

        val result = limitTransfer(transfer)

        assertEquals(transfer, result)
    }

    @Test
    fun unlimitDayTransfer(transfer: Int) {
        var transfer: Int = 300
        var sumMonth = 150000
        var sumDay = 150000
        var sumTransfer = 0

        val result = limitTransfer(transfer)

        assertEquals(transfer, result)
    }


    @Test
    fun masterCom(typeCard: String, transfer: Int, sumMonth: Int) {
        var transfer = 300
        var typeCard = "Master"

        val result = userCom(typeCard, transfer)

        assertEquals(300, result)
    }

    @Test
    fun maestroCom(typeCard: String, transfer: Int, sumMonth: Int) {
        var transfer = 300
        var typeCard = "Maestro"

        val result = userCom(typeCard, transfer)

        assertEquals(300, result)
    }

    @Test
    fun worldCom(typeCard: String, transfer: Int, sumMonth: Int) {
        var transfer = 300
        var typeCard = "Мир"

        val result = userCom(typeCard, transfer)

        assertEquals(300, result)
    }

    @Test
    fun visaCom(typeCard: String, transfer: Int, sumMonth: Int) {
        var transfer = 300
        var typeCard = "Visa"

        val result = userCom(typeCard, transfer)

        assertEquals(300, result)
    }

    @Test
    fun vkpayUserCom(typeCard: String, transfer: Int, sumMonth: Int) {
        var transfer = 1000
        var typeCard = "VK Pay"

        val result = userCom(typeCard, transfer)

        assertEquals(1000, result)
    }
}