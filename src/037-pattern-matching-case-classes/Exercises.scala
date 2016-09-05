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
case class Plane(
  name:String,
  passengers:Vector[Traveler]
)

def tranvel(t:Any):String = t match {
  case Train(travelers, line) => s"Train line $line $travelers"
  case Bus(travelers, seats) => s"Bus size $seats $travelers"
  case Plane(name, travelers) => s"Plane $name $travelers"
  case t:Traveler => s"${t.first} is walking"
  case x => s"$x is in limbo!"
}

val travelers = Vector(
  Traveler("Rafa", "Avila"),
  Traveler("March", "Avila")
)

val trips = Vector(
  Train(travelers, "Reading"),
  Bus(travelers, 100),
  Plane("B757", travelers)
)

tranvel(trips(0)) is "Train line Reading Vector(Traveler(Rafa,Avila), Traveler(March,Avila))"
tranvel(trips(1)) is "Bus size 100 Vector(Traveler(Rafa,Avila), Traveler(March,Avila))"
tranvel(trips(2)) is "Plane B757 Vector(Traveler(Rafa,Avila), Traveler(March,Avila))"
tranvel(travelers(0)) is "Rafa is walking"
