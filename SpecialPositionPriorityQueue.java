package HefShine;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SpecialPositionPriorityQueue
{
    public static void main(String[] args)
    {
        // Create a priority queue with a custom Comparator
        PriorityQueue<Integer> pq = new PriorityQueue<>(new PositionComparator());

        // Add elements to the priority queue with special positions
        pq.add(10);
        pq.add(30);
        pq.add(20);
        pq.add(5);
        pq.add(15);

        // Print the elements in the priority queue
        while (!pq.isEmpty())
            System.out.println(pq.poll());
    }

    // Custom Comparator that takes into account the desired position as well as the element priority
    static class PositionComparator implements Comparator<Integer>
    {
        @Override
        public int compare(Integer a, Integer b)
        {
            // Elements with position 1 go before all other elements
            if (a == 1)
                return -1;
            else if (b == 1)
                return 1;

            // Elements with higher priority go before elements with lower priority
            return a.compareTo(b);
        }
    }
}
