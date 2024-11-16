public class Main {
    public static void main(String[] args){
        //2D array, 3 ro and 4 collum
        int[][] twoD_array = new int[3][4];
        //Visting each row
        for(int row = 0; row<twoD_array.length; row++){
            //each column for a giver ro
        for(int col = 0; col<twoD_array[row].length; col++){
            //Storing ro nums + col nums
            twoD_array[row][col] = row+col;
        }
    }
    //print resulting array
    for(int[] temp : twoD_array){
        for(int val : temp){
            System.out.print(val+" ");
        }
        System.out.println();
    }
  }
}