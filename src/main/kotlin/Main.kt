fun main(args: Array<String>) {

    // operators

    //mathematical operators
    var x: Int? //dealing with null values
    x = 20
    val y = 20
    var result = x * y
    println(result)

    //increment and decrement
    //post and pre
    println(result++)
    println(result)

    //comparison operators
    if(x != y){
        println("x is equal to y")
    }else{
        println("x is less than y")
    }

    //casting
    val a: String = "3"
    val b = a.toInt()
    println(b)

    //string
    var name = "human"
    val school = "zalego"
    val age = 10
    //string template
    println("my name is $school and i come from $name")

    //string template with curly braces
    println("my name is ${age}+20 and i come from $name")
}
