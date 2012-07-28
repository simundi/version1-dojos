class Minesweeper(val lines:Int,var columns:Int) {

  
  
  def board:Array[Array[String]]  = {
    val dotTab:String = ".\t"
    val newLine:String = "\n"
    
    var firstRow:Array[String] = Array (dotTab,dotTab)
    var secondRow = firstRow.clone()
    
    var b:Array[Array[String]] = Array (firstRow, secondRow)
      
//      for(i <- 1 to lines){
//        for(x <- 1 to columns){
//        }
//      }
    
    b
  }
  
    
  
}