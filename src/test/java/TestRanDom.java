// Import all the libraries
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Declare the Class
public class TestRanDom {
    // Declare the Main Function
    public static void main(String[] args)
    {
        // Declare a List (Be sure to include java.util.ArrayList; and java.util.List;)
        List<String> l = new ArrayList<>();
        l.add("Quote of the Day \r\nIf you find it in your heart to care for somebody else, you will have succeeded.  \r\nReopen the program for another quote.");
        l.add("Love Quote of the Day \r\nIf there's delight in love, 'Tis when I see that heart, which others bleed for, bleed for me.  \r\nReopen the program for another quote.");
        l.add("Art Quote of the Day \r\nArt is the stored honey of the human soul, gathered on wings of misery and travail.  \r\nReopen the program for another quote.");
        l.add("Nature Quote of the Day \r\nThe earth has received the embrace of the sun and we shall see the results of that love.  \r\nReopen the program for another quote.");
        l.add("Funny Quote Of the Day \r\nThe first condition of understanding a foreign country is to smell it.  \r\nReopen the program for another quote.");
        l.add("Quote of the Day \r\nAnger cannot be dishonest.  \r\nReopen the program for another quote.");
        l.add("Love Quote of the Day \r\nLove is when he gives you a piece of your soul, that you never knew was missing.  \r\nReopen the program for another quote.");
        l.add("Art Quote of the Day \r\nIt is only an auctioneer who can equally and impartially admire all schools of art.  \r\nReopen the program for another quote.");
        l.add("Nature Quote of the Day \r\nNature reserves the right to inflict upon her children the most terrifying jests.  \r\nReopen the program for another quote.");
        l.add("Funny Quote Of the Day \r\nMarriage is not just spiritual communion, it is also remembering to take out the trash.  \r\nReopen the program for another quote.");


        // Object name should be same as class
        TestRanDom obj = new TestRanDom();
        // Display the input dialog box from JOptionPane
        String inputValue = JOptionPane.showInputDialog("Please enter your name: ");
        // Declare Random object (Be sure to include java.util.Random;)
        Random rand = new Random();
        // Get Random Index from the List
        int randomIndex = rand.nextInt(l.size());
        // Get the element on the random index in the list
        String randomElement = l.get(randomIndex);
        //Display the output dialog box from JOptionPane to display the random element
        JOptionPane.showMessageDialog(null, randomElement + "\r\n\r\nHave a nice day " + inputValue + "!");
    }
}
