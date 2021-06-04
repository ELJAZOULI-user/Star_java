public class Main {
    public static void main(String[] args) {
        int size=5;
        int width=(size*6-1);
        int height=(size*4)+2;

        //for(int i=0;i<(size*4)+2;i++){
            //top pic
        for(int l=0;l<size;l++){
            if(l==0){
                System.out.println(" ".repeat(width/2)+"*");
            }else{
                System.out.println(" ".repeat((size*3)-l-1)+"*"+" ".repeat(l+(l-1))+"*");
            }
        }
        System.out.println("*".repeat((size*2)+1)+" ".repeat((size*2)-3)+"*".repeat((size*2)+1));
    }

}

