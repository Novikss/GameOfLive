import java.util.Random;

class GameOfLive{
  
  static int fieldSize = 100;
  static  int field[][] = new int[fieldSize][fieldSize];

  static void initField(){  

    Random rand = new Random();

    for(int row = 0; row < field.length; row++){
      for(int column = 0; column < field[row].length; column++){
        field[row][column] = rand.nextInt(2);
        System.out.print(field[row][column] + " ");
        }
      System.out.println();
      }
    }

  public static void main(String[] args){
    initField();

  }
}
