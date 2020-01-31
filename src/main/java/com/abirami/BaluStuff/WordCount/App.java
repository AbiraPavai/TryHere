package com.abirami.BaluStuff.WordCount;

import java.io.*;


public final class App 
{
    private App() 
    {
    }
    public static void main(String[] args) 
    {
        try
        {
            System.out.println("Simple Java Word Count Program");
            System.out.println("-------------------------------");
            System.out.print("1) String: \n2) File");
            System.out.println("\n1 or 2:");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    	    int wordCount = 0;
            int choice = Integer.parseInt(reader.readLine());
        
            switch(choice)
            {
                case 1: 
                {
                    System.out.println("Enter the String:");
                    String str1 = reader.readLine();
                    String[] wordArray = str1.trim().split("\\s+");
                    wordCount = wordArray.length;
                    break;
                }
                case 2: 
                {
                    System.out.println("Enter the File Path:");
                    String filePath = reader.readLine();
                    File f1=new File(filePath); 
                    FileReader fr = new FileReader(f1);
                    String[] words=null;    
                    BufferedReader br = new BufferedReader(fr); 
                    String s;
                    while((s=br.readLine())!=null)   
                    {
                        words=s.split(" ");   
                        wordCount=wordCount+words.length;   
                    }
                    fr.close();
                    break;
               
                }
            }

            System.out.println("Word count is = " + wordCount);
        }
        catch(Exception exception)
        {

        }
        
    }
}
