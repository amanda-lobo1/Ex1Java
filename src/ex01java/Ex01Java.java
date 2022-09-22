package ex01java;

public class Ex01Java {
    public static void main(String[] args) {
        String cidades[] = new String[] { "Londres", "Madrid", "Nueva York", "Buenos Aires",
                "Asunsion", "São Paulo", "Lima","Santiago de Chile", "Liboa", "Tokio" };

        int temperaturas[][] = new int[][] {{-2, 33},{-3,32},{-8, 27},{4, 37},{6, 42},
                {5, 43},{0, 39}, {-7, 26},{-1,31}, {-10, 35}};

        int temperaturaMaxima = temperaturas[0][0];
        int temperaturaMinima = temperaturas[0][0];
        String cidadeMaxima = cidades[0];
        String cidadeMinima = cidades[0];

        for (int i = 0; i < temperaturas.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (temperaturaMinima > temperaturas[i][0]){
                    temperaturaMinima = temperaturas[i][0];
                    cidadeMinima = cidades[i];
                }

                if (temperaturaMaxima < temperaturas[i][j]){
                    temperaturaMaxima = temperaturas[i][j];
                    cidadeMaxima = cidades[i];
                }
            }
        }

        System.out.println("A temperatura mais baixa foi em "+cidadeMinima+", com "+temperaturaMinima+"ºC");
        System.out.println("A temperatura mais alta foi em "+cidadeMaxima+", com "+temperaturaMaxima+"ºC");
    }
}
