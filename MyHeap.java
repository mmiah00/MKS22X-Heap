public class MyHeap {
  //We discussed these 2 methods already:
  private static void pushDown(int[]data,int size,int index){
    /*
    while (index * 2 + 2 < size) {
      int left, right;
      left = data[index * 2 + 1];
      right = data[index * 2 + 2];

      if (data[index] < left && data[index] < right) {
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
      else {
        index = size;
      }
    }
    //print (data);
    */
    
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

  //We will discuss this today:
  public static void heapify(int[] data){
    for (int i = 0; i < data.length; i ++){
      pushDown (data, data.length, i);
    }

    for (int i = data.length; i >= 0; i --) {
      pushUp (data,i);
    }
  }

  private static void print (int[] data) {
    for (int num : data) {
      System.out.print (num + " ");
    }
  }
  /*
      - convert the array into a valid heap. [ should be O(n) ]
  */

  public static void heapsort(int[] data){}
  /*
      - sort the array by converting it into a heap then removing the largest value n-1 times. [ should be O(nlogn) ]
  */

  public static void main (String[] args) {
    int[] a = {15,87,24,12,42,18,19,37,48,98,26,1};
    int[] b = {19,100,136,17,20,25,1,2,7,3,200};
    heapify (a);
    print (a);
  }
}
