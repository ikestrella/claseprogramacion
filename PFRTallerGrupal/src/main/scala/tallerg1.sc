//Pregunta 1

var sd=(a: Int, b: Int)=> if (a >= b) a else b:Int
sd(2,4)

val x=((a: Int, b: Int) => if (a >= b) a else b)
x(3, 2)

//Pregunta 2
def countWithoutOpenVowels(word: String, as: String): Boolean = {
  val lengthWithoutVowels = word.toLowerCase.replaceAll(as, "").length
  lengthWithoutVowels % 2 == 0
}
countWithoutOpenVowels("hola","a")

def getAverage(nums: List[Int]): Double = {
  if(nums.isEmpty) 0.0
  else nums.sum.toDouble / nums.size
}

case class Estudiante(nombre: String, edad: Int)
val estudiantes = List(Estudiante("Daniel", 21), Estudiante("Janneth", 23), Estudiante("Verónica", 22), Estudiante("Ramiro", 24))

def encontrarEstudianteMasJoven(estudiantes: List[Estudiante]): Estudiante = {
  estudiantes.maxBy(_.edad)
}

val estudianteMasJoven = encontrarEstudianteMasJoven(estudiantes)