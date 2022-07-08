import junit.framework.Assert.assertEquals
import org.junit.Test

class MainKtTest {

    @Test
    fun limitTransfer(transfer: Int): Int {
        var transfer: Int = 300
        var sumMonth = 15000
        var sumDay = 3000
        var sumTransfer = 0

        val result = limitTransfer(transfer)

        assertEquals(transfer, result)
    }

    @Test
    fun userCom(typeCard: String, transfer: Int, sumMonth: Int) {
        var transfer = 300
        var typeCard = "VK Pay"

        val result = userCom(typeCard, transfer)

        assertEquals(300, result)
    }
}