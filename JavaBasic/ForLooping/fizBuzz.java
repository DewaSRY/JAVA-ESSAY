package JavaBasic.ForLooping;


public class fizBuzz {
    
    public static void run(int start, int end) {
        if (start < 0 || end < 0 || start > end) {
            System.out.println("Please insert correct number");
        } else {
            for(int num = start;num <= end ;  num++){
                if(num % 3 == 0 && num% 5== 0){
                    System.out.println(num + " Fizz buzz");
                } else if (num % 3 == 0) {
                     System.out.println(num + " Fizz");
                 } else if (num % 5 == 0) {
                     System.out.println(num + " Buzz");
                }
            }
        }
    }
}
