/**
 * Created by sanjeev on 3/31/15.
 */
public class HopField {

    public static void main(String[] args) {

        System.out.println("First Pattern");
        int [] pattern=new int[]{0,1,0,1};

        int[][] weight=new int[][]{{0,-3,3,-3},{-3,0,-3,3},{3,-3,0,-3},{-3,3,-3,0}};

        Network network=new Network(weight,pattern);
        int net[]=new int[4];
        net=network.calNet();
        Neuron n=new Neuron(net);
        int output[]=new int[4];
        output=n.threshold();

        for(int i=0;i<4;i++){
            if(output[i]==pattern[i]){
                System.out.print("Pattern is  " + pattern[i] + " and Output is " + output[i] + ' ');
                System.out.println("Pattern Recognized");
            }
            else{
                System.out.println("Pattern is " +pattern[i]+" and Output is "+output[i]+' ');
                System.out.println("Pattern did not Recognized");
                break;
            }
        }

        System.out.println("Second Pattern");
        int [] pattern1=new int[]{1,1,0,1};
        Network network1=new Network(weight,pattern1);
        int net1[]=new int[4];
        net1=network.calNet();
        Neuron n1=new Neuron(net1);
        output=n1.threshold();

        for(int i=0;i<4;i++){
            if(output[i]==pattern1[i]){
                System.out.print("Pattern is  " + pattern1[i] + " and Output is " + output[i] + ' ');
                System.out.println("Pattern Recognized");
            }
            else{
                System.out.print("Pattern is " + pattern1[i] + " and Output is " + output[i] + ' ');
                System.out.println("Pattern did not Recognized");

            }
        }
    }
}
