/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;

/**
 *
 * @author Praveen M
 */
public class cache{

  public static final int cache_length=8;
  public static final int words_per_line=6;
  public static int[] words= new int[words_per_line];//6 words in each cache line
  int i;
  public CacheLine[] cacheline=new CacheLine[cache_length];
  cache (){
	  
	 // CacheLine[] cacheline=new CacheLine[cache_length];
	  
	  for( i = 0; i < 8; i++){
		  
		  cacheline[i]=new CacheLine(-1,words,-1,0);
	  }


  }
}
