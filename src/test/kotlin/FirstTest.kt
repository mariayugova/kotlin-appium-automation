import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.android.AndroidElement
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.openqa.selenium.remote.DesiredCapabilities
import java.net.URL

class FirstTest {

    @Throws(Exception::class)
    @Before
    fun setUp() {
        val capabilities = DesiredCapabilities()
        capabilities.setCapability("platformName","Android")
        capabilities.setCapability("deviceName","AndroidTestDevice")
        capabilities.setCapability("platformVersion","8.0")
        capabilities.setCapability("automationName","Appium")
        capabilities.setCapability("appPackage","org.wikipedia")
        capabilities.setCapability("appActivity",".main.MainActivity")
        capabilities.setCapability("app","/Users/maria/Desktop/KotlinAppiumAutomation/apks/org.wikipedia.apk")

        driver = AndroidDriver(URL("http://127.0.0.1:4723/wd/hub"), capabilities)
    }

    @After
    fun tearDown(){
        driver.quit()
    }

    @Test
    fun firstTest(){
        println("First Test run")
    }

    companion object{
        lateinit var driver: AndroidDriver<AndroidElement>
    }
}