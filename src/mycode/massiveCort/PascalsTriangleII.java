package mycode.massiveCort;

import java.util.ArrayList;
import java.util.List;

//119. Pascal's Triangle II

public class PascalsTriangleII {
    public static void main(String[] args) {
        int rowIndex = 3;
        int [] outPut = {1,3,3,1};
        System.out.println(getRow(rowIndex));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j==0 || j==i){
                    row.add(1);
                }else{
                    row.add(triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
                }
            }
            triangle.add(row);
        }
        return  triangle.get(rowIndex);
    }

}
