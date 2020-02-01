import java.util.*;
public class MyReader{
    
    //modify following line so that this method can throw Exception
    
    int readInteger () throws EitaIntegerNoiException {
        
        Scanner k = new Scanner(System.in);
        
        int answer = 0;
        String s = k.next();
        
        if (s.contains(".")) {
            throw new EitaIntegerNoiException();
        } else {    
            answer = Integer.parseInt(s);
        }
        
        return answer;
    }
}