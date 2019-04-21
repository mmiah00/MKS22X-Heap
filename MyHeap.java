public class MyHeap {

  private static boolean hasLeft (int[] data, int size, int index) {
    return index * 2 + 1 < size;
  }

  private static boolean hasRight (int[] data, int size, int index) {
    return index * 2 + 2 < size;
  }

  private static void pushDown(int[]data,int size,int index){
    while (hasLeft (data,size,index)) {//while it has at least one child
      if (hasLeft (data,size,index) && hasRight (data,size,index)) { //has two children
        int left, right;
        left = data[index * 2 + 1];
        right = data[index * 2 + 2];
        if (data[index] < left || data[index] < right) { //if node is smaller than either child which with the greater
          if (data[index] < left && left > right) {
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
        else { //end loop
          index = size;
        }
      }
      else { //check left side
        int left = data[index * 2 + 1];
        if (data[index] < left) { //if node is smaller than its child switch
          int temp = data[index];
          data[index] = left;
          data[index * 2 + 1] = temp;
          index = index * 2 + 1;
        }
        else { //end loop
          index = size;
        }
      }
    }
    //print (data);

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

  public static void heapify(int[] data){
    for (int i = data.length - 1; i >= 0; i --){
      pushDown (data, data.length, i);
    }
  }

  private static void print (int[] data) {
    for (int num : data) {
      System.out.print (num + " ");
    }
    System.out.println ();
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
    int[] c = {1,26,2,6,12,7,3,57,33,90};
    int[] d = {213,2,5,1,35,12,5,0,1000,23,12};
    heapify (d);
    print (d);

    /*
    heapify (a);
    print (a);
    heapify (b);
    print (b);
    */
  }
}

/*
while (index * 2 + 2 < size) {
  int left, right;
  left = data[index * 2 + 1];
  right = data[index * 2 + 2];
  if (data[index] >= right && data[index] >= left) {
    index = size;
  }
  else {
    if (data[index] < left && left > right) {
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
*/
