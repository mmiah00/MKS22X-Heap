public class MyHeap {
  //We discussed these 2 methods already:
  private static void pushDown(int[]data,int size,int index){
    while (index * 2 + 2 < size) {
      int left, right;
      left = data[index * 2 + 1];
      right = data[index * 2 + 2];

      if (data[index] > left){
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
  /*
       - size  is the number of elements in the data array.
       - push the element at index i downward into the correct position.
         This will swap with the larger of the child nodes provided that
         child is larger. This stops when a leaf is reached, or neither
         child is larger. [ should be O(logn) ]
       - precondition: index is between 0 and size-1 inclusive
       - precondition: size is between 0 and data.length-1 inclusive.
  */

  private static void pushUp(int[]data,int index){}
  /*
       - push the element at index i up into the correct position. This will swap it with the parent node until the parent node is larger or the root is reached. [ should be O(logn) ]
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
