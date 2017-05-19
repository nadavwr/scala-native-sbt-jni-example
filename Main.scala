import scala.scalanative.native._

@extern
@link("println0")
object binding {
  def println(s: CString): Unit = extern
}

object Main extends App {
  binding.println(c"Hello, world");
}

