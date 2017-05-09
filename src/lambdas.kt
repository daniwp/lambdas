import java.util.*

/**
 * Created by Mikkel on 03/05/2017.
 */
fun main(args: Array<String>) {
    var ints = arrayListOf<Int>(1, 5, 2, 4, 3)

    val doubled = ints.map { it * 2 }
    println("Doubled values:")
    doubled.forEach { println("$it") }

    //val sum: (Int, Int) -> Int = { x, y -> x + y }
    val sum = { x: Int, y: Int -> x + y }
    print("37 + 34 = ")
    println(sum(27,34))

    //A function taking a function
    fun <T> lick (bod: () -> T) : T {
        return bod();
    }
    //Passing in our sum function as a lambda
    val s = lick {sum(21,31)}

    //Another function taking a collection and a function.
    fun <T> max(collection: Collection<T>, less: (T, T) -> Boolean): T? {
        var max: T? = null
        for (it in collection)
            if (max == null || less(max, it))
                max = it
        return max
    }


    fun getList(): List<Int> {
        val arrayList = arrayListOf(1, 5, 2)
        Collections.sort(arrayList, { x, y -> x - y })
        return arrayList
    }

    val si = Sick {x, y -> x+y};
    println("SI!")
    println(si.fuck(1,2));

    println(getList())
    println(ints.filter {it > 2})
    println(max(ints, {a, b -> a > b}))
    println(s)





}