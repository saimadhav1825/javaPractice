package collectionConcepts;


import java.util.*;

public class BasicsOfCollections {

    public static void main(String[] args) {
        // arrayListMethod();
        // linkedListMethod();
        // hashSetMethod();
        // linkedHashSetMethod();
        //priorityQueueMethod();
      //  hashMapMethod();
        hashTableMethod();
    }

    public static void arrayListMethod() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(500);
        arrayList.add(600);
        arrayList.add(500);
        arrayList.remove(3);
        arrayList.add(0, 1000);
        arrayList.set(0, 2000);
        arrayList.add(null);
        System.out.println(arrayList.contains(2000));
        System.out.println(arrayList);

        //for each loop
        for (Integer element : arrayList) {
            System.out.println(element);
        }

        Iterator<Integer> i = arrayList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

    public static void linkedListMethod() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(100);
        linkedList.add(true);
        linkedList.add("sai");
        linkedList.add('c');
        linkedList.add(null);
        System.out.println(linkedList);

        linkedList.remove(1);
        System.out.println(linkedList);

        linkedList.add(1, true);
        System.out.println(linkedList);

        linkedList.set(1, false);
        System.out.println(linkedList);

        //for each loop
        for (Object element : linkedList) {
            System.out.println(element);
        }

        Iterator<Object> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        linkedList.addFirst(false);
        linkedList.removeLast();
        System.out.println(linkedList);

        linkedList.addLast(false);
        linkedList.removeFirst();
        System.out.println(linkedList);

        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList);
    }

    public static void hashSetMethod() {
        HashSet hashSet = new HashSet();
        hashSet.add(100);
        hashSet.add(false);
        hashSet.add(null);
        hashSet.add("sai");
        hashSet.add('c');
        System.out.println(hashSet);

        HashSet evenNumber = new HashSet();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        evenNumber.add(8);

        HashSet oddNumber = new HashSet();
        oddNumber.add(1);
        oddNumber.add(3);
        oddNumber.add(5);
        oddNumber.add(7);

        hashSet.addAll(evenNumber);
        System.out.println(hashSet);

        hashSet.addAll(oddNumber);
        System.out.println(hashSet);

        hashSet.removeAll(evenNumber);
        System.out.println(hashSet);

        hashSet.removeAll(oddNumber);
        System.out.println(hashSet);
    }

    public static void linkedHashSetMethod() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();

        linkedHashSet.add(100);
        linkedHashSet.add(200);
        linkedHashSet.add(400);
        linkedHashSet.add(10);
        linkedHashSet.add(null);

        System.out.println(linkedHashSet);
    }

    public static void priorityQueueMethod() {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add(100);
        priorityQueue.add(400);
        priorityQueue.offer(40);
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.element());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
    }

    public static void hashMapMethod() {
        HashMap hashMap = new HashMap();
        hashMap.put(1, 1);
        hashMap.put(2, "sai");
        hashMap.put(3, false);
        hashMap.put(4, null);
        hashMap.put(5, 'c');
        hashMap.put(3, true);
        System.out.println(hashMap);
        hashMap.remove(5);
        System.out.println(hashMap);
        System.out.println(hashMap.get(4));
        System.out.println(hashMap.containsKey(2));
        System.out.println(hashMap.containsValue(1));
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.values());
        System.out.println(hashMap.entrySet());
        Set list = hashMap.entrySet();
        for (Object o : list) {
            System.out.println(o);
        }

        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            Map.Entry m =(Map.Entry) iterator.next();
            System.out.println(m.getKey()+"       "+m.getValue());
        }
    }

    public static void hashTableMethod(){
        Hashtable hashtable=new Hashtable();
        hashtable.put(1, 1);
        hashtable.put(2, "sai");
        hashtable.put(3, false);
        hashtable.put(4, "null");
        hashtable.put(5, 'c');
        hashtable.put(3, true);
        System.out.println(hashtable);
    }
}
