package ja;
import java.util.*;
public class TicTacToe {
    public static void main(String[] args) {
    	System.out.println("enter ");
        char[] b=new char[9];
        for(int i=0;i<9;i++)b[i]=' ';
        int[][] w={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
        int p=0,c=0;
        while(true) {
            if(c++%2==0)b[new Scanner(System.in).nextInt()]=c%2==0?'X':'O';
            for(int[] i:w)
                if(b[i[0]]==b[i[1]]&&b[i[1]]==b[i[2]]&&b[i[0]]!=' ') {
                    System.out.println(b[i[0]]+" wins!");
                    p=1;
                }
            if(Arrays.asList(b).contains(' ')) continue;
            else if(p==0) System.out.println("It's a draw!");
            break;
        }
    }
}