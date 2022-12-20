import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("inputs//input_AoC_3a.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        List<String> listOfStrings = new ArrayList<>();

        String s;
        //put Strings in array
        while((s = br.readLine()) != null) {
            listOfStrings.add(s);
        }

        boolean find = false;
        List<Character> listOfChars = new ArrayList<>();

        for(String st : listOfStrings){
            for (int i=0; i<st.length()/2; i++){
                for(int j=st.length()/2; j<st.length(); j++){
                    if(st.charAt(i) == st.charAt(j)){
                        //System.out.println(st.charAt(i));
                        listOfChars.add(st.charAt(i));
                        find = true;
                    }
                    if(find == true) break;
                }
                if(find) break;
            }
            find = false;
        }

        System.out.println(listOfChars.size());

        int sum = 0;
        for (char c : listOfChars){
            int number = c;
            if(number >= 97 && number <=122) number -= 96;
            if(number >= 65 && number <= 96) number -= 38;

            sum += number;
            System.out.println(number);
        }
        System.out.println(sum);
    }
}