public class PrintSplitString {

    public static void main(String[] args) {
        String s1="splits the string based on whitespace";
        String[] words=s1.split("\\s");//splits the string based on whitespace

        //using java foreach loop to print elements of string array
        for(String w:words){
            System.out.println(w);
        }
    }
}
