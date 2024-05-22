import com.abc.geometry.Shape
import com.abc.geometry.ShapeStatistics
import com.r.geometry.domain.Rectangle
import com.r.geometry.domain.Square

// team lead

def r1 = new Rectangle(length: 4.5, breadth: 2.3)
// println r1.area()
// println r1.perimeter()
println r1 // println r1.toString()

ShapeStatistics.printStats r1

def s1 = new Square(side: 5)
ShapeStatistics.printStats s1

// one cannot instantiate or create an object of abstract class
// new Shape()