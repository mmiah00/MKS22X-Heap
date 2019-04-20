public class MyHeap {
  //We discussed these 2 methods already:
  private static void pushDown(int[]data,int size,int index){
    while (index * 2 + 2 < size) {
      int left, right;
      left = data[index * 2 + 1];
      right = data[index * 2 + 2];

      if (data[index] < left && left >= right){
        int temp = data[index];
        data[index] = left;
        data[index * 2 + 1] = temp;
        index = index * 2 + 1;
      }
      else {
        int temp = data[index];
        data[index] = right;
        data[index * 2 + 2] = temp;
        index = index * 2 + 2;
      }
    }

  }

  private static void pushUp(int[]data,int index){
    while ( (index - 1) /2 >= 0) {
      int parent = data[ (index - 1) / 2];
      if (data[index] > parent) {
        int temp = data[index];
        data[index] = parent;
        data[ (index - 1)/ 2] = temp;
        index = (index - 1)/2;
      }
      else {
        index = -1; 
      }
    }
  }
  /*
       - push the element at index i up into the correct position.
         This will swap it with the parent node until the parent node
         is larger or the root is reached. [ should be O(logn) ]
       - precondition: index is between 0 and data.length-1 inclusive.
  */

  //We will discuss this today:
  public static void heapify(int[] data){}
  /*
      - convert the array into a valid heap. [ should be O(n) ]
  */

  public static void heapsort(int[] data){}
  /*
      - sort the array by converting it into a heap then removing the largest value n-1 times. [ should be O(nlogn) ]
  */
}
