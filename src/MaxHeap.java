/**
 * Heap types:
 *   Max Heap:the max value of each sub-tress is heap
 *   Min Heap:opposite of the Max heap
 */
public class MaxHeap {
    private int[] heap;
    private final int limit;
    private int heapSize;

    MaxHeap(int limit){
        this.limit = limit;
        heap = new int[limit];
    }
    public boolean isFull(){
        return heapSize == limit;
    }

    public boolean isEmpty(){
        return heapSize == 0;
    }

    /**
     * add new value to this MaxHeap
     * @param value new number value
     * @return 0 means add new number successful, -1 means failure
     */
    public int push(int value){
       if(heapSize >= limit){
          return -1;
       }
       heapInsert(value);
       return 0;
    }

    /**
     * get the max number of this MaxHeap , and re-order this MaxHeap make it to be qualified
     * @return
     */
    public int poll(){
        if(heapSize == 0){
            return  -1;
        }

        return 0;
    }


    private void heapInsert(int value){
        int newIndex = heapSize;
        heap[newIndex] =value;

        while (newIndex>0){
            int parentIndex = (heapSize-1)/2;
            if(heap[parentIndex] < value){
                swap(heap,parentIndex,newIndex);
                newIndex = parentIndex;
            }else {
                break;
            }
        }
        heapSize++;
    }

    private void swap(int[] arr,int x,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}
