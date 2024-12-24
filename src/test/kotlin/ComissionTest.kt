import org.junit.Test
import kotlin.test.assertEquals


class ComissionTest {

    @Test
    fun testVisa1() {

        val card = "Visa"
        val formerTransfers = 0
        val currentTransfer = 1000.0

        val commission = commission(card, formerTransfers, currentTransfer)
        assertEquals<Any>(35.0, commission)
    }

    @Test
    fun testVisa2() {

        val card = "Visa"
        val formerTransfers = 0
        val currentTransfer = 60000.0

        val commission = commission(card, formerTransfers, currentTransfer)
        assertEquals<Any>(450.0, commission)
    }

    @Test
    fun testMastercard1() {

        val card = "Mastercard"
        val formerTransfers = 0
        val currentTransfer = 1000.0

        val commission = commission(card, formerTransfers, currentTransfer)
        assertEquals<Any>(0.0, commission)
    }

    @Test
    fun testMastercard2() {

        val card = "Mastercard"
        val formerTransfers = 1000
        val currentTransfer = 75000.0

        val commission = commission(card, formerTransfers, currentTransfer)
        assertEquals<Any>(26.0, commission)
    }

    @Test
    fun testMastercard3() {

        val card = "Mastercard"
        val formerTransfers = 76000
        val currentTransfer = 10000.0

        val commission = commission(card, formerTransfers, currentTransfer)
        assertEquals<Any>(80.0, commission)
    }


    @Test
    fun testMir() {

        val card = "Мир"
        val formerTransfers = 0
        val currentTransfer = 1000.0

        val commission = commission(card, formerTransfers, currentTransfer)
        assertEquals<Any>(0.0, commission)
    }

    @Test
    fun testDailyLimit() {

        val card = "Мир"
        val formerTransfers = 150000
        val currentTransfer = 1000.0

        val commission = commission(card, formerTransfers, currentTransfer)
        assertEquals<Any>(-1.0, commission)
    }

}