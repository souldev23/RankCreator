/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.com.rc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MarkXXIV
 */
public class FileManager 
{
    private File f;
    public FileManager(String filePath)
    {
        f = new File(filePath);
    }
     public File getFile()
     {
         return f;
     }
     
     public int[] getNumbers() throws FileNotFoundException, IOException, NumberFormatException
     {
         String line;
         
         List<Integer> lines = new ArrayList();
         FileReader fr = new FileReader(f);
         BufferedReader br = new BufferedReader(fr);
         while((line = br.readLine()) != null)
         {
             Integer number = Integer.parseInt(line);
             //System.out.println(number);
             lines.add(number);
         }
         int numbers[] = new int[lines.size()];
         if(lines.size()>0)
         {
             int index = 0;
            for(int num : lines)
            {
                numbers[index] = num;
                index++;
            }
         }
         return numbers;
     }
     
     public boolean saveResult(List<String> ranges, String path) throws IOException
     {
         boolean isCreated = false;
         
        FileWriter writer = new FileWriter(path);
        for(String range : ranges)
        {
            writer.write(range + "\r\n");
        }
        writer.close();
        isCreated = true;
         return isCreated;
     }
}
