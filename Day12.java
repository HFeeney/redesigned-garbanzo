import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Day12 {

    public static void main(String[] args) {

        File file = new File("/Users/haydenfeeney/Documents/Code/redesigned-garbanzo/input.txt");
        Scanner s = null;
        try {
            s = new Scanner(file);
        } catch (Exception e) {
            return;
        }
        
        List<List<Integer>> input = new ArrayList<>();

        while (s.hasNextLine()) {
            List<Integer> line = new ArrayList<>();
            for (char c : s.nextLine().toCharArray()) {
                line.add((int)c);
            }
            input.add(line);
        }

        System.out.println(input);
    }

    public static int countTrees(List<List<Integer>> input) {
        return 0;
    }
}