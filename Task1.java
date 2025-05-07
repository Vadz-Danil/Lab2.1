public class Task1 {
    private static double function(double x){
        return Math.sin(Math.sqrt(1 + x * x + x));
    }
    public double MethodRectangleL(double a, double b,double step){
        double sum = 0;
        double x = a;
        int n = (int)((b - a)/ step);
        for (int i = 0; i < n; i++) {
            sum += function(x + i * step);
        }
        return sum * step;
    }
    public double MethodRectangleR(double a, double b,double step){
        double sum = 0;
        double x = a;
        int n = (int)((b - a)/ step);
        for (int i = 1; i <= n; i++) {
            sum += function(x + i * step);
        }
        return sum * step;
    }
    public double MethodRectangleM(double a, double b,double step){
        double sum = 0;
        double x = a + step/2;
        int n = (int)((b - a)/ step);
        for (int i = 0; i < n; i++) {
            sum += function(x + i * step);
        }
        return sum * step;
    }
    public double TrapezoidMethod(double a, double b,double step){
       double sum = (function(a) + function(b)) / 2;
       int n = (int)((b - a)/ step);
       double current;
       for (int i = 1; i < n; i++) {
           current = a + i * step;
           sum += function(current);
       }
       return sum * step;
    }
    public double SimpsonMethod(double a, double b,double step){
        double sum = function(a) + function(b);
        int n = (int)((b - a)/ step);
       double x;
       double subsum = 0;
        for (int i = 1; i < n; i+=2) {
            x = a + i * step;
           subsum += function(x);
        }
        subsum *=4;
        sum += subsum;
        subsum = 0;
        for (int i = 2; i < n - 1; i += 2) {
            x = a + i * step;
            subsum += function(x);
        }
        subsum *= 2;
        sum += subsum;
        return sum * step / 3;
    }
}
