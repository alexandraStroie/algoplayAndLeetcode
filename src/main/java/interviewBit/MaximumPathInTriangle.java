package interviewBit;

//https://www.interviewbit.com/problems/maximum-path-in-triangle/

import java.util.ArrayList;
import java.util.HashMap;

public class MaximumPathInTriangle {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();

    }

    public static int solve(ArrayList<ArrayList<Integer>> A) {

        int sum =0;

        for (int i = 0; i < A.size() - 1; i++) {
            for (int j = 0; j < A.size() - 1; j++) {
                sum = sum + Math.max(A.get(i+1).get(j), A.get(i+1).get(j+1));
            }
        }

        return sum;
    }


    HashMap<String, Integer> memo = new HashMap<>();
    public int solve2(ArrayList<ArrayList<Integer>> A) {
        // calling the recursive function
        return maxSum(A, 0, 0, A.size()-1, A.size()-1);
    }

    private int maxSum(ArrayList<ArrayList<Integer>> A, int startX, int startY, int endX, int endY){
        // base case, if we reached the end
        if(startX == endX && startY == endY)
            return A.get(startX).get(startY);

        // if we exceed the matrix limits, means an unreasonable path
        if(startX>endX || startY>endY)
            return 0;

        // if it is present in the memo, i.e. the pair of indices has been calculated before.
        if(this.memo.containsKey(startX+":"+startY))
            return this.memo.get(startX+":"+startY);

        // calling the function for the 2 possible positions we can go to from here. Take max among them.
        int childPath = (int)Math.max(maxSum(A, startX+1, startY, endX, endY),
                maxSum(A, startX+1, startY+1, endX, endY));

        // putting our data in the memo so that can be used later to directly return for this set of indices
        this.memo.put(startX+":"+startY, childPath+A.get(startX).get(startY));

        // returning the path got by children, plus its own value.
        return childPath+A.get(startX).get(startY);
    }



    public int solve3(ArrayList<ArrayList<Integer>> A) {
        if (A.isEmpty() || A.get(0).isEmpty()) return 0;

        ArrayList<Integer> dp = new ArrayList<>();
        dp.add(A.get(0).get(0));

        for (int i=1; i < A.size(); i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(A.get(i).get(0) + dp.get(0));

            for (int j=1; j < i; j++) {
                temp.add(A.get(i).get(j) + Math.max(dp.get(j-1), dp.get(j)));
            }

            temp.add(A.get(i).get(i) + dp.get(dp.size()-1));

            dp = temp;
            // System.out.println(dp);
        }

        int ans = Integer.MIN_VALUE;
        for (int i : dp) ans = Math.max(ans, i);

        return ans;
    }

}
