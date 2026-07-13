class Solution {
    public int largestRectangleArea(int[] heights) {
         Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= heights.length; i++) {
            int currHeight = (i == heights.length) ? 0 : heights[i];
            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int leftSmaller = stack.isEmpty() ? -1 : stack.peek();
                int width = i - leftSmaller - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
