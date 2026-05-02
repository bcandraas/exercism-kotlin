class Year(val year: Int) {
    
       fun checkLeap(year:Int):Boolean{
           if (year%400 == 0){
               return true
           } else if (year%100 == 0) {
               return false  
           } else if (year%4 == 0){
               return true
           } else return false 
       }
    
        val isLeap: Boolean = checkLeap(year)
}
