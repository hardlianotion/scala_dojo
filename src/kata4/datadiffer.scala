package kata4


object DataDiffer {
  def apply(crop: (Int, Int), path: String, delimiter: String, idIdx: Int, diffIdx: (Int, Int), fun: Int => Int) {
    val lines = scala.io.Source.fromFile(path).getLines.toList.drop(crop._1)
    val cleanLines = lines.take(lines.length - crop._2)
    val diffs = cleanLines.map(s => s.trim.split(delimiter).filter(_.nonEmpty)).
                  filter(_.nonEmpty).map(s => (s(idIdx), fun(s(diffIdx._1).toInt - s(diffIdx._2).toInt)))

    println(diffs.foldLeft(diffs(0))((l, r) => if (l._2 > r._2) r else l))
  }
}
