public class HomeWorkc {

        public static void main(String[] args) {


            boolean redIsHitFromBehind = true;
            boolean blackIsHitFromBehind = false;
            if(redIsHitFromBehind == true && blackIsHitFromBehind == true){
                System.out.println("Invalid state");
            }else if (redIsHitFromBehind == true && blackIsHitFromBehind == false){
                System.out.println("Red");
            }else if (redIsHitFromBehind == false && blackIsHitFromBehind == true){
                System.out.println("Black");
            }else System.out.println("Invalid state");

        }


}
