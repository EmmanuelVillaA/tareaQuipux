public class Actividad2Punto1 {
    public static void main(String[] args) {
        
        String[][] matrizPiases = new String[4][13]; 
        
        matrizPiases[0][0] = "Mexico";
        matrizPiases[0][1] = "Estados Unidos";
        matrizPiases[0][2] = "Canada";
        matrizPiases[1][0] = "Bolivia";
        matrizPiases[1][1] = "Guyana";
        matrizPiases[1][2] = "El Salvador";
        matrizPiases[1][3] = "Guatemala";
        matrizPiases[1][4] = "Honduras";
        matrizPiases[1][5] = "Nicaragua";
        matrizPiases[1][6] = "Perú";
        matrizPiases[2][0] = "Belice";
        matrizPiases[2][1] = "Arentina";
        matrizPiases[2][2] = "Brasil";
        matrizPiases[2][3] = "Chile";
        matrizPiases[2][4] = "Colombia";
        matrizPiases[2][5] = "Ecuador";
        matrizPiases[2][6] = "Costa Rica";
        matrizPiases[2][7] = "Paraguay";
        matrizPiases[2][8] = "Panamá";
        matrizPiases[2][9] = "Surinam";
        matrizPiases[2][10] = "Uruguay";
        matrizPiases[2][11] = "Venezuela";
        matrizPiases[3][0] = "Antigua y Barbuda";
        matrizPiases[3][1] = "Haiti";
        matrizPiases[3][2] = "Barbados";
        matrizPiases[3][3] = "Trinidad y tobago";
        matrizPiases[3][4] = "Dominica";
        matrizPiases[3][5] = "Granada";
        matrizPiases[3][6] = "Bahamas";
        matrizPiases[3][7] = "Santa Lucia";
        matrizPiases[3][8] = "República Dominicana";
        matrizPiases[3][9] = "San Cristóbal y Nieves";
        matrizPiases[3][10] = "Jamaica";
        matrizPiases[3][11] = "San Vicente y las Granadinas";
        matrizPiases[3][12] = "Cuba";

        System.out.println("Países de América con 4 letras:");

        for (int i = 0; i < matrizPiases.length; i++) {
            for (int j = 0; j < matrizPiases[i].length; j++) {
                if (matrizPiases[i][j] != null && matrizPiases[i][j].length() == 4) {
                    System.out.println(" - " + matrizPiases[i][j]);
                }
            }
        }
    }
}
