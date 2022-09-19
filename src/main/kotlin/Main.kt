import java.util.Random

fun main() {
    val a = true
    val b = false
    val c = a and b  // false
    val d = (11 >= 5) and (9 < 10) // true

    val f = a or b  // true
    val z = a xor b // true

    val y = true
    val m = !y // false
    val m1 = y.not()

    val h = 5
    val g = h in 1..6  // true

    val h1 = 4
    val g1 = h1 in 11..15 // false

    // Аналогия switch case

    /*
    Java:
    int x = 10;
    switch(x) {
        case 10: sout("10"); break;
        case 12: sout("12"); break;
        default: sout("default");
    }
     */
   // var k = readLine()?.toInt()
    var k =10
    when(k) {
        10 -> {
            println(10)
            k *= 2
        }
        20 -> {
            println(20)
            k *= 5
        }
        else -> {

        }
    }
    println(k)

    var u = 30
    when(u) {
        20,30 -> println("20 or 30")
        else -> println("other")
    }

    val p = 20
    when(p) {
        !in 40..50 -> println("!40..50")
        in 10..21 -> println("10..21")
        else -> println("undefined")
    }

    val h2 = 20
    val h3 = 30
    val h4 = 40
    when (h2) {
        h3 - h4 -> println("h2 = h3 - h4")
        h3 - 10 -> println("!!!")
    }

    val z1 = 10
    val z2 = 20
    when(z1 + z2) {
        30 -> println("10+20")
    }

    // if ... else
    val p1 = 15
    val p2 = 6
    when {
        (p2 > 10) -> println("p2 > 10")
        (p1 > 10) -> println("p1 > 10")
    }

    // когда when возвращает значение
    val sum = 1000
    val s = when(sum) {
        in 100..999 -> 10
        in 1000..9999 -> 15
        in 10 downTo 1 -> 888
        else -> 20
    }

    var range = 1..5
    println(range::class)
    val range2 = "a".."d"
    val range3 = 1..10 step 2 // 1 3 5 7 9
    for(n in range3) {
        println("n = $n")
    }
    val range4 = 10..1 step 3 // 10 7 4  1
    val range5 = 1 until 9 // 1 ... 8
    val range6 = 1 until 9 step 2 // 1 3 5 7

    val range7 = 1..5
    var bb = 5 in range7  // true
    var pp = 6 !in range7 // true

    val range8 = 'a'..'d'
    for(c in range8) println(c)

    for(c in 1..9) println(c)
    for(c in 1 until 9) println(c) // 12345678
    for(c in 1..9 step 2) print(c) // 13579
    println()
    for(i in 1..9) {
        for (j in 1..9) {
            print("${i*j} \t")
        }
        println()
    }
    var i = 10
    while(i>0) {
        println(i*i)
        i--
    }
    var ii = -1
    do {
        println("ii = $ii")
        ii--
    } while(ii>0)
    
    // continue - переход  к следующей итерации
    for(n in 1..8) {
        if(n == 5) continue
        println(n*n)
    }
    
    // break - выход из цикла
    for(n in 1..6) {
        if(n == 5) break
        println(n*n)
    }

    val numbers: Array<Int> = arrayOf(1,2,3,4,5)
    val n = numbers[1] // 2
    numbers[2] = 7
    println("numbers[2] = ${numbers[2]}")

    val nums = Array(3,{5}) // [5,5,5]
    var j = 1
    val nums2 = Array(3, {j++ * 2}) // [2,4,6]

    for(number in numbers) {
        print("$number \t")
    }
    val peoples = arrayOf("Ivan","Petr","Oleg")
    for(p in peoples) {
        print("$p \t")
    }
    var v = 0
    while(v in peoples.indices) {
        println(peoples[v])
        v++
    }

    println(4 in numbers) // true
    println(2 !in numbers) // false


    // val numbers: Array<Int> = arrayOf(1,2,3,4,5)
    val numbers2: IntArray = intArrayOf(1,2,3,4,5)
    val doubles: DoubleArray = doubleArrayOf(2.4,4.7,1.2)
    val numbers3 = IntArray(4, {5})
    val doubles3 = DoubleArray(5, {1.5})

  //  arrPrint()
    // null
    var t: String? = "asdfh2342" // возможен null
    t = null
    //val l: Int = if (t != null) t.length else -1
    // elvis выражение
    val l: Int = t?.length ?: -1
    //println(l)
    sumEvenElements()

    infoUser("Ivan")
    infoUser("Petr",23,"Analytic")
    infoUser("Maria",25)
    infoUser(age=18,name="Alex")

    var nnn = IntArray(4)
    cc(nnn)
}
fun infoUser(name: String, age: Int = 20, spec: String = "programmer") {
    println("Name: $name, Age: $age, Speciality: $spec")
}
fun dd(n: Int) {
    // n = n * 2 // Ошибка
    println("n=$n")
}
fun cc(nn: IntArray) {
    nn[0] = nn[1] * 2
    println("nn[0] = ${nn[0]}")
}


fun sumEvenElements() {
    var rand = Random()
    var intAr = IntArray(20,{rand.nextInt(300)})
    var sum = 0
    for(i in intAr) {
        print(i.toString()+", ")
        if(i % 2 == 0) {
            sum += i
        }
    }
    println()
    println(sum)
}

fun arrPrint() {
    val table: Array<Array<Int>> = Array(3, { Array(5,{0})})
    table[0] = arrayOf(1,2,3,4,7)
    table[1] = arrayOf(4,3,2,5,9)
    table[2] = arrayOf(8,2,23,2,2)
    for(row in table) {
        for(cell in row) {
            print("$cell \t")
        }
        println()
    }
}
