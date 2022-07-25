// 두개의 정수형 매개변수를 받고 int형 return을 하는 함수 선언
fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun main() {
    var result = add(100,200)
    println(result)

    var radius = 30
    println("반지름 : ${radius} 원둘레 : ${radius * 2 * Math.PI} 원의 넓이 : ${radius * radius * Math.PI}")

    // 문자열을 배열처럼 부분 문자 추출 가능
    var nation = "Korea"
    println("${nation[0]}")
    println("${nation[1]}")
    println("${nation[2]}")

    // raw 문자열
    nation = """
        republic of Korea
        대한민국
        우리나라
    """
    // 앞쪽 빈칸 제거 (줄바꿈은 유지)
    println(nation.trimIndent())

    /*
    * java에서는 배열은 모든 요소가 type이 같아야 한다
    * Kotlin은 요소의 type이 달라도 된다
    */
    val arr = arrayOf(1,"Korea",true)
    println("${arr[0]}, ${arr[1]}")

    /*
        배열.size = 배열의 개수
        배열.get(첨자) = 첨자 위치의 값 얻기 - 사용 권장 X
     */
    println("${arr.size}, ${arr.get(0)}")

    // 정수형 배열 선언 후 값 초기화
    val arr1 = intArrayOf(3,4,5,6,7,8,9)

    /*
    3개의 요소를 갖는 배열을 선언하고
    i = 0 ~ 2 일때 i * 10을 각각 계산하여 요소에 저장
     */
    val arr2 = Array<Int>(5, { i->i*10 })

    for (a in arr2){
        println(a)
    }

    // 정수형 배열 5개 선언 후 각각의 요소에 i+10, 1+10, 2+10, 3+10, 4+10 저장
    var arr3 = IntArray(5, {i->i+10})

    // 10개의 요소를 갖는 정수형 배열 선언
    var arr4 = IntArray(10)

    // java의 List<String> type의 데이터
    var mutableList = mutableListOf("Korea","대한민국") // 데이터 변경 가능

    var immutableList = listOf<String>("Korea","대한민국") // 데이터 변경 불가능
}