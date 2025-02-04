public class Primo {
        public static boolean p(int n){
            if (n==1)
                return true;
            else {
                int c=0;
                for (int i=2; i<n; i++){
                    if ((n%i)==0)
                        c++;

                }
                if (c==0)
                    return true;
                else
                    return false;
            }
        }
        public static void main(String[] args){
            System.out.println(p(3));
        }
    }

