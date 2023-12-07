package ordenadores;

public class OrdenarPorSelecao implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int ID;
        int temporario;
        for (int i = 0; i < (array.length - 1); i++) {
            ID = i;
            for (int j = (i + 1); j < array.length; j++) {
                if(array[j] < array[ID]) {
                    ID = j;
                }
            }
            if (array[i] != array[ID]) {
                temporario = array[i];
                array[i] = array[ID];
                array[ID] = temporario;
            }
        }
        return array;
    }
    
}
