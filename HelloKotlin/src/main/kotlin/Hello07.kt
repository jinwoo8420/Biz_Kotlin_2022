fun main() {
    // 정수형 배열 100개 선언 후 1 ~ 100까지 1씩 증가하면서 배열 요소 채우기
    val list = IntArray(100,{i->i+1})

    /*
    each 반복문
    list의 전체 요소를 반복하면서 각 요소를
    it 변수에 담아 내부로 전달
    it 변수 값을 console에 출력
     */
    list.map{it->println(it)}

    /*
    list의 요소 개수만큼 반복하면서
    각 요소가 %2 연산 결과가 0인 요소들만 간추려서
    list를 다시 만든 다음 map에게 전달
    map은 요소들을 console에 출력
     */
    list.filter { it->it % 2 == 0 }.map {it->println(it) }

    // lambda(람다) : 간소화 된 코드

    // key, value가 쌍으로 된 자료형
    val map = mapOf("김" to "김철수", "이" to "이철수", "박" to "박철수")

    // 김 key에 해당하는 value 값 출력
    println(map["김"])

    // 이 key에 해당하는 value 값 출력
    println(map["이"])

    // map에 담긴 전체 데이터를 key, value로 분해하여 출력
    for((key,value) in map) {
        println("$key = $value")
    }
}