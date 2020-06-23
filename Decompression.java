
package decompression;

import java.util.ArrayList;

public class Decompression {

    /**
     * @param args the command line arguments
     */
  ArrayList <String> Dectionary = new ArrayList<String>();
       String phrase ;
       
       int index ; char x;
       
       
       public void decompress (ArrayList<Tag> tags){
            Tag tag=new Tag();
            Dectionary.add(null);
            phrase = null;
            
            for (int j=0;j<tags.size();j++){
            tag = tags.get(j);
            index=tag.getIndex();
            x=tag.getchar();
            
            
            if (index==0){
                //thats means this is the frist time the sympol appears 
                //add sympol in dectionary 
                Dectionary.add(String.valueOf(x));
                //put sympol in the output phrase.
                phrase = phrase + x;
                
            }else {
                //thts means this sympol founded in dectionary
                String intry;//string to save in it the intry of dectionary at index i.
                //get intry at index i
                intry = Dectionary.get(index);
                //add the intry + the sympol at the end of dectionary
                Dectionary.add(intry + x);
                //puild the phrase
                phrase =phrase + (intry+x);
                intry=null;
            }
         }
            System.out.println(phrase);
            
        }    
}
