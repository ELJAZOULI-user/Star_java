public class Main {
    public static void main(String[] args) {
        int size=5;
        int width=(size*6-1);
        int height=(size*4)+2;
        //top pic
        for(int l=0;l<size;l++){
            if(l==0){
                System.out.println(" ".repeat(width/2)+"*");
            }else{
                System.out.println(" ".repeat((size*3)-l-1)+"*"+" ".repeat(l+(l-1))+"*");
            }
        }
        //line
        System.out.println("*".repeat((size*2)+1)+" ".repeat((size*2)-3)+"*".repeat((size*2)+1));
        
        //sides
        for(int k=1;k<(size*2);k++){
            if(k<size){
                System.out.println(" ".repeat(k) + "*" + " ".repeat(width - (k * 2) - 2) + "*");
            }else{
                System.out.println(" ".repeat(size*2-k) + "*" + " ".repeat(width - ((size*2-k) * 2) - 2) + "*");
            }
        }
        
        //line
        System.out.println("*".repeat((size*2)+1)+" ".repeat((size*2)-3)+"*".repeat((size*2)+1));
        
        //bottom pic
        for(int l=size-1;l>=0;l--){
            if(l==0){
                System.out.println(" ".repeat(width/2)+"*");
            }else{
                System.out.println(" ".repeat((size*3)-l-1)+"*"+" ".repeat(l+(l-1))+"*");
            }
        }
        
    }

}

