package projecteulerproblem1;

public class ProjectEulerProblem1 {

    public static void main(String[] args) {
        int limit = 1000;
        int multiples[] = {3, 5};
        int sum = 0;

        for (int n = 1; n < 1000; n++) {
            for (int x = 0; x < multiples.length; x++) {
                if(n % multiples[x] == 0) {
                    sum += n;
                    break;
                }
            }
        }
        
        System.out.println(sum);
    }
}
