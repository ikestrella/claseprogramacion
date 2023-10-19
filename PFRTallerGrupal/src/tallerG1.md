# Taller Grupal  1
## Funciones, funciones sin nombre y rangos

**Semana**: 2

**Objetivos**:

- Aplicar conocimientos básicos sobre funciones
- Comprender la características de Higher Order Functions o Funciones de Alto Orden
- Transformar funciones a funciones sin nombre y asignarlos a variables
- Usar algunas funciones de la clase Range

### Descripción:

Antes de empezar le recomiendo utilizar scala-cli, a través del comando

```shell
scala-cli repl
```

Debe crear una archivo con la extensión .sc, en donde pegará el código que necesite entregar, a ese archivo le denominaremos worksheet.

En este taller debe realizar algunos ejercicios los mismos que buscan que ponga en práctica lo aprendido en las horas de clases en donde se revisó conceptos como: funciones, funciones de alto orden y sus características, principalmente funciones que se asignan a variables. 

Muchos de los ejercicios incluyen código y algunos otros respuestas textuales, es por esto que para este taller, ustedes deben trabajar así: usando este mismo documento (el código fuente en markdown), responda a todas las preguntas, es decir, ubique el código y/o el texto según corresponda a la respuesta de cada pregunta, recuerde, que deben copiar el código que usó para responder a las preguntas en el worksheet. Recuerden que necesitará ambos documentos. Finalmente, al culminar con la actividad, deben presentarla a su docente.

Los ejercicios que deben desarrollar son los siguientes:

1. Funciones que se asignan a variables

Analice la siguiente función lambda que también se denomina como función sin nombre:

```scala
(a: Int, b: Int) => if (a >= b) a else b
```

Responda a las siguiente preguntas, respecto a la función sin nombre anterior:

- ¿El if que se encuentra es una estructura de control o una expresión?
- Es una estructura de expresion, ya que esta operando sobre una condicional tomando dos valores.
- ¿Qué devuelve la función?
- La funcion compara dos valores enteros (a y b), esta funcion siempre va a devolver el valor mas alto. En el caso de ser iguales devuelve el primer valor (a).
- ¿Se puede especificar el tipo de dato que devuelve la función sin nombre? Muestre ejemplos de los intentos realizados 
- Una manera que se puede especificar el tipo de dato de salida seria, asignando en ambos posibles resultados el tipo de dato que queremos, pero seria una sintaxis ambigua:
- Probamos de diferentes maneras:
- var sd=(a: Int, b: Int)=> if (a >= b):Int a else b
- var sd=(a: Int, b: Int)=> if (a >= b)( a else b):Int
- Pero la unica forma de poder hacer que devuelva un tipo de dato especifico es la siguiente:
- var sd=(a: Int, b: Int)=> if (a >= b) a:Int else b:Int
- Otra forma que seria la correcta es la siguiente:
- val x: (Int, Int) => Int = (a, b) => if (a >= b) a else b
- ¿Qué devuelve el siguiente código? <code>((a: Int, b: Int) => if (a >= b) a else b)(3, 2)</code>
- Devuelve el valor 3
- Asigne la función sin nombre a un valor (_val_) e invoque a la misma.
- val x=((a: Int, b: Int) => if (a >= b) a else b)
  x(3, 2) //out: 3
- ¿Se puede asignar una función sin nombre a una variable (**var**)? Muestre los ejemplos de sus intentos.
- Si se puede asignar como "var" como se muestra de la siguiente manera:
- var sd=(a: Int, b: Int)=> if (a >= b) a else b:Int

2. Usando como base a la siguiente función:

```scala
def countWithoutOpenVowels(word : String) : Int = { 
   word.toLowerCase.replaceAll("a", "").replaceAll("e", "").replaceAll("o", "").length
}
```
Responda a las siguientes preguntas:

   - a) ¿Es una función con nombre? 
   - si
   - b) ¿Cuántos parámetros recibe la función?
   - recibe un parametro
   - c) ¿Cuál o cuáles son los tipos de datos de el o de los parámetros que recibe la función?
   - recibe un parametro de tipo String
   - d) ¿Cuál es el tipo de dato que devuelve la función?
   - Devuelve un entero
   - e) ¿El uso de las llaves es necesario? (Demuestren su respuesta)
   - En este caso no es necesario
   - f) Qué salida genera la función si se invoca con los siguientes valores:
	   - Loja: 2
	   - Universidad: 9
	   - Particular: 8


