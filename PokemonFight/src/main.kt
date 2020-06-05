import java.lang.Thread.sleep
class welcome_game{
    var p_name=""
    init{
        print("Enter Name : ")
        p_name= readLine()!!
        println("\n------------------------  POKEMON FIGHT  ------------------------")
        sleep(1000)
        println("\nHello : "+p_name)
        sleep(1000)
        println("Welcome to Pokemon Fight")
    }
}
fun main() {
    val obj1 = welcome_game()
    val obj2 = pokemon()
    obj2.list_pokemon()
    obj2.choose_pokemon()
}