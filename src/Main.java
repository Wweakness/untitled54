/*
nowcoder有两盒（A、B）乒乓球，有红双喜的、有亚力亚的……现在他需要判别A盒是否包含了B盒
中所有的种类，并且每种球的数量不少于B盒中的数量，该怎么办呢？

每一组输入对应一行输出：如果B盒中所有球的类型在A中都有，并且每种球的数量都不大于A，则输出“Yes”；否则输出“No”。
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            String[] a=str.split(" ");
           ArrayList<Character> A= new ArrayList<Character>();
           ArrayList<Character> B=new ArrayList<Character>();
           for(int i=0;i<a[0].length();i++){
               A.add(a[0].charAt(i));
           }
           for (int i=0;i<a[1].length();i++){
               B.add(a[1].charAt(i));
           }
           for(int i=0;i<B.size();i++){
               if(A.contains(B.get(i))){
                   A.remove(A.get(A.indexOf(B.get(i))));
                   B.remove(i);
                   i--;
               }
           }
           if(B.size()==0){
               System.out.println("Yes");
           }else {
               System.out.println("No");
           }


        }
    }
}
