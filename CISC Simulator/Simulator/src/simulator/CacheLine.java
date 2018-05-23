/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;

import java.awt.TextArea;
//import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

/**
 *
 * @author Praveen M
 */


public class CacheLine{
    
	public static final int words_per_line=6; //the number of words in each line
    
        private int tag=-1;//the contents of the memory location are identified by tag
    
  	private  int[] words= new int[words_per_line];//6 words in each cache line
   
  	private int present=-1;//Present bit
    
  	private int write=0;//write bit
            
    public CacheLine(int tag,int[] words,int present,int write)
    {
        this.tag=tag;
        this.words=words;
        this.present=present;
        this.write=write;
        
      }
    
    public int getTag(){
        return tag;
    }

    public void setTag(int tagModified){
    	this.tag = tagModified;
    }
   public int getWord(int index) {
		return words[index];
	}

    
    public int getPresent()
    {
        return present;
    }
    
    public int getWrite()
    {
        return write;
    }
    
    public boolean isWritten()
    {
        return write>0;
    }
    
    public void setWord(int word, int index)
    {
        this.words[index]=word;
        
    }       
    
    public void setPresent(int p)
    {
        this.present=p;
    }
    
    public void setWrite(int w)
    {
        this.write=w;
    }
    
 }
