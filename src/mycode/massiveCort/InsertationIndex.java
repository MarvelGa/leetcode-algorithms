package mycode.massiveCort;

public class InsertationIndex {
    public static void main(String[] args) {
        String str = "word";
        System.out.println(getIndexOfInsertion(str, "rd"));

    }
    public static int getIndexOfInsertion(String target, String word){
        int indexOfFirstInsert = -1;
        for (int i=0; i<=target.length()-word.length(); i++){
            for (int j=0; j<word.length(); j++){
               if (target.charAt(i+j) != word.charAt(j)){
                   break;
               }
               if (j==word.length()-1){
                   indexOfFirstInsert=i;
                   return indexOfFirstInsert;
               }

            }
        }
        return indexOfFirstInsert;
    }
}
