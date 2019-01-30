import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class GoogleInterviewPrep01 {
    public static void main(String[] L) {
        L = new String[]{"a.b@example.com", "x@example.com", "x@exa.mple.com", "ab+1@example.com", "y@example.com", "y@example.com", "y@example.com"};
        solution(L);
    }

    public static int solution(String[] L){
        // L = input.split
        L = Arrays.stream(L).map(s->s.replace(".","")).toArray(size -> new String[size]);
        int count = 0;
        for(int i = 0; i < L.length; i++)
        {
            if(L[i] != null)
                count++;
        }

        System.out.println(Arrays.toString(L));
        System.out.println(count);
        return count;
    }
}