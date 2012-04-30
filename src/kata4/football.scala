package kata4

object Football extends App {
  DataDiffer((5, 1), "data/football.dat", """(\.?\s+|-+)""", 1, (6, 7), scala.math.abs)
}

