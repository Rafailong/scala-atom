import util.Random
import util.Properties

// we can import more that one object in the same line
// import util.Random, util.Properties

// we can combine de imports, too. like
// import util.{Random, Properties}

// we can change the name of the imported, like
// import util.{Random => R, Properties => P}

// and finally we can import all the content of a package, like
// import util._

val r = new Random
val p = Properties