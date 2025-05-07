public class Task2 {
    private static double function(double x){
        return Math.pow(2,x) + 2 * Math.pow(x,2) - 3;
    }
    private static double derivative(double x){
        return  Math.log(2) * Math.pow(2,x) + 4 * x;
    }
    private static double secondDerivative(double x){
        return Math.log(2) * Math.log(2) * Math.pow(2,x) + 4;
    }
    public double halfDivisionM(double a, double b , double ebs){
        double x = (a + b) / 2;
        while (Math.abs(function(x))>ebs){
            if (function(a) * function(x) < 0){
                b = x;
            } else if (function(b) *function(x)<0) {
                a = x;
            }
            x = (a + b) / 2;
        }
        return x;
    }
    public double NewtonM(double a, double b , double ebs){
        double x;
        if (function(a) * secondDerivative(a) > 0){
            x = a;
        } else {
            x = b;
        }
        while (Math.abs(function(x))>ebs){
            x = x - function(x) / derivative(x);
        }
        return x;
    }

    public double ChordM(double a, double b , double ebs){
        double x;
        if (function(b) * secondDerivative(b) > 0){
            x = a;
           while (Math.abs(function(x))>ebs){
               x = x - ((x - b) * function(x)) / (function(x) - function(b));
           }
        } else if (function(a) * secondDerivative(a) > 0) {
            x=b;
            while (Math.abs(function(x))>ebs){
                x= x - (x-a)*function(x)/(function(x)-function(a));
            }
        }
        else {
            throw new RuntimeException("Умова збіжності не виконується для a або b");
        }

        return x;
    }

}
