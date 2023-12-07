package ordenadores;
public class OrdenarPorInsercao implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int valorAtual;
        for (int i = 1; i < array.length; i++) {
            valorAtual = array[i];
            int j;
            for (j = i; j > 0; j--){
                if (array[j - 1] > valorAtual) {
                    array[j] = array[j - 1];
                } else {
                    break;
                }
            }
            array[j] = valorAtual;
        }
        return array;
    }
    
}
