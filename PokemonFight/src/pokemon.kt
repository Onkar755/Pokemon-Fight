import java.lang.Thread.sleep

open class pokemon {
    // Created 15 Pokemons with their health and attack points using Map
    val Pikachu = mapOf("health" to 50, "attack" to 5)
    val Bulbasaur = mapOf("health" to 45, "attack" to 4)
    val Charmandar = mapOf("health" to 35, "attack" to 3)
    val Blastoise = mapOf("health" to 30, "attack" to 3)
    val Snorlax = mapOf("health" to 40, "attack" to 4)
    val Electrode = mapOf("health" to 38, "attack" to 4)
    val Venusaur = mapOf("health" to 48, "attack" to 5)
    val Ninetales = mapOf("health" to 42, "attack" to 4)
    val Golduck = mapOf("health" to 50, "attack" to 6)
    val Raticate = mapOf("health" to 35, "attack" to 3)
    val Raikou = mapOf("health" to 33, "attack" to 3)
    val Gloom = mapOf("health" to 40, "attack" to 4)
    val Arcanine = mapOf("health" to 38, "attack" to 3)
    val Shellder = mapOf("health" to 45, "attack" to 5)
    val Persian = mapOf("health" to 42, "attack" to 4)

    //List of pokemon which are created above to play game
    val pokemons= listOf(Pikachu,Bulbasaur,Charmandar,Blastoise,Snorlax,Electrode,Venusaur,Ninetales,Golduck,Raticate,Raikou,Gloom,Arcanine,Shellder,Persian)
    val pokemon_list= listOf("Pikachu   ","Bulbasaur ","Charmandar","Blastoise ","Snorlax   ","Electrode ","Venusaur  ","Ninetales ","Golduck   ","Raticate  ","Raikou    ","Gloom     ", "Arcanine  ","Shellder  ","Persian   ")

    var first_pok = mapOf<String,Int>()
    var list= listOf(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14)
    var sec_pok=list.random() // select random pokemon for opponent from list of pokemons
    var second_pok=pokemons.get(sec_pok)

    var first_pok_name = ""
    var first_pok_hel :Int = 0
    var first_pok_atk :Int = 0
    var first_health1 :Int = 0
    var sec_pok_name = ""
    var sec_pok_hel :Int = 0
    var sec_pok_atk :Int = 0
    var sec_health1 :Int = 0
    var i = 1

    // function to print list of all pokemons which are available
    fun list_pokemon(){
        sleep(1000)
        println("\nChoose Your Pokemon from following \n")
        sleep(500)
        var j = 1
        for (i in 0..pokemon_list.size-1 step 3) {
            print("$j : " + pokemon_list[i])
            var i2=i+1
            j++
            print("\t\t\t$j : "+pokemon_list[i2])
            var i3=i+2
            j++
            print("\t\t\t$j : "+pokemon_list[i3]+"\n")
            j++
        }
    }

    // function to select your pokemon by pokemon id which are displayed above
    fun choose_pokemon() {
        sec_pok_name=pokemon_list[sec_pok]
        sec_pok_hel = second_pok.getValue("health")
        sec_pok_atk = second_pok.getValue("attack")
        sleep(1000)
        print("\nEnter your Pokemon id which you want: ")
        val p_id = readLine()
        when (p_id) {
            "1" -> {
                first_pok = pokemons.get(0)
                first_pok_name=pokemon_list[0]
                players()
                round()
            }
            "2" -> {
                first_pok = pokemons.get(1)
                first_pok_name=pokemon_list[1]
                players()
                round()
            }
            "3" -> {
                first_pok = pokemons.get(2)
                first_pok_name=pokemon_list[2]
                players()
                round()
            }
            "4" -> {
                first_pok = pokemons.get(3)
                first_pok_name=pokemon_list[3]
                players()
                round()
            }
            "5" -> {
                first_pok = pokemons.get(4)
                first_pok_name=pokemon_list[4]
                players()
                round()
            }
            "6" -> {
                first_pok = pokemons.get(5)
                first_pok_name=pokemon_list[5]
                players()
                round()
            }
            "7" -> {
                first_pok = pokemons.get(6)
                first_pok_name=pokemon_list[6]
                players()
                round()
            }
            "8" -> {
                first_pok = pokemons.get(7)
                first_pok_name=pokemon_list[7]
                players()
                round()
            }
            "9" -> {
                first_pok = pokemons.get(8)
                first_pok_name=pokemon_list[8]
                players()
                round()
            }
            "10" -> {
                first_pok = pokemons.get(9)
                first_pok_name=pokemon_list[9]
                players()
                round()
            }
            "11" -> {
                first_pok = pokemons.get(10)
                first_pok_name=pokemon_list[10]
                players()
                round()
            }
            "12" -> {
                first_pok = pokemons.get(11)
                first_pok_name=pokemon_list[11]
                players()
                round()
            }
            "13" -> {
                first_pok = pokemons.get(12)
                first_pok_name=pokemon_list[12]
                players()
                round()
            }
            "14" -> {
                first_pok = pokemons.get(13)
                first_pok_name=pokemon_list[13]
                players()
                round()
            }
            "15" -> {
                first_pok = pokemons.get(14)
                first_pok_name=pokemon_list[14]
                players()
                round()
            }
            else -> {
                println("\nPlease enter valid Id...")
                choose_pokemon()
            }
        }
    }

