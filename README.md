# lambdas

*General

A Lambda expression is a function that is declared, but immediately passed on as an expression. Also known as a "functional literal".


    //val sum: (Int, Int) -> Int = { x, y -> x + y }
    val sum = { x: Int, y: Int -> x + y }
    print("37 + 34 = ")
    println(sum(27,34))
A lambda expression in kotlin is always surrounded by curly braces, parameter declarations goes inside the parantheses and the body goes after the -> sign. 

Lambdas can also be used as parsing functions into other functions such as this example: 

    //A function taking a function
    fun <T> lick (bod: () -> T) : T {
        return bod();
    }
