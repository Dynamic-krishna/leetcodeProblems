
fun removeElement(nums: IntArray, `val`: Int): Int {
    var k = 0;
    for(i in nums.indices){
        if(nums[i] != `val`){
            nums[k] = nums[i]
            k++
        }
    }

//    while (k < nums.size){
//        if(nums[k] == `val`){
//            nums[k] = 0
//        }else{
//            nums[k] = 0
//        }
//        k++
//    }

    println(nums.joinToString(","))
    println(nums.size)

    return k

}


