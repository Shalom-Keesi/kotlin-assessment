import kotlin.time.times

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    println(listOf({statement}))
//    sentence(statement="")

    var array= arrayOf(10,20,30,40)
    println(array.sum())
    println(array.count())
    println(array.sum()/array.count())

    isPalindrome(word = "mayday")


}

fun sentence(statement:String){
    var statement="Barnie bakes brown bagels and buns"


}
fun arr1(array: Array<Int>):Int{

    return array.sum()
    return array.count()
    return array.sum()/array.count()
}

fun sphere(){
    var radius="r"
    var volume=4/3 * 3.14159
    println(volume)
}

fun isPalindrome(word:String):Boolean{
    if (word==word.reversed())
    return(true)
    else{
        return(false)
    }

}


