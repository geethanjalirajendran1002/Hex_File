public class consonant {
   public static void main(String args[]){
      String str = new String("abcdefghijklmnopq");
      int count=0;

      for (int i=0 ; i<str.length(); i++){
         char ch = str.charAt(i);
         if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
            System.out.print("");
         }else if(ch != ' '){
            count++;
         }
      }
      System.out.println("Number of consonants in the given sentence is "+count);
   }
}
