import java.util.ArrayList;
import java.util.List;

public class q3 {

    private String openDel;
    private String closeDel;

    public q3(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    public ArrayList<String> getDelimitersList(String[] tokens)
    {
        ArrayList a = new ArrayList<String>();
        for(int i = 0; i < tokens.length; i++)
        {
            if(tokens[i].equals(openDel) || tokens[i].equals(closeDel))
            {
                a.add(tokens[i]);
            }
        }
        return a;
    }

    public boolean isBalanced(ArrayList<String> delimiters)
    {
        int oDel = 0;
        int cDel = 0;
        for(int i = 0; i < delimiters.size(); i++)
        {
            if(delimiters.get(i).equals(closeDel))
            {
                cDel++;
            }
            else
            {
                oDel++;
            }
            if(cDel>oDel)
            {
                return false;
            }
        }
        if(closeDel != openDel)
        {
            return false;
        }
        return true;
    }

    public String toString(ArrayList<String> b)
    {
        String a = "";
        for(int i = 0; i < b.size(); i ++)
        {
            a += b.get(i) + " ";
        }
        return a;
    }

}
