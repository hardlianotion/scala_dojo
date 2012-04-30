package kata4


object Weather extends App {
  DataDiffer((8, 2), "data/weather.dat", """\*?\s+""", 0, (1, 2), x => x)
}
