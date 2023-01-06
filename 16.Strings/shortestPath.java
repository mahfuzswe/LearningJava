public class shortestPath {
    //displacement --> shortest path

    //root((x2-x1)^2+(y2-y1)^2))

    // inatially, x=0,y=0; 
    //for North means upore jabo tokhon: y+1
    //South e gele nicher dike : y-1
    //West e gele left er dike jabo: x-1
    //East e gele right er dike jabo: x+1

    //At first draw diagram and think about logic

    public static float getShortestPath(String path){
        int x =0, y =0;

        for(int i=0; i<path.length(); i++){ // Time Complexity: O(n)
            char dir = path.charAt(i);

            //South
            if(dir == 'S'){
                y--;
            }
            //North
            else if(dir == 'N'){
                y++;
            }
            //West
            else if(dir == 'W'){
                x--;
            }
            //East
            else{
                x++;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2+Y2);
    }
    
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}


