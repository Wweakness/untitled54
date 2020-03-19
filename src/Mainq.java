import java.util.Scanner;

public class Mainq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String[] m=a.split(" ");
        String[] n=b.split(" ");
        int count=0;
        StringBuilder r=new StringBuilder();
        for(int j=1;j<m.length;j++) {
            int k = 0;
            for (int i = 0; i < n[0].length(); i++) {

                if ((m[j].contains(String.valueOf(n[0].charAt(i)))) && (m[j].length() == n[0].length()) && (!m[j].equals(n[0]))) {
                    k++;
                }
            }
                    if (k == n[0].length()) {
                        count++;
                        r.append(m[j]);
                        r.append(" ");
                    }

            }

        if(count==0){
            System.out.println("0");
        }else {
            String[] result=r.toString().split(" ");
            if(Integer.parseInt(n[1])>=count){
                System.out.println(count);
            }
            else {
                System.out.println(count+" "+result[Integer.parseInt(n[1])-1]);

            }
        }
    }
}
