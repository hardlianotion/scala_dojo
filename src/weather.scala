/**
 * Created with IntelliJ IDEA.
 * User: etuka
 * Date: 26/04/2012
 * Time: 02:27
 * To change this template use File | Settings | File Templates.
 */
import datadiffer.DataDiffer

object Weather extends App {
  DataDiffer((8,2),"data/weather.dat", """\*?\s+""",0, (1,2), x => x)
 }
