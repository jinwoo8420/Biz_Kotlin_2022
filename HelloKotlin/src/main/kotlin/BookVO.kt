/*
data class는 반드시 생성자에 한 개 이상의 변수가 선언되어 있어야한다
 */

data class BookVO(var isbn : String) {
    // 생성자가 아닌 곳에 선언된 일반 속성 변수
    var title : String = ""
    var publisher = ""
    var pubdate = ""
    var price = 0
}

/*
default 값을 갖는 함수의 매개변수
함수의 매개변수에 값을 미릴 설정해 두면
함수를 호출 할 때 해달하는 변수 값을 생략 가능
 */

fun defaultValue(name:String, nation:String = "Korea"){
    println("$name 의 국적은 $nation 입니다")
}

fun main() {
defaultValue("김철수철수철수")
    defaultValue("김철수철수철수철수","미국")
}