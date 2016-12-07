
/**
 * Write a description of class cypher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cypher
{
    // creates variables for both the original and new sentences
    private String oldsent;
    private String newsent = "";

    /**
     * Constructor for objects of class cypher
     */
    public cypher()
    {
        // placeholder variable just in case
        oldsent = "x";
    }
    /**
     * Constructor for objects of class cypher
     * @param String msg
     */
    public cypher(String msg)
    {
        // sets the old sentence to what the client code uses
        oldsent = msg;
    }

    /**
     * decodes the given message
     * @return String newsent
     */
    public String decode()
    {
        for (int i = 0; i < oldsent.length(); i++){
            char c = oldsent.charAt(i);
            
            if (c == 32){
                c = c;
            }else if (c+22 <= 122){
                c += 22;
            }else{
                c -= 4; }
            newsent += c;
        }
        return newsent;
    }
    /**
    *  Returns a one-line description of the account as a string.
    */
    public String toString ()
    {
       String data = "old sentence: " + oldsent + "\n";
       data += "new sentence: " + newsent + "\n";
       return data;
    }
}























