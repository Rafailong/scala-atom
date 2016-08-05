import com.atomicscala.AtomicTest._

// 1
class ClothesWasher(val modelName:String, val capacity:Double) {
  def this(modelName:String) { this(modelName, 20.0) }
  def this(capacity:Double) { this("modelName", capacity) }
}

val clothesWasher1 = new ClothesWasher("model1")
clothesWasher1.modelName is "model1"
clothesWasher1.capacity is 20.0

val clothesWasher2 = new ClothesWasher(10.0)
clothesWasher2.modelName is "modelName"
clothesWasher2.capacity is 10.0

// 2
class ClothesWasher2(val modelName:String = "modelName", val capacity:Double = 20.0) {
  def this(model:String) { this(modelName = model) }
  def this(cty:Double) { this(capacity = cty) }
}

val clothesWasher2a = new ClothesWasher("model1")
clothesWasher2a.modelName is "model1"
clothesWasher2a.capacity is 20.0

val clothesWasher2b = new ClothesWasher(10.0)
clothesWasher2b.modelName is "modelName"
clothesWasher2b.capacity is 10.0

// 4
class ClothesWasher3(val modelName:String, val capacity:Double) {
  def this(modelName:String) { this(modelName, 20.0) }
  def this(capacity:Double) { this("modelName", capacity) }

  def wash():String = "Simple wash"
  def wash(bleach:Int, fabricSoftener:Int):String = s"Wash used $bleach bleach and $fabricSoftener fabric softener"
}
val washer = new ClothesWasher3("LG 100", 3.6)
washer.wash(2, 1) is "Wash used 2 bleach and 1 fabric softener"
washer.wash() is "Simple wash"