import java.util.Arrays;

public class ColaDoble {
    private int numElementos;
    private int  frente;
    private int ultimo;
    private String [] cola;// Valor  por  defecto sera igual a null

    public ColaDoble(int capacidad){
        this.cola =new String[capacidad];
        this.numElementos= numElementos;
        this.ultimo= -1;
        this.frente= frente;
    }

    public int getNumElmentos() {
        return numElementos;
    }
    public boolean vacia (){
        return numElementos == 0;
    }

    public String getFrente() {
        return cola[frente];
    }

    public String getUltimo() {
        return cola [ultimo];
    }

    public boolean insertarFinal(String e){
        if(numElementos<cola.length) {
            int siguiente= (ultimo+1)% cola.length;
            cola[siguiente] = e;
            ultimo = (ultimo+1) % cola.length;
            numElementos++;
            return true;
        }
        return false;
    }

    public String toString(){
        return Arrays.toString(cola);
    }

    public String removerFrente(){
        if(!vacia()){
            String e = cola[frente];
            cola[frente]= null;
            frente=(frente+1)% cola.length;
            numElementos--;
            return e;
        }
        return null;
    }

    public static void main(String[] args) {
        ColaDoble q= new ColaDoble(6);
        q.insertarFinal("A");
        q.insertarFinal("B");
        q.insertarFinal("C");
        q.insertarFinal("D");
        q.insertarFinal("E");
        q.insertarFinal("F");
        q.insertarFinal("G");
        q.removerFrente();
        q.removerFrente();
        q.removerFrente();
        q.insertarFinal("G");
        System.out.println(q);
    }


}
