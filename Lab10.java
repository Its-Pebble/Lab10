/*
 * This is a test
 */

import java.util.*;
import java.net.URL;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Lab10 {
    public static void main(String[] args) {
        System.out.println("!! Welcome to Lab10 -- Word Counter !!");
        String fileURL = null;
        boolean local = false;
        if (args.length > 0) {
            fileURL = args[0];
            local = true;
        }
        else { // The following URL contains the the full text of Moby-Dick:
            fileURL = "https://gist.githubusercontent.com/StevenClontz/4445774/raw/1722a289b665d940495645a5eaaad4da8e3ad4c7/mobydick.txt";
        }
        System.out.print("Loading words...");
        long start = System.currentTimeMillis();

        Map<String, Integer> words = null;
        //-------------------------------------------------------------------------
        // Point words at a Map that will support the most efficient solution
        // to the problem that we're solving in this lab.
        
        //-------------------------------------------------------------------------
            
        int num = getWords(fileURL, local, words);
        long end = System.currentTimeMillis();
        System.out.println("done. (" + (end - start) + ")");
        if (num >= 0) {
            System.out.println("Total words: " + num);
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a word (Ctrl-d or Ctrl-z to quit): "); 
            while (in.hasNext()) {
                String word = in.next();
                int count = 0;
                start = System.currentTimeMillis();
                //-----------------------------------------------------------------
                // Store in count the occurrence count of word. 
                


                //-----------------------------------------------------------------
                end = System.currentTimeMillis();
                long time = end - start;
                System.out.println("Occurrence count for \"" + 
                                   word + "\": " + count + " (" + time + ")");
                System.out.print("Enter a word (Ctrl-d or Ctrl-z to quit): "); 
            }
            System.out.println("\n\n");
            
            //---------------------------------------------------------------------
            // Call printWords, passing in words as the only argument.
            

            //---------------------------------------------------------------------
            
            System.out.println("Done. Normal termination.");
            in.close();
        }
        else {
            System.out.println("Done. Abnormal termination.");
        }
    }
    

    public static void printWords(Map<String, Integer> words) {
        
        class MyComparator implements Comparator<Map.Entry<String, Integer>> {
            public int compare(Map.Entry<String, Integer> e1,
                               Map.Entry<String, Integer> e2) {
                String word1 = e1.getKey(),
                       word2 = e2.getKey();
                Integer count1 = e1.getValue(),
                        count2 = e2.getValue();
                        
                //-----------------------------------------------------------------
                // Fill in the missing details to ensure that words are sorted in 
                // the order longest to shortest, and within a group of words of 
                // the same length, the words are sorted by decreasing occurrence 
                // count.
                














                //-----------------------------------------------------------------
                
            }
        }
        
        //-------------------------------------------------------------------------
        // Declare a TreeSet reference that accepts Map.Entry objects comprised of 
        // a String key and Integer value, and point it at a new TreeSet that 
        // compares its elements using an anonymous instance of MyComparator.
        
        //-------------------------------------------------------------------------
        
        //-------------------------------------------------------------------------
        // Add all of the entries of the words map to the tree set you 
        // just created. 
        

        //-------------------------------------------------------------------------
    
        //-------------------------------------------------------------------------
        // Iterate over the tree set you previously created and for each entry
        // contained therein, print out on its own line the key, followed by a 
        // space, and then the value. 



        //-------------------------------------------------------------------------
        
    }
  
    public static int getWords(String inputFile, 
                               boolean localFile,
                               Map<String, Integer> words) {
        Scanner input = null;
        try {
            if (localFile) {
                input = new Scanner(new File(inputFile));
            } 
            else {
                URL url = new URL(inputFile); 
                input = new Scanner( url.openStream() );
            }
            int num = 0;
            while (input.hasNext()) {
                String word = input.next();
                num++;

                //-----------------------------------------------------------------
                // Ensure that the word ends in a printable character. That is, 
                // strip off from the end of word any commas, periods, apostrophes, 
                // etc.
                // Hint: Use Character.isAlphabetic to determine if a given char 
                //       is an alphabetic character and not a comma, or something
                //       else.
                
                


                //-----------------------------------------------------------------



                //-----------------------------------------------------------------
                // Update the occurrence count for word. 
                







                //-----------------------------------------------------------------

            }
            return num;
        } 
        catch (FileNotFoundException ex) {
            System.out.println("File not found error: " + ex.getMessage());
        }
        catch (IOException ex) {
            System.out.println("Read error: " + ex.getMessage());
        }
        finally {
            if (input != null) {
                input.close();
            }
        }
        return -1;
    }
}
