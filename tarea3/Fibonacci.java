
class Fibonacci{

    public static void main(String args[]){

        int x1=0;
        int x2=1;
        int x3;
        int i=2;
        
        System.out.println(x1+" "+x2);

      
            do{
            x3=x1+x2;
            System.out.println(x3);

            x1=x2;
            x2=x3;
           
        i++;
        }while(i<=10);

      




    }



}