    // function to print pokemons which you are selected and opponent's pokemon
    fun players(){
        first_pok_hel  = first_pok.getValue("health")
        first_pok_atk = first_pok.getValue("attack")
        sec_health1 = sec_pok_hel
        first_health1 = first_pok_hel

        sleep(1000)
        println("\n---------------------------  Players  ---------------------------\n")
        sleep(1000)
        println("\t\t  You\t\t\t\t\t\t\t\t\tOpponent")
        println("\t   $first_pok_name\t\t\t\t\t\t\t   $sec_pok_name")
        println("\t   Health: $first_pok_hel\t\t\t   Vs  \t\t\t   Health: $sec_pok_hel")
        println("\t   Attack: $first_pok_atk\t\t\t\t\t\t\t   Attack: $sec_pok_atk")
        sleep(1000)
        println("\n-----------------------  Starting Fight  ------------------------\n")
    }

    // function to choose chance to attack first or second
    fun fight(){

        print("  You want to attack first(y/n) : ")
        val yn1= readLine()
        when(yn1){
            "y" ->{
                first_attack_yes()
            }
            "n" ->{
                first_attack_no()
            }
            else -> {
                println("Please Enter 'y' for yes or 'n' for No\n")
                fight()
            }
        }
    }

    // function to print round details
    fun round(){
        while(i != 6){
            sleep(1000)
            println("\n ---------------  Round : "+i+"  ---------------\n")
            i++
            fight()
        }
        result()
    }

    // function to print result
    fun result(){
        sleep(1000)
        println("\n---------------------------  Result  ----------------------------\n")
        sleep(2000)
        if(first_health1 == sec_health1) {
            println("\t\t\t\t\t\t  \uD83D\uDC4DFIGHT TIE \uD83D\uDC4D")
        }
        else if(first_health1 > sec_health1){
            println("\t\t\t\t\t\t  \uD83C\uDFC6 YOU Win \uD83C\uDFC6")
        }
        else{
            println("\t\t\t\t\t\t \uD83D\uDC4E\uD83C\uDFFB YOU LOSE \uD83D\uDC4E\uD83C\uDFFB")
        }
    }

    // function which is executed when you choose to attack first
    fun first_attack_yes(){
        sleep(1000)
        println("\n  You are attacking...")
        sleep(1000)
        println("  Opponent is attacking...")
        sleep(1000)
        sec_health1 = sec_health1 - first_pok_atk
        first_health1 = first_health1-sec_pok_atk

        println("\n  Your Health     : "+first_health1)
        println("  Opponent Health : "+sec_health1)
    }

    // function which is executed when you choose to attack second
    fun first_attack_no(){
        sleep(1000)
        println("\n  Opponent is attacking...")
        sleep(1000)
        println("  You are attacking...")
        sleep(1000)
        first_health1 = first_health1-sec_pok_atk
        sec_health1 = sec_health1 - first_pok_atk

        println("\n  Your Health     : "+first_health1)
        println("  Opponent Health : "+sec_health1)
    }
}




