import org.scalatest.FunSuite

class MinesweeperCreationTest extends FunSuite{

      var minesweeper = new Minesweeper(2,2)

  
  test("Test create board"){
    
    
    assert(minesweeper.lines == minesweeper.columns)
    
  }
  
  test("columns is not other than 2)") {
    
    assert (minesweeper.lines == 2)
  }
  
  test("Printing"){
    var board = minesweeper.board
    var expected = "...."
    
    println(board)  
      
    assert(minesweeper.board.toString()==expected)
  }
  
  
  
  

}