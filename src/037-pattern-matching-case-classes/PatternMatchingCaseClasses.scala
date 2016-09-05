import com.atomicscala.AtomicTest._

case class Traveler(first:String, last:String)

case class Train(
  travelers:Vector[Traveler],
  line:String
)
case class Bus(
  passengers:Vector[Traveler],
  capacity:Int
)

def tranvel(t:Any):String = t match {
  case Train(travelers, line) => s"Train line $line $travelers"
  case Bus(travelers, seats) => s"Bus size $seats $travelers"
  case Traveler => "Walkin along!"
  case x => s"$x is in limbo!"
}

val travelers = Vector(
  Traveler("Rafa", "Avila"),
  Traveler("March", "Avila")
)

val trips = Vector(
  Train(travelers, "Reading"),
  Bus(travelers, 100)
)

tranvel(trips(0)) is "Train line Reading Vector(Traveler(Rafa,Avila), Traveler(March,Avila))"
tranvel(trips(1)) is "Bus size 100 Vector(Traveler(Rafa,Avila), Traveler(March,Avila))"
