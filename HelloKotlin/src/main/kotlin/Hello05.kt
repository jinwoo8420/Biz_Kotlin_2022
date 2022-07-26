/*
다양한 type의 return을 수행하는 함수
 */
fun anyFun() : Any? {
    return null
}

fun main() {

    // 일반적으로 선언한 변수는 절대 null 값을 가질 수 없다
    var str1 : String = "Korea"
    // str1 = null => null 저장 시 오류 발생

    // 변수에 ? 부착 시 null 값 할당 / 저장 가능
    var str2 : String ? = "Korea"
    str2 = null

    /*
    일반적인 변수는 초기화를 하면 고유한 type의 데이터만 저장 가능
    Any type 지정 시 여러가지 type의 데이터를 저장 가능
    java의 Object와 같은 type
     */

    var anyVar : Any = 0
    anyVar = "Korea"
}