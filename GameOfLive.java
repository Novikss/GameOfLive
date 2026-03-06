import java.util.Random;

public class GameOfLive{

  private int[][] grid;
  private int rows;
  private int columns;

  public GameOfLive(int rows, int columns){
    this.rows = rows;
    this.columns = columns;
    this.grid = new int[rows][columns];

    Random random = new Random();
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < columns; j++){
        grid[i][j] = random.nextInt(2);
        System.out.print(grid[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args){
    GameOfLive game = new GameOfLive(10,10);
  }
}

