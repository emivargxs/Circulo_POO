//VERSAO SEM SCANNER 
 public class Circulo {
    private double x;
    private double y;
    private double raio;

    public Circulo(double x, double y, double raio){
        if(x <0){
            System.out.println("x não pode ser negativo");
        } else{
            this.x = x;
        }

        if(y < 0){
            System.out.println("y não pode ser negativo");
        } else{
            this.y = y;
        }

        if(raio < 0){
            System.out.println("raio não pode ser negativo");
        } else{
            this.raio = raio;
        }
    }

    public double getRaio(){
        return raio;
    }

    public double getX(){
        return x;
    }

    public double getY(){   
        return y;
    }

    private void setX(double x){
        if(x >= 0){
            this.x = x; 
        } else{
            System.out.println("x não pode ser negativo");
        }
   }

    private void setY(double y){
        if(y >= 0){
            this.y = y; 
        } else{
            System.out.println("y não pode ser negativo");
        }       
    
    }
    public Double calcularArea(){
        return Math.PI * raio * raio;
    }

    public double cumprimentoCircunferencia(){
        return 2 * Math.PI * raio;
    }

    public void mudaPosicaoCirculo(double x, double y){
        setX(x);
        setY(y);
    }
    public static void main(String[] args) {
        Circulo circulo = new Circulo(1, 2, 3);
        System.out.println("Área: " + circulo.calcularArea());
        circulo.mudaPosicaoCirculo(5, 6);
        System.out.println("Nova posição: (" + circulo.getX() + ", " + circulo.getY() + ")");
        System.out.println("Comprimento: " + circulo.cumprimentoCircunferencia());
 
        Circulo circulo2 = new Circulo(5, 10, 12);
        System.out.println("Área: " + circulo2.calcularArea());
        circulo.mudaPosicaoCirculo(10, 18);
        System.out.println("Nova posição: (" + circulo2.getX() + ", " + circulo.getY() + ")");
        System.out.println("Comprimento: " + circulo2.cumprimentoCircunferencia());
    }
}
