/*

int ack(m,n)
int m,n;
{
int ans;
if (m == 0) ans = n+1;
else if (n == 0) ans = ack(m-1,1);
else ans = ack(m-1, ack(m,n-1));
return (ans);
}

int main (argc, argv)
int argc; char ** argv;

{ int i,j;
for (i=0; i<6; i++)
for (j=0;j<6; j++)

printf ("ackerman (%d,%d) is: %d\n",i,j, ack(i,j));
}
 */

public class AckermannsFunc {

    public static void main(String[] args) {
        //System.out.println(ack(4, 3));

        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                System.out.format("Ackermann %d, %d is: %d. Time used: %d\n", i,j,ack(i,j), System.currentTimeMillis());
            }
        }


    }

    public static int ack(int m, int n){
        int ans;

        if(m == 0) {
            ans =  n + 1;
        }
        else if (n == 0) {
            ans = ack(m - 1, 1);
        }
        else {
            ans = ack(m - 1, ack(m,n - 1));
        }

        return ans;
    }

}
