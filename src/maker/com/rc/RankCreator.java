/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maker.com.rc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MarkXXIV
 */
public class RankCreator 
{
    public RankCreator()
    {
        
    }
    
    public List<String> createIntervals(int numeros[])
    {
        List<String> intervals = new ArrayList();
        int ini=0, fin=0, aux=0;
        for (int i = 0; i<numeros.length; i++)
        {
                if(i==0)
                {
                        ini=numeros[i];
                        aux=numeros[i];
                }
                if((numeros[i]-aux)>1)
                {
                        fin = aux;
                        intervals.add(ini + "-" + fin);
                        ini=numeros[i];
                }
                if(i == numeros.length-1)
                {
                        fin = numeros[i];
                        intervals.add(ini + "-" + fin);
                }
                aux=numeros[i];
        }
        return intervals;
    }
}
