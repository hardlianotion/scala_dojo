/**
 * Created with IntelliJ IDEA.
 * User: etuka
 * Date: 26/04/2012
 * Time: 03:32
 * To change this template use File | Settings | File Templates.
 */

import collection.mutable.Stack
import org.scalatest.FunSpec


class WeatherSpec extends FunSpec {

  describe("Lines of Input") {

    it("be non-empty,") {
      val stack = new Stack[Int]
      stack.push(1)
      stack.push(2)
      assert(stack.pop() === 2)
      assert(stack.pop() === 1)
    }

    it("should throw NoSuchElementException if an empty stack is popped") {
      val emptyStack = new Stack[String]
      intercept[NoSuchElementException] {
        emptyStack.pop()
      }
    }
  }
}
