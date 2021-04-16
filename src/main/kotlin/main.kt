fun main() {

//    for(dan1 in 1..9){
//        for(dan2 in 1..9){
//            for(i in 1..9){
//                println("$dan1 * $dan2 * $i = ${dan1 * dan2 * i}")
//            }
//        }
//    }


    val human1 = Human(1,"철수", "male", 29, "철원");

    println(human1);

    val human2 = Human(2,"영희", "female", 30, "남원" );

    println(human2);


    val human3 = Human(3, "영수", "male", 31, "진천");

    println(human3);



}

// 일반 클래스
//class Human {
//    var id: Int = 0;
//    var name: String = "";
//    var sex: String = "";
//    var age: Int = 0;
//    var home: String = "";
//
//    // 인라인 메서드 - 한 줄일 떄 가능
//    fun introduceMsg() : String = "안녕하세요. 저는 $age 살 $name 입니다. 고향은 $home 입니다.";
//
//
//    override fun toString() : String = "id : $id, name : $name, sex : $sex, age : $age, home : $home"
//}


// 주생성자
//class Human (var id: Int,
//             var name: String,
//             var sex: String,
//             var age: Int,
//             var home: String){
//
//
//    // 인라인 메서드 - 한 줄일 떄 가능
//    fun introduceMsg() : String = "안녕하세요. 저는 $age 살 $name 입니다. 고향은 $home 입니다.";
//
//
//    override fun toString() : String = "id : $id, name : $name, sex : $sex, age : $age, home : $home"
//}

//데이터생성자
data class Human (var id: Int,
             var name: String,
             var sex: String,
             var age: Int,
             var home: String){



}