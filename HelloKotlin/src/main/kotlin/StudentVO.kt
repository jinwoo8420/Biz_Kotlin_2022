/*
Kotlin의 vo 클래스 생성
 */

data class StudentVO(
    var st_num : String,
    var st_name : String,
    var st_dept : String,
    var st_tel : String,
    var st_addr : String
)

fun main() {
    val student = StudentVO("S001","김철수",
        "컴공과","010-1111-1111","서울특별시")

    println(student.toString())
    println("이름 : ${student.st_name}")
    student.st_name = "김철수철수"

    println(student.toString())
}