import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> res = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                res.add(cell);
            }
        }
        return res;
    }
}
