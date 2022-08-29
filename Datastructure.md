###### 1. Stack [FILO]
```
  Stack<Integer> s = new Stack<Integer>();
  s.search(6); -> return index, -1 if not found
  s.pop();     -> remove and return from top
  s.push(6);   -> add to top
  s.peek();    -> display top
 ```
###### 2. Queue [FIFO]
```
  Queue<Integer> q = new LinkedList<>();
  q.add(6);   -> add to tail
  q.remove(); -> remove and return from head
  q.peek();   -> display head
  q.size();   -> display size
  ```
###### 3. Priority Queue
```
  Queue<Integer> pq = new PriorityQueue<Integer>();
  pq.add(6);
  pq.peek();
  pq.poll();  -> remove and return top
  pq.remove(6); -> remove the corresponding element
  ```
  For integer, Strings, use default comparator so it's default ascending  
  Write comparator yourself:
  ```
  int capacity = 3;
  in main:
    Queue<Integer> pq = new PriorityQueue<Integer>(capacity, new LargeComparator());
  outside:
    class LargeComparator implements Comparator<Integer>{\
      // overriding the compare function
      public int compare(int a, int b){
      // ascending: -1 when first element is less than, 1 when first element is larger than
      // descending: 1 when first element is less than, -1 when first element is larger than
        if (a < b) {
          return 1;
        }else if (a > b){
          return -1;
        }
        return 0;
      }
    }
  We will get: [120, 20, 5, 1]
  ```
###### 4. Deque  <- double-ended queue for sliding window
```
  Deque<String> dq = new LinkedList<String>();
  dq.addFirst("B");
  dq.addLast("C");
  // return and remove
  dq.pollFirst();
  dq.pollLast();
  dq.getFirst();
  dq.getLast();
  dq.size();
  dq.contains("A");
```
