/*
In the Towers of Hanoi puzzle, we are given a platform with three pegs, a, b, and c, sticking out of it. 
On peg a is a stack of n disks, each larger than the next, so that the smallest is on the top and the largest is on the bottom. 
The puzzle is to move all the disks from peg a to peg c, moving one disk at a time, so that we never place a larger disk on top of a smaller one. 
See Figure 1 for an example of the case n = 4. 
Write a recursive program using Java for solving the Towers of Hanoi puzzle for arbitrary n. 
(Hint: Consider first the subproblem of moving all but the nth disk from peg a to another peg using the third as “temporary storage.”).
*/

public class HQ8 {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if (n==1){
            System.out.println("Moving "+n+" from "+src+" to "+ dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("Moving "+n+" from "+src+" to "+ dest);
        towerOfHanoi(n-1,helper,src,dest);
    }
    
    public static void main(String[] args) {
        int n=3;
        towerOfHanoi(n,"S","H","D");
    }
}
