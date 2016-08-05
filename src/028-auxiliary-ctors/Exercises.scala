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