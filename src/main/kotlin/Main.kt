fun main() {
   oddNumbers()
    robot(4)
    robot(9)
    robot(6)
    robot(17)
    numArrays(1)
    println(person(arrayOf("Becky","Herjok","School","John") ))
}
fun oddNumbers(){
    for (numbers in 1..100)
        if(numbers % 2!=0){
        println(numbers)
    }
    else{
        println("Other numbers")
        }
}
fun person(names:Array<String>): Int{
    var name1=0
    for( name in names) {
     if (name.length>5){
        name1++
     }
    }
    return name1
}
fun robot(ages:Int){
    when(ages){
        0,1,2,3,4,5-> println("Glass of milk")
        6,7,8,8,9,10,11,12,13,14,15-> println("Bottle of fanta orange")
        else-> println("Bottle of coca cola")
    }
}
fun numArrays(num: Int) {
    for (num in 1..100)
        if (num%3==0){
            println("Fizz")
        }
    else if (num%5==0){
        println("Buzz")
        }
    else if (num%3==0 && num%5==0){
        println("Fizzbuzz")
        }
    else{
        println("Not among")
        }
}
