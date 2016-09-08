import com.atomicscala.AtomicTest._

case class Employee(name:String, ID:Int)

val employee = Employee("Bob", 1130)
val Employee(employeeName, employeeID) = employee

employeeName is "Bob"
employeeID is 1130
