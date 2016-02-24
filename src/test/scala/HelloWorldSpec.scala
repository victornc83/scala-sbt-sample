import org.scalatest._

class HelloWorldSpec extends FlatSpec with Matchers {
  "HelloWorld" should "have tests" in {
    true should === (true)
  }
}
