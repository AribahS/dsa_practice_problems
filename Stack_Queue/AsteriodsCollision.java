package Stack_Queue;

/*
735. Asteroid Collision
We are given an array asteroids of integers representing asteroids in a row.
The indices of the asteroid in the array represent their relative position in space.
For each asteroid, the absolute value represents its size, and the sign represents its direction
(positive meaning right, negative meaning left). Each asteroid moves at the same speed.
Find out the state of the asteroids after all collisions. 
If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. 
Two asteroids moving in the same direction will never meet.
*/
import java.util.ArrayList;
import java.util.List;

class AsteriodsCollision {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        List<Integer> st=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(asteroids[i]>0){
                st.add(asteroids[i]);
            }
            else{
  
while(!st.isEmpty() && st.get(st.size()-1)>0 && st.get(st.size()-1) < Math.abs(asteroids[i]) ){
                    st.remove(st.size()-1);
                }
                if (!st.isEmpty() && st.get(st.size() - 1) == Math.abs(asteroids[i])) {
                    st.remove(st.size() - 1);
                }
                else if (st.isEmpty() || st.get(st.size() - 1) < 0) {
                    st.add(asteroids[i]);
                }
    
            }
        }
        int[] result = new int[st.size()];
        for (int i = 0; i < st.size(); i++) {
            result[i] = st.get(i);
        }

        return result;
    }
}