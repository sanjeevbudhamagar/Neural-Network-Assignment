/**
 * Created by sanjeev on 3/31/15.
 */
public class Network {


    int [][] weight=new int[4][4];
    int pattern[]=new int[4];
    public Network(int weight[][],int pattern[]){
        this.weight=weight;
        this.pattern=pattern;

    }

    public int[] calNet(){

        int net[]=new int[4];
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                net[i]+=weight[i][j]*pattern[j];
            }
        }
        return net;
    }

}
