/**
 * Created by sanjeev on 3/31/15.
 */
public class Hebbian {

        public static void main(String[] args) {

            int [] input1 = new int[]{1,1,-1,-1};
            int [] input2 = new int[]{1,-1,1,-1};
            int [] taget = new int[]{1,-1,-1,-1};

            int bias = 1;

            double weight1 = 0, weight2 = 0, Bweight = 0;

            for(int i=0;i<input1.length;i++){

                weight1 = weight1+(input1[i]*taget[i]);
                weight2 = weight2+(input2[i]*taget[i]);
                Bweight = Bweight+taget[i];

            }

            int []output = new int[input1.length];

            System.out.println("Weight1 : "+weight1+"\tWeight2 :"+weight2+"\tBias Weight :"+Bweight);

            System.out.println("\nInput1  "+"Input2  "+"Bias  "+"Output  "+"Target");

            for(int i=0;i<input1.length;i++){

                if(input1[i]*weight1+input2[i]*weight2+bias*Bweight > 0){
                    output[i]=1;
                }
                else{
                    output[i]=-1;
                }

                System.out.println(input1[i]+"\t\t"+input2[i]+"\t\t"+bias+"\t\t"+output[i]+"\t\t"+taget[i]);
            }
        }


}
