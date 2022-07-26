/*
fun : 함수 선언 키워드
java에서의 method = Kotlin에서의 함수
JS의 typeScript 문법과 매우 유사

2개의 정수형 매개변수를 갖고 결과를 정수로 return하는 함수 선언
*/
fun sum(num1:Int, num2:Int):Int{
    var sum = num1+num2

    return sum
}

/*
두 개의 정수형 매개변수를 받고
두 값의 마이너스 연산을 수행한 후 결과를 return
 */
fun minus(num1:Int,num2:Int) = num1-num2

/*
두 개의 정수 값을 매개변수로 받아서
큰 수를 return
 */
fun max1(num1:Int,num2:Int):Int {
    if(num1>num2)return num1
    else return num2
}

fun max2(num1:Int,num2:Int)=if(num1>num2) num1 else num2

/*
변수 선언은 어디에서나 가능
실행하는 코드는 반드시 main() 내에서 작성
 */
fun main() {
    // type 강제 지정
    var num1:Int = 0
    // 초기화되는 값에 따라 자동으로 type 지정
    var num2 = 0

    // var로 선언된 변수는 값을 언제든지 할당 / 변경 가능
    num1 = 100
    num2 = 200

    // val로 선언된 변수는 최초에 한번 값이 할당되면 다시 할당 / 변경 불가능 (=java의 final / JS의 const / c,c++의 const)
    val num3 = 100
    // num3 = 11

    num1++
    ++num1

    // 기존의 num1 값에 10을 더하여 증가
    num1 += 10

    num1 = 100
    num2 = 200

    var sum = sum(num1,num2)
    println("$num1 + $num2 = $sum")
}