import java.io.*;
/** This class is for heap and all the the fns made in drugheaps are called in this class
 */
public class Mainfn {
    Drugheaps obj;                       // Object of drugheaps
    public Mainfn(){
        obj =new Drugheaps();             // Calling the constructor of drugheaps
        try{
            obj.heapBuild();
            obj.wrt =new FileWriter("inordertraversal.tab"); //so that drugs can be written in order in file

            obj.inordTraversal(1);
            obj.heapSort();  ///perform sorting via heap sort algo
            obj.wrt.close();       //Close stream

        }
        catch (IOException wrong){
            System.out.println("Something  wrong");
        }
    }
    //execution starts
    public static void main(String []args){
        Mainfn func=new Mainfn();
    }
}
