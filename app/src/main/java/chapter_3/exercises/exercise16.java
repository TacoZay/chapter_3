package chapter_3.exercises;

/*(Random Point) Write a program that displays a random coordinate in a rectangle. The
rectangle is centered at (0,0) with width 50 and height 150 */
public class exercise16 {
    public static void main(String[] args){

        int height = 150;
        int width = 50;

        //Determine interval for both the x and y coordinates
        int ymax = height / 2;
        int ymin = -(height / 2);
        
    
        int xmax = width / 2;
        int xmin = -(width / 2);
        
        //compute the value within the x & y intervals
        int x = (int)(Math.random() * (xmax - xmin + 1)) + (xmin);
        int y = (int)(Math.random() * (ymax - ymin + 1)) + (ymin);

        //Display the results
        System.out.printf("The rectangle has a width of %d and a height of %d\n", width, height);
        System.out.printf("Y-Interval: [%d,%d]\n",ymin,ymax);
        System.out.printf("X-Interval: [%d,%d]\n",xmin,xmax);
        System.out.printf("Coordinates: (%d,%d)",x,y );
    }    
}
