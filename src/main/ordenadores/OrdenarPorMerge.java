package ordenadores;
public class OrdenarPorMerge implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        if (array.length > 1) {
            int[] array_temp_1 = new int[array.length / 2];
            int[] array_temp_2 = new int[array.length - array_temp_1.length];
            for (int i = 0; i < array_temp_1.length; i++) {
                array_temp_1[i] = array[i];
            }
            for (int i = 0; i < array_temp_2.length; i++) {
                array_temp_2[i] = array[i + array_temp_1.length];
            }
            array_temp_1 = ordene(array_temp_1);
            array_temp_2 = ordene(array_temp_2);
            array = merge(array_temp_1, array_temp_2);
        }
        return array;
    }

    public int[] merge(int[] array, int[] array2) {
        int[] array_resultado = new int[array.length + array2.length];
        int i = 0, j = 0, k = 0;
        while ((i < array.length) && (j < array2.length)) {
            if (array[i] < array2[j]) {
                array_resultado[k] = array[i];
                i++;
            } else {
                array_resultado[k] = array2[j];
                j++;
            }
            k++;
        }
        for (k = k; i < array.length; k++) {
            array_resultado[k] = array[i];
            i++;
        }
        for (k = k; j < array2.length; k++) {
            array_resultado[k] = array2[j];
            j++;
        }
        return array_resultado;
    }
    
}
