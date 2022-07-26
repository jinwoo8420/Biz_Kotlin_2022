/*
public / private / protected를 붙이지 않아도 기본 값이 public
 */

class Korea {
    fun name() : String="대한민국"
}

fun main() {
    // Korea 클래스 타입의 name 객체를 선언하고 Korea() 생성자 호출하여 객체 상성
    val korea : Korea = Korea()
    println(korea.name())

    var korea1 = Korea()
    println(korea1.name())
}