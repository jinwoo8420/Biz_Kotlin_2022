fun main() {
    var num1=10; // num1 변수를 선언 후 10으로 초기화
    var num2=20; // num2 변수를 선언 후 20으로 초기화
    var sum=num1+num2;
    // 문자열 template : 문자열 내에 변수를 직접 사용하여 결과를 출력하는 메모
    println("$num1+$num2=$sum")

    //이미 num1이 정수형으로 선언 되었는데 문자열을 저장하려고 시도하니 type 오류 발생
//    num1 = "String"

    // 변수 선언 시 초기화 없이 강제형 저장하여 선언( 권장하지 않음 )
    var num3 : Int;

    var nation : String
    nation = "대한민국"

    val korea = "대한민국" // final, const, 상수형 변수 선언

    // val로 선언된 변수는 다시 값을 저장 할 수 없다
//    korea = "republic of Korea"

    println("$korea 은 Republic of Korea")

    for(i in 0..10) {
        println("반복문으로 $i 만들기")
    }
    println()

    // 0 ~ 10까지 2씩 증가
    for(i in 0..10 step(2)){
        println("$i 값")
    }

    for(i in 10 downTo 0){
        println("$i 값")
    }

    // 10 ~ 0까지 2씩 감소
    for(i in 10 downTo 0 step(2)){
        println("$i 값")
    }

    var bYes = true
    if(bYes){
        println("$bYes 는 참")
    } else {
        println("$bYes 는 거짓")
    }

    // 정수형 요소를 포함하는 배열 선언
    val array1 = intArrayOf(10,20,30,40,50,60,70)

    for (ar in array1){
        println("$ar")
    }

    // 배열 요소 끝에서부터 0 방향으로 리스트
    for (ar in array1.reversed()){
        println("$ar")
    }

    // 0 부터 배열의 개수 -1
    for (i in 0 until array1.count()) {
        println("${array1[i]}")
    }

    var num4 = 1;
    while (num4<10){
        print("${num4++} ")
    }
}