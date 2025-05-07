public class Task3 {
    public double RangeKutta2(double x0,double xn,double y0,double h){
        int n =(int)((xn - x0)/h + 1);
        double x = x0;
        double y = y0;
        for (int i = 0; i < n; i++) {
            double k1 =  h * derivF(x,y);
            double k2 = h * derivF(x + h/2,y + k1/2);
            y = y + k2;
            x = x + h;
        }
        return y;
    }
    private double derivF(double x, double y){
        return 1/(2 * x - Math.pow(y,2));
    }
}
