fun main() {

    for(dan1 in 1..9){
        for(dan2 in 1..9){
            for(i in 1..9){
                println("$dan1 * $dan2 * $i = ${dan1 * dan2 * i}")
            }
        }
    }
}