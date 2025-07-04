// using two pointers to find the container with most water
public class ContainerWithMostWater{

    public static int maxArea(int[] height) {
        int maxArea = 0;

        int left = 0, right = height.length - 1;

        while(left < right){
            int area = Math.min(height[left], height[right]) * (right - left);

            maxArea = Math.max(maxArea, area);

            if(height[left] < height[right]){
                left++;
            } else{
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 2};
        System.out.println("Max area: "+ maxArea(height));
    }
}