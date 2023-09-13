package buscabinaria;

public class BuscaBinaria {
    
    // Busca binária recursiva
    public static int buscaBinariaRecursiva(int dado[], int x, int inf, int sup) {
        if (inf > sup) {
            return -1;
        }
        
        int meio = (inf + sup) / 2;
        
        if (x == dado[meio]) {
            return meio;
        } else if (x < dado[meio]) {
            return buscaBinariaRecursiva(dado, x, inf, meio - 1);
        } else {
            return buscaBinariaRecursiva(dado, x, meio + 1, sup);
        }
    }
    
    // Busca binária iterativa
    public static int buscaBinariaIterativa(int dado[], int x) {
        int inf = 0;
        int sup = dado.length - 1;
        
        while (inf <= sup) {
            int meio = (inf + sup) / 2;
            
            if (dado[meio] == x) {
                return meio;
            } else if (x < dado[meio]) {
                sup = meio - 1;
            } else {
                inf = meio + 1;
            }
        }
        
        return -1; // Retorna -1 se o elemento não for encontrado
    }
    
    public static void main(String[] args) {
        int dado[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 9;
        
        int resultadoRecursivo = buscaBinariaRecursiva(dado, x, 0, dado.length - 1);
        int resultadoIterativo = buscaBinariaIterativa(dado, x);
        
        System.out.println("Busca binária recursiva:");
        if (resultadoRecursivo != -1) {
            System.out.println("O elemento " + x + " foi encontrado no índice " + resultadoRecursivo);
        } else {
            System.out.println("O elemento " + x + " não foi encontrado no array.");
        }
        
        System.out.println("\nBusca binária iterativa:");
        if (resultadoIterativo != -1) {
            System.out.println("O elemento " + x + " foi encontrado no índice " + resultadoIterativo);
        } else {
            System.out.println("O elemento " + x + " não foi encontrado no array.");
        }
    }
}