3. Modifiquen la función anterior para que ahora devuelva el texto que recibe como párametro, pero sin los vocales cerradas (i y u)
   - def countWithoutOpenVowels(word : String) : String =
	 word.toLowerCase.replaceAll("i", "").replaceAll("u", "")
4. Transformen a las funciones de los puntos 2 y 3 en funciones sin nombre.
	- funcion punto 2: 
      - (word : String) => {
        word.toLowerCase.replaceAll("a", "").replaceAll("e", "").replaceAll("o", "").length:Int
        }
   - funcion punto 3:
     - (word : String)=> {
       word.toLowerCase.replaceAll("i", "").replaceAll("u", ""):String
       }
5. Ejecuten cada una de las funciones sin nombre, creadas en el punto 3, con los parámetros que se listan en el punto 2 y literal f.

6. Usando como base el código del punto 2, traten de crear una función sin nombre que reciba como párametros el texto y una letra que se desea omitir (reemplazar por cadena vacía) y que devuelve la longitud del nuevo texto.
- (word : String, dw: String) => {
  word.toLowerCase.replaceAll(dw, "").length
  :Int
  }
7. Modifiquen el código del punto 6 para que esta vez devuelve _true_ si la longitud del texto (valor devuelto en función anterior) es par, caso contrario devuelva _false_.
   - def countWithoutOpenVowels(word: String, as: String): Boolean = {
   val lengthWithoutVowels = word.toLowerCase.replaceAll(as, "").length
   lengthWithoutVowels % 2 == 0
   }
   countWithoutOpenVowels("hola","a")
8. Si recuerdan, en la actividad de práctica y experimentación de la semana pasada (ver archivo [b1s1.md](b1s1.md)) se usaron varias funciones, liste aquellas funciones (escritas en _Scala_) que reciben como parámetro a otra función sin nombre.
   def getAverage(nums: List[Int]): Double = {
   if(nums.isEmpty) 0.0
   else nums.sum.toDouble / nums.size
   }
9. Cuando se tiene un rango de datos o una lista de valores, existe un método que se llama _max_ que devuelve el mayor de los valores, así como se muestra en el siguiente código de ejemplo:

```scala

(1 to 10).max
val words = List("Universidad", "Técnica", "Particular", "de", "Loja")
words.max

```

Como de seguro se percató, se usa el orden natural del rango o lista de datos, es decir ascendente. Pero, si se quiere modificar ese criterio de ordenamiento, por ejemplo, en el caso de lista de palabras, que en lugar de usar el orden alfabético se use como criterio la longitud de cada palabra. Para esos casos se usará _maxBy_, como se muestra en el siguiente código:


```scala
words.maxBy(_.length)
```

Con esos antecedente, suponga que necesita trabajar con una lista de estudiantes, de los cuáles únicamente se usará el nombre y la edad. El siguiente código muestra en código la creación de los clase estudiante (_case class_) y como se agrupan en una lista.

```scala
case class Estudiante(nombre: String, edad: Int)
val estudiantes = List(Estudiante("Daniel", 21), Estudiante("Janneth", 23), Estudiante("Verónica", 22), Estudiante("Ramiro", 24))

```

Con base al código anterior, trabaje en los siguientes puntos:

   * ¿Qué sucede si ejecuta la siguiente sentencia? _estudiantes.max_
     * Cuando se pone .max da error ya que se esta operando sobre una lista de objetos
   * ¿Qué sucede si ejecuta la siguiente sentencia? _estudiantes.maxBy(e => e.edad)
     * Obtiene el item con la edad mayor.
   * Reemplace la función sin nombre que se encuentra en el punto anterior, por una función con nombre definida usando la palabra _def_ y todos los elementos que esto implica.
	 * def encontrarEstudianteMasJoven(estudiantes: List[Estudiante]): Estudiante = {
	 estudiantes.maxBy(_.edad)
	 }

     * val estudianteMasJoven = encontrarEstudianteMasJoven(estudiantes)

### Calificación:

La tarea se completa cuando usted cargue ambos archivos en: https://classroom.github.com/a/OuGdrgKg

Tal como se le explicó anteriormente, los talleres se calificarán de la siguiente manera:
- 10 puntos si presenta en el horario de prácticas y experimentación.
- 7 puntos presenta en el horario de tutoría