public class Main {
    public static void main(String[] args){
        int estimatedSquare, estimatedСube;
        System.out.println("Данные числа подходят под условаие: ");
        for(int k = 1; k <= 1000000; k++) {
            estimatedSquare  = (int)(Math.sqrt(k) + 0.5);//находим ближайший квадрат
            estimatedСube = (int)(Math.cbrt(k) + 0.5);//находим ближайший куб
            if(Math.pow(estimatedSquare,2) != k-1)//равен ли ближайший квадрат k-1?
                continue;
            if(Math.pow(estimatedСube,3) != k+1)//равен ли ближайший куб k+1?
                continue;
            System.out.println(k + " ");
        }
    }
}