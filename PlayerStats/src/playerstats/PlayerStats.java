/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerstats;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author bugsb
 */
public class PlayerStats {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
String[] names = new String[80];
int[] scores = new int[80];
readingNamesAndScores(names, scores, args[0]);

}

private static void readingNamesAndScores(String[] names, int[] scores, String filename) {
try {
    Scanner reader = new Scanner(new File(filename));
    
    int currentIndex = 0;
    while(reader.hasNext()) {
        String[] line = reader.nextLine().split(" ");
        
        names[currentIndex] = line[0];
        scores[currentIndex] = Integer.parseInt(line[1]);
        
        currentIndex++;
        
    }
    } catch (FileNotFoundException ex) {
        Logger.getLogger(PlayerStats.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("File could not be found in readingNamesAndScores");
        }

        

// TODO code application logic here
    }
    
}
