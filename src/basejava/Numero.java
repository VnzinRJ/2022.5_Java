package basejava;


public class Numero {
    int valor;
    
    public String parImpar(){
    if(this.valor % 2 ==0){
           return "PAR";
       }else{
           return "IMPAR";
       }
    }
    public int maiorValor(int valor1, int valor2){
        if(valor1 > valor2){
            return valor1;
        }
        return valor2;
    }
}
