fun main() {

//    for(dan1 in 1..9){
//        for(dan2 in 1..9){
//            for(i in 1..9){
//                println("$dan1 * $dan2 * $i = ${dan1 * dan2 * i}")
//            }
//        }
//    }


    val human1 = Human();
    human1.id = 1;
    human1.name = "철수";
    human1.sex = "male";
    human1.age = 29;
    human1.home = "철원";
    println(human1)



}


class Human {
    var id: Int = 0;
    var name: String = "";
    var sex: String = "";
    var age: Int = 0;
    var home: String = "";

    override fun toString() : String {
        return "id : $id, name : $name, sex : $sex, age : $age, home : $home"
    }
}