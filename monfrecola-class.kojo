clear()

class BouncingRect (x: Int, y: Int) {
  val pic = Picture.rectangle(100,100)
  pic.setFillColor(red)
  var vel = Vector2D(2,10)

  def draw() {
    pic.draw()

    }
} //> class BouncingRect

val br = new BouncingRect(-100, -100) //> val br: BouncingRect = BouncingRect@adb2a5a

br.draw()



