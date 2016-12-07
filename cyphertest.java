
/**
 * Write a description of class cyphertest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cyphertest
{
    /**
     * Constructor for objects of class cyphertest
     */
    public static void main (String[] args)
    {
        String msg1 = "csy lezi ievrih wsqi gssomiw";
        String msg2 = "xlmw wigvix gshi aew iewc";
        String msg3 = "wxst typpmrk csyv terxw hsar";
        String msg4 = "xli kirmyw jmpiw lew gmtlivw pmoi xlmw";
        
        cypher decoded1 = new cypher(msg1);
        cypher decoded2 = new cypher(msg2);
        cypher decoded3 = new cypher(msg3);
        cypher decoded4 = new cypher(msg4);
        
        decoded1.decode();
        decoded2.decode();
        decoded3.decode();
        decoded4.decode();
        
        System.out.println(decoded1);
        System.out.println(decoded2);
        System.out.println(decoded3);
        System.out.println(decoded4);
    }
}










