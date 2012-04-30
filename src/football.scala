/**
 * Created with IntelliJ IDEA.
 * User: etuka
 * Date: 27/04/2012
 * Time: 09:14
 * To change this template use File | Settings | File Templates.
 */
import datadiffer.DataDiffer

object Football extends App {
    DataDiffer((5,1),"data/football.dat", """(\.?\s+|-+)""",1, (6,7), scala.math.abs)
}

