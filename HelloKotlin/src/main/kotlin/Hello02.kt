fun main() {
    var num1 = 100
    var num2 = 200

    println("${num1 + num2}")

    var even = 0
    var odd = 0

    for (i in 0..100){
        if(i%2==0){
            even++
        } else {
            odd++
        }
    }

    for (i in 0..100){
        // if문을 삼항연산자처럼 사용
        even += if(i % 2 == 0) 1 else 0
        odd += if(i % 2 != 0) 1 else 0
    }

    var num3 = 0

    for(i in 0 .. 100) {
        // 다중 if문을 대신하는 코드
        num3 = when(i % 2) {
            0->1
            1->2
            2->3
            else ->0
        }
    }
}