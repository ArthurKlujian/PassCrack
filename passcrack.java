import java.util.*;


public class passcrack{     
   
   public static void crack(String password)
   {
     String[] let = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","J","I","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","`","~","!","@","#","$",",","%","^","&","*","(",")","-","_","=","+","[","{","]","}","\",","|",";",":","\'","\"","<",".",">","/","?", "."};
 String guess="";
 int numofguesses=0;
  while(!guess.equals(password)){
     
       guess="";
         for(int k=0; k<=password.length()-1; k++)
        { 
         int letter = (int)(Math.random()*let.length);
         guess+=let[letter];
        }
         System.out.println(guess);
         numofguesses+=1;
       
   
   }
   if(guess.equals(password))
   {
      System.out.print("You have cracked the password! It is " + "\"" + guess + "\"" + ". It took " + numofguesses + " guesses.");
   }
}

   public static void main(String[] args){
   {
        
   crack("job");
             
}
}
}