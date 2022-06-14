import java.io.*;
import java.util.*;

class Main {


    //Selection & Insertion Sorts
  public static void main (String str[]) throws IOException {

    
    int[] elements = {21, 17, 60, 20, 56, 12};
    //Selection Sort

    System.out.println("Printing unsorted array:");
    for ( int i : elements)
      {
        System.out.print(i + " ");
      }
    System.out.println("\nPrinting Each Pass Through the Selection sort");
    //sorts
    for (int j = 0; j < elements.length -1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;

      for ( int i : elements)
        {
          System.out.print(i + " ");
        }
      System.out.print("\n");
    }

    System.out.println("Sorted Array (selection)");
    
    for (int num : elements)
    {
      System.out.print(num + " ");
    }
    
    System.out.println("\n\n");
    
//Insertion Sort

    
int[] elements2 = {21, 17, 60, 20, 56, 12};

    System.out.println("Printing unsorted array:");


    for (int i : elements2)
      {
        System.out.print(i + " ");
      }

    System.out.println("\nPrinting Each Pass Through the Insertion sort");
    
    for (int j = 1; j < elements2.length; j++)
    {
      int temp = elements2[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements2[possibleIndex - 1])
      {
        elements2[possibleIndex] = elements2[possibleIndex - 1];
        possibleIndex--;
        
      }
      elements2[possibleIndex] = temp;

      for ( int i : elements2)
        {
          System.out.print(i + " ");
        }

      System.out.print("\n");
    }

    System.out.println("Sorted Array (insertion)");
    for (int num : elements2)
    {
      System.out.print(num + " ");
    }


    //String Arrays

    String[] arr1 = {"now", "gow", "cow" , "vow", "bow"};
    String[] arr2 = {"yay", "bay", "hay", "may", "pay"};

    // selection for arr1

    System.out.println("\n\n\nPrinting unsorted array:");


    for (String i : arr1)
      {
        System.out.print(i + " ");
      }

     System.out.println("\nPrinting Each Pass Through the Selection sort");
    
    for ( int i = 0; i < arr1.length ; i ++)
      {
        int minin = i;

        for ( int j = i+1; j < arr1.length ; j ++)
          {
            if ( (arr1[j].compareTo(arr1[minin] ) < 0) )
            {
              minin = j;
            }
          }

        String tempel = (arr1[i]);// thing we are swaping

        arr1[i] = (arr1[minin]); // if no change, then j=j spot, else, we put the old min in j's spot

        arr1[minin] = tempel;// puting j in j in old mins spot



        System.out.println(Arrays.toString(arr1));
      }

    System.out.println(Arrays.toString(arr1));


    //Insertion sort

    System.out.println("\n\nPrinting unsorted array:");
      for ( String i : arr2)
        {
          System.out.print(i + " ");
        }

    System.out.println("\nPrinting Each Pass Through the Insertion sort");
    
    for( int i = 1; i < arr2.length ; i++)
      {
        String tempLowestAlph = arr2[i];
        int possibleLowestInd = i;

        while ( possibleLowestInd > 0 && (arr2[i].compareTo(arr2[i-1]) < 0) )
          {
            arr2[possibleLowestInd] = arr2[possibleLowestInd -1]; // setting old lowest to new lowest word
            
            possibleLowestInd --; // to test the same index again
          }
        
        arr2[possibleLowestInd] = tempLowestAlph;

        System.out.println(Arrays.toString(arr2));

      }

    System.out.println("Sorted Array (insertion)");
    System.out.println(Arrays.toString(arr2));

    ///////////////// arraylists

  ArrayList<Integer> elementsArray = new ArrayList<> ();

  elementsArray.add((Integer) 21);
  elementsArray.add((Integer) 17);
  elementsArray.add((Integer) 60);
  elementsArray.add((Integer) 20);
  elementsArray.add((Integer) 56);
  elementsArray.add((Integer) 12);

    System.out.println("\n\nPrinting unsorted ArrayList");
    System.out.println(elementsArray);

      int originalElemLength = elementsArray.size();

    System.out.println("Printing each pass through ArrayList");
    
    for ( int i = 0; i < originalElemLength ; i ++)
      {
        int lowestIndex = i;
        
        for ( int j = i+1; j < originalElemLength; j ++)
          {
            if (  elementsArray.get(j) <  elementsArray.get(lowestIndex))// if the element in front of i is less the lowest number so far
            {
                lowestIndex = j;// the lowest index is in front of i (j)
            } 
          }
        
          Integer temporaryLowest = elementsArray.get(i); // the temp is whatever is at i
          elementsArray.set(i, elementsArray.get(lowestIndex));// set whatever is at i rn to the lowestIndex
          elementsArray.set(lowestIndex, temporaryLowest);// set the actual lowest element to where i is rn ( first in line)

        
          
        
        for ( Integer k : elementsArray)
          {
              System.out.print(k + " ");
          }

        System.out.print("\n");
        
      }

    System.out.println("Sorted ArrayList(Selection)");
    System.out.println(elementsArray);


    //(insertion)

    ArrayList<Integer> elementsArray2 = new ArrayList<> ();

  elementsArray2.add((Integer) 21);
  elementsArray2.add((Integer) 17);
  elementsArray2.add((Integer) 60);
  elementsArray2.add((Integer) 20);
  elementsArray2.add((Integer) 56);
  elementsArray2.add((Integer) 12);

    System.out.println("\n\nPrinting unsorted ArrayList");
    System.out.println(elementsArray2);

    System.out.println("Printing each pass through ArrayList");
    
    for ( int i = 1; i < originalElemLength; i ++)
      {
          Integer temporaryMin = elementsArray2.get(i);
          int possibleMin = i;

        while ( possibleMin > 0 && (elementsArray2.get(possibleMin-1) > temporaryMin))// is i less that the one before it?
          {
            elementsArray2.set(possibleMin, elementsArray2.get(possibleMin-1));// then set i  to the bigger element that was before it
            possibleMin--; // and subtract i by one so that you can check if the current temp is still the smallest, and since the min is switched
          }
        
        elementsArray2.set(possibleMin, temporaryMin); // setting ( new or old) min to i

        for ( Integer j : elementsArray2)
          {
            System.out.print( j + " ");
          }

        System.out.print("\n");
      }

    System.out.println("Sorted ArrayList (Insertion)");
    System.out.println(elementsArray2);


    //String ArrayLists

ArrayList<String> arrList1 = new ArrayList<> ();

  arrList1.add("now");
  arrList1.add("gow");
  arrList1.add("cow");
  arrList1.add("vow");
  arrList1.add("bow");

    System.out.println("\n\nPrinting unsorted ArrayList");
    System.out.println(arrList1);

      int originalArrList1Length = arrList1.size();

    System.out.println("Printing each pass through ArrayList");
    
    for ( int i = 0; i < originalArrList1Length ; i ++)
      {
        int minIndex = i;
        
        for ( int j = i+1; j < originalArrList1Length; j ++)
          {
            if (  (arrList1.get(j)).compareTo(arrList1.get(minIndex)) < 0)// if the element in front of i is less the lowest number so far
            {
                minIndex = j;// the lowest index is in front of i (j)
            } 
          }
        
          String temporary = arrList1.get(i); // the temp is whatever is at i
          arrList1.set(i, arrList1.get(minIndex));// set whatever is at i rn to the lowestIndex
          arrList1.set(minIndex, temporary);// set the actual lowest element to where i is rn ( first in line)

        
          
        
        for ( String k : arrList1)
          {
              System.out.print(k + " ");
          }

        System.out.print("\n");
        
      }

    System.out.println("Sorted ArrayList(Selection)");
    System.out.println(arrList1);

    

    //(insertion)

 ArrayList<String> arrList2 = new ArrayList<> ();

  arrList2.add("yay");
  arrList2.add("bay");
  arrList2.add("hay");
  arrList2.add("may");
  arrList2.add("play");

    System.out.println("\n\nPrinting unsorted ArrayList");
    System.out.println(arrList2);

    System.out.println("Printing each pass through ArrayList");
    
    
    for ( int i = 1; i < arrList2.size(); i ++)
      {
          String temporaryMin = arrList2.get(i);
          int possibleMin = i;

        while ( possibleMin > 0 && (arrList2.get(i).compareTo(arrList2.get(possibleMin-1)) < 0 ) )// is i less that the one before it?
          {
            arrList2.set(possibleMin, arrList2.get(possibleMin-1));// then set i  to the bigger element that was before it
            possibleMin--; // and subtract i by one so that you can check if the current temp is still the smallest, and since the min is switched
          }
        
        arrList2.set(possibleMin, temporaryMin); // setting ( new or old) min to i

        for ( String j : arrList2)
          {
            System.out.print( j + " ");
          }

        System.out.print("\n");
      }

    System.out.println("Sorted ArrayList (Insertion)");
    System.out.println(arrList2);
  }
}

