/**
 * Created by sanjeev on 3/31/15.
 */
public class Neuron {

    int net[]=new int[4];
    int output[]=new int[4];

    public Neuron(int net[]){
        this.net=net;
    }

    public int[] threshold(){
        for(int i=0;i<4;i++){
            if(net[i]>=1){
                output[i]=1;
            }
            else{
                output[i]=0;
            }
        }
        return output;
    }

}
