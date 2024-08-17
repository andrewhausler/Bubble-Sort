package code;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * BubbleSort Class Algorithm 
 * Generic Class That Also Implements AlgorithmBasics Interface
 */
public class BubbleSort<Type extends Comparable<Type>> implements AlgorithmBasics<Type>
{
    // Private ArrayList Holding All Values
    private ArrayList<Type> unsortedArray;
    
    // Default Constructor Initializing The ArrayList
    public BubbleSort()
    {
        unsortedArray = new ArrayList<Type>();
    }

    /**
     * Constructor 
     * @param unsortedArray array already made
     */
    public BubbleSort(ArrayList<Type> unsortedArray)
    {
        this.unsortedArray = unsortedArray;
    }

    /**
     * Sorts The Data In BubbleSort Algorithm Which Is Represented With A Time Complexity Of O(N^2)
     * @return returns the newly sorted bubble sorted array 
     */
    public BubbleSort<Type> sort()
    {
        // Holds Array Size
        int listSize = unsortedArray.size();
        // Allows For A Possible Early Finish For The Algorithm
        boolean sorted = false;
        // Used For When Swapping It Holds The Value That Will Be Later Erased Or Overridded
        Type temp = null;
        for(int i=0; i < unsortedArray.size(); i++)
        {
            sorted = false;
            for(int j=0; j<listSize-i-1; j++)
            {
                if (unsortedArray.get(j).compareTo(unsortedArray.get(j+1)) == 1)
                {
                    temp = unsortedArray.get(j+1);
                 unsortedArray.set(j+1, unsortedArray.get(j));
                 unsortedArray.set(j, temp);
                    sorted = true;
                }
            }
            if(sorted == false)
            {
                break;
            }
        }
        return this;
    }

    /**
     * Add Another Value With Index To The Array
     * @param value the value to be added
     */
    public void addToArray(Type value)
    {
     unsortedArray.add(value);
    }

    /**
     * Removes A Value From The Array
     * @param index the index that is set to null
     */
    public void removeFromArray(int index)
    {
     unsortedArray.remove(index);
    }

    /**
     * Find Specific Data From An Index Number
     * @param number the index number
     * @return returns the data from that index
     */
    public Type getIndex(int number)
    {
        try
        {
            Type typeData = unsortedArray.get(number);
            return typeData;
        }
        catch(IndexOutOfBoundsException ex)
        {
            return null;
        }
    }

    /**
     * Gives Access To The Private ArrayList
     * @return returns the arraylist
     */
    public ArrayList<Type> getArray()
    {
        return unsortedArray;
    }

    /**
     * Main Method To Run The Test Case
     */
    public static void main(String[] args)
    {
        // Pre-Sorted Array
        ArrayList<Integer> defaultArray = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 2, 2, 4));
        // Unsorted Array
        BubbleSort<Integer> newSort = new BubbleSort<Integer>(new ArrayList<Integer>(Arrays.asList(1, 1, 2, 4, 2, 1)));
        newSort = newSort.sort();
        int checkCount = 0;
        for(int i=0; i<defaultArray.size(); i++)
        {
            if(defaultArray.get(i).compareTo(newSort.getIndex(i)) == 0)
            {
                checkCount++;
            }
            else
            {
                System.out.println("BubbleSort Algorithm Did Not Work Correctly!");
                break;
            }
        }
        if(checkCount == defaultArray.size())
        {
            System.out.println("BubbleSort Algorithm Has Successfully Worked!");
        }
    }
}