import kotlin.reflect.typeOf

fun main(args: Array<String>) {
    println("Hello World!")

    val nb = 5_412_521_631
    println(nb)


    val reel = 42.0

    val initial = 42
    val reel2: Double = initial.toDouble()



    val firstname = "Zaza"
    val lastname = "Vanderquack"

    val text1 = "Bonjour, je m'appelle " + firstname + " " + lastname + "."
    val text2 = "Bonjour, je m'appelle $firstname $lastname."

    println(text1)
    println(text2)
    println()



    val blocText1 = "Riri\n" +
            "Zaza\n" +
            "Fifi\n" +
            "Della"

    val blocText2 = """
        Riri
        Zaza
        Fifi
        Della
    """.trimIndent()

    val blocText3 = """
        |Riri
        |Zaza
        |Fifi
        |Della
    """.trimMargin()

    val blocText4 = """
        #Riri
        #Zaza
        #Fifi
        #Della
    """.trimMargin("#")

    println(blocText2)
    println(blocText3)
    println(blocText4)
    println()


    val r1 = 1..5
    val r2 = 5 downTo  1
    val r3 = "A".."Z"

    println(r1)
    println(r2)
    println(r3)
    println()


    val t1 = "toto"
    val t2 = "toto"
    var t3 = "to"
    t3 += "to"

    println("Test structurel (Contenu)")
    println("t1 == t2 -> ${t1 == t2}")      // true
    println("t1 == t3 -> ${t1 == t3}")      // true


    println("Test referentiel (Ref mémoire)")
    println("t1 === t2 -> ${t1 === t2}")    // true (Dû à une optimisation memoire)
    println("t1 === t3 -> ${t1 === t3}")    // false
    println()



    val plageAO = "A".."O"

    val lettre1 = "C"
    val lettre2 = "O"
    val lettre3 = "Y"
    val lettre4 = "e"

    val testLettre1 = plageAO.contains(lettre1)
    val testLettre2 = plageAO.contains(lettre2)
    val testLettre3 = plageAO.contains(lettre3)
    val testLettre4 = plageAO.contains(lettre4)

    println("$lettre1 -> $testLettre1")
    println("$lettre2 -> $testLettre2")
    println("$lettre3 -> $testLettre3")
    println("$lettre4 -> $testLettre4")
    println()



//    print("Saisie 1 : ")
//    val input1: String = readLine()!!
//
//    print("Saisie 2 (null allow) : ")
//    val input2: String? = readLine()
//
//    println("Fini !")


    print("Un nombre : ")
    val number : Int = readLine()!!.toInt()

    when {
        number == 0 -> println("La valeur est 0")
        number > 0 -> {
            println("La valeur est positive !")
            println("Hello !")
        }
        else -> {
            println("La valeur est negative !")
            println("World !")
        }
    }

    val desc:String = when(number) {
        0 -> "La valeur vaut zero !"
        in 1..Int.MAX_VALUE -> "La valeur est positive"
        else -> "La valeur est negative"
    }

    val desc2 : String
    when(number) {
        0 -> desc2 = "La valeur vaut zero !"
        in 1..Int.MAX_VALUE -> desc2 = "La valeur est positive"
        else -> desc2 = "La valeur est negative"
    }

}