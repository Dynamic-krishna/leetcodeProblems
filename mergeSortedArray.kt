
fun mergeSortedArray() : Unit{
    val num1 = arrayOf(1,2,3,0,0,0)
    val num2 = arrayOf(2,5,6)

    val m = 3
    val  n = 3

    var i = m - 1
    var j = n - 1
    var k = m +n-1

    while (i >= 0 && j >= 0){
        if (num1[i] > num2[j]){
            num1[k] = num1[i]
            i--
        }else{
            num1[k] = num2[j]
            j--
        }
        k--
    }

    while (j >=0){
        num1[k] = num2[j]
        j--
        k--
    }

/*    val mergeArray : Array<Int> = Array(m+n){0}

    for (item in num1){
        for (second in  num2){
            if (item < second){
                mergeArray[count] = item
            }else{
                mergeArray[count] = second
            }
        }
        count++
    }*/



    println("Your Array is :- " + num1.joinToString(","))

}