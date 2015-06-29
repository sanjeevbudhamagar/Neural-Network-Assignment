/**
 * Created by sanjeev on 3/31/15.
 */
public class MccullochPitts {

    public static void main(String[] args) {
        int []input1=new int[]{0,0,1,1};
        int []input2=new int[]{0,1,0,1};
        double weight1=0.7,weight2=0.7;
        double threshold=0.5;
        int output[]= new int[input1.length];
        for(int i=0;i<input1.length;i++){
            if((input1[i]*weight1+input2[i]*weight2)>threshold){
                output[i]=1;
            }
            else{
                output[i]=0;
            }
        }
        System.out.println("Input1  "+"Input2  "+"Output");
        for(int i=0;i<output.length;i++){
            System.out.println(input1[i]+"\t\t"+input2[i]+"\t\t"+output[i]);
        }

    }

}
