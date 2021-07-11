package clase01;
public class Clase01 {
    public static void main(String[] args) {
        //double e=Math.PI, resultado;
        //resultado = Math.pow(2,8);
        //System.out.println(resultado);
        //System.out.println(e);
        
        //Para redondear un double, con long
        double numero = 4.56;
        long resultado = Math.round(numero);
        System.out.println(resultado);
        //Para redondear un float, con int
        float decimal = 7.56f;
        int resultado1 = Math.round(decimal);
        System.out.println(resultado1);
        
        double numero1 = Math.random();
        System.out.println(numero1);
        
    }
}
