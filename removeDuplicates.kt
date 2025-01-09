
fun removeDuplicates(nums: Array<Int>) : Int{
    var k = 0
    if (nums.isEmpty()){
        return  0
    }else {
        for (i in nums.indices) {
            if (i == 0) {
                nums[k] = nums[i]
            } else if (nums[i] == nums[k]) {
//                println("your array element are equal" + nums[i] + "==" + newArray[k])
                nums[i]=0
            } else {
                k++
                nums[k] = nums[i]
            }
        }
//
        println(nums.joinToString(","))
        println(k)

        return ++k
    }
}

fun removeDuplicatesSecond(nums: Array<Int>): Int {
    if (nums.isEmpty()) return 0

    var k = 0
    var count = 0

    for (i in 1 until nums.size) {
        if (nums[i] != nums[k]) {
            k++
            nums[k] = nums[i]
            count = 0
        }else{
            if(nums[i] == nums[k] && count < 1){
                k++
                nums[k] = nums[i]
                count++
            }
        }
    }

    return k + 1
}