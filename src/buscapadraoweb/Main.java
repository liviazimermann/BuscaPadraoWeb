/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package buscapadraoweb;

import buscaweb.CapturaRecursosWeb;
import java.util.ArrayList;

public class Main {

    public static int get_char_ref(char[] vet, char ref){
        for (int i=0;i<vet.length;i++){
            if (vet[i]==ref) return i;
        }
        return -1;
    }

    public static int get_string_ref(String[] vet, String ref){
        for (int i=0;i<vet.length;i++){
            if (vet[i].equals(ref)) return i;
        }
        return -1;
    }

    public static int proximo_estado(char[] alfabeto, int[][] matriz,int estado_atual,char simbolo){
        int simbol_indice = get_char_ref(alfabeto, simbolo);
        if (simbol_indice!=-1){
            return matriz[estado_atual][simbol_indice];
        }else{
            return -1;
        }
    }

    public static void main(String[] args){
        CapturaRecursosWeb crw = new CapturaRecursosWeb();
        crw.getListaRecursos().add("https://groups.google.com/g/jrimum-community/c/00-sQqBVuPA?pli=1");
        ArrayList<String> listaCodigos = crw.carregarRecursos();

        String codigoHTML = listaCodigos.get(0);

        char[] alfabeto = new char[12];
        alfabeto[0]='0';
        alfabeto[1]='1';
        alfabeto[2]='2';
        alfabeto[3]='3';
        alfabeto[4]='4';
        alfabeto[5]='5';
        alfabeto[6]='6';
        alfabeto[7]='7';
        alfabeto[8]='8';
        alfabeto[9]='9';
        alfabeto[10]='.';
        alfabeto[11]=' ';

        String[] estados = new String[54];
        estados[0] = "q0";
        estados[1] = "q1";
        estados[2] = "q2";
        estados[3] = "q3";
        estados[4] = "q4";
        estados[5] = "q5";
        estados[6] = "q6";
        estados[7] = "q7";
        estados[8] = "q8";
        estados[9] = "q9";
        estados[10] = "q10";
        estados[11] = "q11";
        estados[12] = "q12";
        estados[13] = "q13";
        estados[14] = "q14";
        estados[15] = "q15";
        estados[16] = "q16";
        estados[17] = "q17";
        estados[18] = "q18";
        estados[19] = "q19";
        estados[20] = "q20";
        estados[21] = "q21";
        estados[22] = "q22";
        estados[23] = "q23";
        estados[24] = "q24";
        estados[25] = "q25";
        estados[26] = "q26";
        estados[27] = "q27";
        estados[28] = "q28";
        estados[29] = "q29";
        estados[30] = "q30";
        estados[31] = "q31";
        estados[32] = "q32";
        estados[33] = "q33";
        estados[34] = "q34";
        estados[35] = "q35";
        estados[36] = "q36";
        estados[37] = "q37";
        estados[38] = "q38";
        estados[39] = "q39";
        estados[40] = "q40";
        estados[41] = "q41";
        estados[42] = "q42";
        estados[43] = "q43";
        estados[44] = "q44";
        estados[45] = "q45";
        estados[46] = "q46";
        estados[47] = "q47";
        estados[48] = "q48";
        estados[49] = "q49";
        estados[50] = "q50";
        estados[51] = "q51";
        estados[52] = "q52";
        estados[53] = "q53";

        String estado_inicial = "q0";
        String[] estados_finais = new String[1];
        estados_finais[0] = "q53";

        int[][] matriz = new int[54][12];

        // ===== TRANSIÇÕES MANUAIS COM PONTOS E ESPAÇOS =====
        // transições de q0
        matriz[0][get_char_ref(alfabeto,'0')] = 1;
        matriz[0][get_char_ref(alfabeto,'1')] = 1;
        matriz[0][get_char_ref(alfabeto,'2')] = 1;
        matriz[0][get_char_ref(alfabeto,'3')] = 1;
        matriz[0][get_char_ref(alfabeto,'4')] = 1;
        matriz[0][get_char_ref(alfabeto,'5')] = 1;
        matriz[0][get_char_ref(alfabeto,'6')] = 1;
        matriz[0][get_char_ref(alfabeto,'7')] = 1;
        matriz[0][get_char_ref(alfabeto,'8')] = 1;
        matriz[0][get_char_ref(alfabeto,'9')] = 1;
        // transições de q1
        matriz[1][get_char_ref(alfabeto,'0')] = 2;
        matriz[1][get_char_ref(alfabeto,'1')] = 2;
        matriz[1][get_char_ref(alfabeto,'2')] = 2;
        matriz[1][get_char_ref(alfabeto,'3')] = 2;
        matriz[1][get_char_ref(alfabeto,'4')] = 2;
        matriz[1][get_char_ref(alfabeto,'5')] = 2;
        matriz[1][get_char_ref(alfabeto,'6')] = 2;
        matriz[1][get_char_ref(alfabeto,'7')] = 2;
        matriz[1][get_char_ref(alfabeto,'8')] = 2;
        matriz[1][get_char_ref(alfabeto,'9')] = 2;
        // transições de q2
        matriz[2][get_char_ref(alfabeto,'0')] = 3;
        matriz[2][get_char_ref(alfabeto,'1')] = 3;
        matriz[2][get_char_ref(alfabeto,'2')] = 3;
        matriz[2][get_char_ref(alfabeto,'3')] = 3;
        matriz[2][get_char_ref(alfabeto,'4')] = 3;
        matriz[2][get_char_ref(alfabeto,'5')] = 3;
        matriz[2][get_char_ref(alfabeto,'6')] = 3;
        matriz[2][get_char_ref(alfabeto,'7')] = 3;
        matriz[2][get_char_ref(alfabeto,'8')] = 3;
        matriz[2][get_char_ref(alfabeto,'9')] = 3;
        // transições de q3
        matriz[3][get_char_ref(alfabeto,'0')] = 4;
        matriz[3][get_char_ref(alfabeto,'1')] = 4;
        matriz[3][get_char_ref(alfabeto,'2')] = 4;
        matriz[3][get_char_ref(alfabeto,'3')] = 4;
        matriz[3][get_char_ref(alfabeto,'4')] = 4;
        matriz[3][get_char_ref(alfabeto,'5')] = 4;
        matriz[3][get_char_ref(alfabeto,'6')] = 4;
        matriz[3][get_char_ref(alfabeto,'7')] = 4;
        matriz[3][get_char_ref(alfabeto,'8')] = 4;
        matriz[3][get_char_ref(alfabeto,'9')] = 4;
        // transições de q4
        matriz[4][get_char_ref(alfabeto,'0')] = 5;
        matriz[4][get_char_ref(alfabeto,'1')] = 5;
        matriz[4][get_char_ref(alfabeto,'2')] = 5;
        matriz[4][get_char_ref(alfabeto,'3')] = 5;
        matriz[4][get_char_ref(alfabeto,'4')] = 5;
        matriz[4][get_char_ref(alfabeto,'5')] = 5;
        matriz[4][get_char_ref(alfabeto,'6')] = 5;
        matriz[4][get_char_ref(alfabeto,'7')] = 5;
        matriz[4][get_char_ref(alfabeto,'8')] = 5;
        matriz[4][get_char_ref(alfabeto,'9')] = 5;
        // transições de q5
        matriz[5][get_char_ref(alfabeto,'.')] = 6; // ponto válido
        // transições de q6
        matriz[6][get_char_ref(alfabeto,'0')] = 7;
        matriz[6][get_char_ref(alfabeto,'1')] = 7;
        matriz[6][get_char_ref(alfabeto,'2')] = 7;
        matriz[6][get_char_ref(alfabeto,'3')] = 7;
        matriz[6][get_char_ref(alfabeto,'4')] = 7;
        matriz[6][get_char_ref(alfabeto,'5')] = 7;
        matriz[6][get_char_ref(alfabeto,'6')] = 7;
        matriz[6][get_char_ref(alfabeto,'7')] = 7;
        matriz[6][get_char_ref(alfabeto,'8')] = 7;
        matriz[6][get_char_ref(alfabeto,'9')] = 7;
        // transições de q7
        matriz[7][get_char_ref(alfabeto,'0')] = 8;
        matriz[7][get_char_ref(alfabeto,'1')] = 8;
        matriz[7][get_char_ref(alfabeto,'2')] = 8;
        matriz[7][get_char_ref(alfabeto,'3')] = 8;
        matriz[7][get_char_ref(alfabeto,'4')] = 8;
        matriz[7][get_char_ref(alfabeto,'5')] = 8;
        matriz[7][get_char_ref(alfabeto,'6')] = 8;
        matriz[7][get_char_ref(alfabeto,'7')] = 8;
        matriz[7][get_char_ref(alfabeto,'8')] = 8;
        matriz[7][get_char_ref(alfabeto,'9')] = 8;
        // transições de q8
        matriz[8][get_char_ref(alfabeto,'0')] = 9;
        matriz[8][get_char_ref(alfabeto,'1')] = 9;
        matriz[8][get_char_ref(alfabeto,'2')] = 9;
        matriz[8][get_char_ref(alfabeto,'3')] = 9;
        matriz[8][get_char_ref(alfabeto,'4')] = 9;
        matriz[8][get_char_ref(alfabeto,'5')] = 9;
        matriz[8][get_char_ref(alfabeto,'6')] = 9;
        matriz[8][get_char_ref(alfabeto,'7')] = 9;
        matriz[8][get_char_ref(alfabeto,'8')] = 9;
        matriz[8][get_char_ref(alfabeto,'9')] = 9;
        // transições de q9
        matriz[9][get_char_ref(alfabeto,'0')] = 10;
        matriz[9][get_char_ref(alfabeto,'1')] = 10;
        matriz[9][get_char_ref(alfabeto,'2')] = 10;
        matriz[9][get_char_ref(alfabeto,'3')] = 10;
        matriz[9][get_char_ref(alfabeto,'4')] = 10;
        matriz[9][get_char_ref(alfabeto,'5')] = 10;
        matriz[9][get_char_ref(alfabeto,'6')] = 10;
        matriz[9][get_char_ref(alfabeto,'7')] = 10;
        matriz[9][get_char_ref(alfabeto,'8')] = 10;
        matriz[9][get_char_ref(alfabeto,'9')] = 10;
        // transições de q10
        matriz[10][get_char_ref(alfabeto,'0')] = 11;
        matriz[10][get_char_ref(alfabeto,'1')] = 11;
        matriz[10][get_char_ref(alfabeto,'2')] = 11;
        matriz[10][get_char_ref(alfabeto,'3')] = 11;
        matriz[10][get_char_ref(alfabeto,'4')] = 11;
        matriz[10][get_char_ref(alfabeto,'5')] = 11;
        matriz[10][get_char_ref(alfabeto,'6')] = 11;
        matriz[10][get_char_ref(alfabeto,'7')] = 11;
        matriz[10][get_char_ref(alfabeto,'8')] = 11;
        matriz[10][get_char_ref(alfabeto,'9')] = 11;
        // transições de q11
        matriz[11][get_char_ref(alfabeto,' ')] = 12; // espaço válido
        // transições de q12
        matriz[12][get_char_ref(alfabeto,'0')] = 13;
        matriz[12][get_char_ref(alfabeto,'1')] = 13;
        matriz[12][get_char_ref(alfabeto,'2')] = 13;
        matriz[12][get_char_ref(alfabeto,'3')] = 13;
        matriz[12][get_char_ref(alfabeto,'4')] = 13;
        matriz[12][get_char_ref(alfabeto,'5')] = 13;
        matriz[12][get_char_ref(alfabeto,'6')] = 13;
        matriz[12][get_char_ref(alfabeto,'7')] = 13;
        matriz[12][get_char_ref(alfabeto,'8')] = 13;
        matriz[12][get_char_ref(alfabeto,'9')] = 13;
        // transições de q13
        matriz[13][get_char_ref(alfabeto,'0')] = 14;
        matriz[13][get_char_ref(alfabeto,'1')] = 14;
        matriz[13][get_char_ref(alfabeto,'2')] = 14;
        matriz[13][get_char_ref(alfabeto,'3')] = 14;
        matriz[13][get_char_ref(alfabeto,'4')] = 14;
        matriz[13][get_char_ref(alfabeto,'5')] = 14;
        matriz[13][get_char_ref(alfabeto,'6')] = 14;
        matriz[13][get_char_ref(alfabeto,'7')] = 14;
        matriz[13][get_char_ref(alfabeto,'8')] = 14;
        matriz[13][get_char_ref(alfabeto,'9')] = 14;
        // transições de q14
        matriz[14][get_char_ref(alfabeto,'0')] = 15;
        matriz[14][get_char_ref(alfabeto,'1')] = 15;
        matriz[14][get_char_ref(alfabeto,'2')] = 15;
        matriz[14][get_char_ref(alfabeto,'3')] = 15;
        matriz[14][get_char_ref(alfabeto,'4')] = 15;
        matriz[14][get_char_ref(alfabeto,'5')] = 15;
        matriz[14][get_char_ref(alfabeto,'6')] = 15;
        matriz[14][get_char_ref(alfabeto,'7')] = 15;
        matriz[14][get_char_ref(alfabeto,'8')] = 15;
        matriz[14][get_char_ref(alfabeto,'9')] = 15;
        // transições de q15
        matriz[15][get_char_ref(alfabeto,'0')] = 16;
        matriz[15][get_char_ref(alfabeto,'1')] = 16;
        matriz[15][get_char_ref(alfabeto,'2')] = 16;
        matriz[15][get_char_ref(alfabeto,'3')] = 16;
        matriz[15][get_char_ref(alfabeto,'4')] = 16;
        matriz[15][get_char_ref(alfabeto,'5')] = 16;
        matriz[15][get_char_ref(alfabeto,'6')] = 16;
        matriz[15][get_char_ref(alfabeto,'7')] = 16;
        matriz[15][get_char_ref(alfabeto,'8')] = 16;
        matriz[15][get_char_ref(alfabeto,'9')] = 16;
        // transições de q16
        matriz[16][get_char_ref(alfabeto,'0')] = 17;
        matriz[16][get_char_ref(alfabeto,'1')] = 17;
        matriz[16][get_char_ref(alfabeto,'2')] = 17;
        matriz[16][get_char_ref(alfabeto,'3')] = 17;
        matriz[16][get_char_ref(alfabeto,'4')] = 17;
        matriz[16][get_char_ref(alfabeto,'5')] = 17;
        matriz[16][get_char_ref(alfabeto,'6')] = 17;
        matriz[16][get_char_ref(alfabeto,'7')] = 17;
        matriz[16][get_char_ref(alfabeto,'8')] = 17;
        matriz[16][get_char_ref(alfabeto,'9')] = 17;
        // transições de q17
        matriz[17][get_char_ref(alfabeto,'.')] = 18; // ponto válido
        // transições de q18
        matriz[18][get_char_ref(alfabeto,'0')] = 19;
        matriz[18][get_char_ref(alfabeto,'1')] = 19;
        matriz[18][get_char_ref(alfabeto,'2')] = 19;
        matriz[18][get_char_ref(alfabeto,'3')] = 19;
        matriz[18][get_char_ref(alfabeto,'4')] = 19;
        matriz[18][get_char_ref(alfabeto,'5')] = 19;
        matriz[18][get_char_ref(alfabeto,'6')] = 19;
        matriz[18][get_char_ref(alfabeto,'7')] = 19;
        matriz[18][get_char_ref(alfabeto,'8')] = 19;
        matriz[18][get_char_ref(alfabeto,'9')] = 19;
        // transições de q19
        matriz[19][get_char_ref(alfabeto,'0')] = 20;
        matriz[19][get_char_ref(alfabeto,'1')] = 20;
        matriz[19][get_char_ref(alfabeto,'2')] = 20;
        matriz[19][get_char_ref(alfabeto,'3')] = 20;
        matriz[19][get_char_ref(alfabeto,'4')] = 20;
        matriz[19][get_char_ref(alfabeto,'5')] = 20;
        matriz[19][get_char_ref(alfabeto,'6')] = 20;
        matriz[19][get_char_ref(alfabeto,'7')] = 20;
        matriz[19][get_char_ref(alfabeto,'8')] = 20;
        matriz[19][get_char_ref(alfabeto,'9')] = 20;
        // transições de q20
        matriz[20][get_char_ref(alfabeto,'0')] = 21;
        matriz[20][get_char_ref(alfabeto,'1')] = 21;
        matriz[20][get_char_ref(alfabeto,'2')] = 21;
        matriz[20][get_char_ref(alfabeto,'3')] = 21;
        matriz[20][get_char_ref(alfabeto,'4')] = 21;
        matriz[20][get_char_ref(alfabeto,'5')] = 21;
        matriz[20][get_char_ref(alfabeto,'6')] = 21;
        matriz[20][get_char_ref(alfabeto,'7')] = 21;
        matriz[20][get_char_ref(alfabeto,'8')] = 21;
        matriz[20][get_char_ref(alfabeto,'9')] = 21;
        // transições de q21
        matriz[21][get_char_ref(alfabeto,'0')] = 22;
        matriz[21][get_char_ref(alfabeto,'1')] = 22;
        matriz[21][get_char_ref(alfabeto,'2')] = 22;
        matriz[21][get_char_ref(alfabeto,'3')] = 22;
        matriz[21][get_char_ref(alfabeto,'4')] = 22;
        matriz[21][get_char_ref(alfabeto,'5')] = 22;
        matriz[21][get_char_ref(alfabeto,'6')] = 22;
        matriz[21][get_char_ref(alfabeto,'7')] = 22;
        matriz[21][get_char_ref(alfabeto,'8')] = 22;
        matriz[21][get_char_ref(alfabeto,'9')] = 22;
        // transições de q22
        matriz[22][get_char_ref(alfabeto,'0')] = 23;
        matriz[22][get_char_ref(alfabeto,'1')] = 23;
        matriz[22][get_char_ref(alfabeto,'2')] = 23;
        matriz[22][get_char_ref(alfabeto,'3')] = 23;
        matriz[22][get_char_ref(alfabeto,'4')] = 23;
        matriz[22][get_char_ref(alfabeto,'5')] = 23;
        matriz[22][get_char_ref(alfabeto,'6')] = 23;
        matriz[22][get_char_ref(alfabeto,'7')] = 23;
        matriz[22][get_char_ref(alfabeto,'8')] = 23;
        matriz[22][get_char_ref(alfabeto,'9')] = 23;
        // transições de q23
        matriz[23][get_char_ref(alfabeto,'0')] = 24;
        matriz[23][get_char_ref(alfabeto,'1')] = 24;
        matriz[23][get_char_ref(alfabeto,'2')] = 24;
        matriz[23][get_char_ref(alfabeto,'3')] = 24;
        matriz[23][get_char_ref(alfabeto,'4')] = 24;
        matriz[23][get_char_ref(alfabeto,'5')] = 24;
        matriz[23][get_char_ref(alfabeto,'6')] = 24;
        matriz[23][get_char_ref(alfabeto,'7')] = 24;
        matriz[23][get_char_ref(alfabeto,'8')] = 24;
        matriz[23][get_char_ref(alfabeto,'9')] = 24;
        // transições de q24
        matriz[24][get_char_ref(alfabeto,' ')] = 25; // espaço válido
        // transições de q25
        matriz[25][get_char_ref(alfabeto,'0')] = 26;
        matriz[25][get_char_ref(alfabeto,'1')] = 26;
        matriz[25][get_char_ref(alfabeto,'2')] = 26;
        matriz[25][get_char_ref(alfabeto,'3')] = 26;
        matriz[25][get_char_ref(alfabeto,'4')] = 26;
        matriz[25][get_char_ref(alfabeto,'5')] = 26;
        matriz[25][get_char_ref(alfabeto,'6')] = 26;
        matriz[25][get_char_ref(alfabeto,'7')] = 26;
        matriz[25][get_char_ref(alfabeto,'8')] = 26;
        matriz[25][get_char_ref(alfabeto,'9')] = 26;
        // transições de q26
        matriz[26][get_char_ref(alfabeto,'0')] = 27;
        matriz[26][get_char_ref(alfabeto,'1')] = 27;
        matriz[26][get_char_ref(alfabeto,'2')] = 27;
        matriz[26][get_char_ref(alfabeto,'3')] = 27;
        matriz[26][get_char_ref(alfabeto,'4')] = 27;
        matriz[26][get_char_ref(alfabeto,'5')] = 27;
        matriz[26][get_char_ref(alfabeto,'6')] = 27;
        matriz[26][get_char_ref(alfabeto,'7')] = 27;
        matriz[26][get_char_ref(alfabeto,'8')] = 27;
        matriz[26][get_char_ref(alfabeto,'9')] = 27;
        // transições de q27
        matriz[27][get_char_ref(alfabeto,'0')] = 28;
        matriz[27][get_char_ref(alfabeto,'1')] = 28;
        matriz[27][get_char_ref(alfabeto,'2')] = 28;
        matriz[27][get_char_ref(alfabeto,'3')] = 28;
        matriz[27][get_char_ref(alfabeto,'4')] = 28;
        matriz[27][get_char_ref(alfabeto,'5')] = 28;
        matriz[27][get_char_ref(alfabeto,'6')] = 28;
        matriz[27][get_char_ref(alfabeto,'7')] = 28;
        matriz[27][get_char_ref(alfabeto,'8')] = 28;
        matriz[27][get_char_ref(alfabeto,'9')] = 28;
        // transições de q28
        matriz[28][get_char_ref(alfabeto,'0')] = 29;
        matriz[28][get_char_ref(alfabeto,'1')] = 29;
        matriz[28][get_char_ref(alfabeto,'2')] = 29;
        matriz[28][get_char_ref(alfabeto,'3')] = 29;
        matriz[28][get_char_ref(alfabeto,'4')] = 29;
        matriz[28][get_char_ref(alfabeto,'5')] = 29;
        matriz[28][get_char_ref(alfabeto,'6')] = 29;
        matriz[28][get_char_ref(alfabeto,'7')] = 29;
        matriz[28][get_char_ref(alfabeto,'8')] = 29;
        matriz[28][get_char_ref(alfabeto,'9')] = 29;
        // transições de q29
        matriz[29][get_char_ref(alfabeto,'0')] = 30;
        matriz[29][get_char_ref(alfabeto,'1')] = 30;
        matriz[29][get_char_ref(alfabeto,'2')] = 30;
        matriz[29][get_char_ref(alfabeto,'3')] = 30;
        matriz[29][get_char_ref(alfabeto,'4')] = 30;
        matriz[29][get_char_ref(alfabeto,'5')] = 30;
        matriz[29][get_char_ref(alfabeto,'6')] = 30;
        matriz[29][get_char_ref(alfabeto,'7')] = 30;
        matriz[29][get_char_ref(alfabeto,'8')] = 30;
        matriz[29][get_char_ref(alfabeto,'9')] = 30;
        // transições de q30
        matriz[30][get_char_ref(alfabeto,'.')] = 31; // ponto válido
        // transições de q31
        matriz[31][get_char_ref(alfabeto,'0')] = 32;
        matriz[31][get_char_ref(alfabeto,'1')] = 32;
        matriz[31][get_char_ref(alfabeto,'2')] = 32;
        matriz[31][get_char_ref(alfabeto,'3')] = 32;
        matriz[31][get_char_ref(alfabeto,'4')] = 32;
        matriz[31][get_char_ref(alfabeto,'5')] = 32;
        matriz[31][get_char_ref(alfabeto,'6')] = 32;
        matriz[31][get_char_ref(alfabeto,'7')] = 32;
        matriz[31][get_char_ref(alfabeto,'8')] = 32;
        matriz[31][get_char_ref(alfabeto,'9')] = 32;
        // transições de q32
        matriz[32][get_char_ref(alfabeto,'0')] = 33;
        matriz[32][get_char_ref(alfabeto,'1')] = 33;
        matriz[32][get_char_ref(alfabeto,'2')] = 33;
        matriz[32][get_char_ref(alfabeto,'3')] = 33;
        matriz[32][get_char_ref(alfabeto,'4')] = 33;
        matriz[32][get_char_ref(alfabeto,'5')] = 33;
        matriz[32][get_char_ref(alfabeto,'6')] = 33;
        matriz[32][get_char_ref(alfabeto,'7')] = 33;
        matriz[32][get_char_ref(alfabeto,'8')] = 33;
        matriz[32][get_char_ref(alfabeto,'9')] = 33;
        // transições de q33
        matriz[33][get_char_ref(alfabeto,'0')] = 34;
        matriz[33][get_char_ref(alfabeto,'1')] = 34;
        matriz[33][get_char_ref(alfabeto,'2')] = 34;
        matriz[33][get_char_ref(alfabeto,'3')] = 34;
        matriz[33][get_char_ref(alfabeto,'4')] = 34;
        matriz[33][get_char_ref(alfabeto,'5')] = 34;
        matriz[33][get_char_ref(alfabeto,'6')] = 34;
        matriz[33][get_char_ref(alfabeto,'7')] = 34;
        matriz[33][get_char_ref(alfabeto,'8')] = 34;
        matriz[33][get_char_ref(alfabeto,'9')] = 34;
        // transições de q34
        matriz[34][get_char_ref(alfabeto,'0')] = 35;
        matriz[34][get_char_ref(alfabeto,'1')] = 35;
        matriz[34][get_char_ref(alfabeto,'2')] = 35;
        matriz[34][get_char_ref(alfabeto,'3')] = 35;
        matriz[34][get_char_ref(alfabeto,'4')] = 35;
        matriz[34][get_char_ref(alfabeto,'5')] = 35;
        matriz[34][get_char_ref(alfabeto,'6')] = 35;
        matriz[34][get_char_ref(alfabeto,'7')] = 35;
        matriz[34][get_char_ref(alfabeto,'8')] = 35;
        matriz[34][get_char_ref(alfabeto,'9')] = 35;
        // transições de q35
        matriz[35][get_char_ref(alfabeto,'0')] = 36;
        matriz[35][get_char_ref(alfabeto,'1')] = 36;
        matriz[35][get_char_ref(alfabeto,'2')] = 36;
        matriz[35][get_char_ref(alfabeto,'3')] = 36;
        matriz[35][get_char_ref(alfabeto,'4')] = 36;
        matriz[35][get_char_ref(alfabeto,'5')] = 36;
        matriz[35][get_char_ref(alfabeto,'6')] = 36;
        matriz[35][get_char_ref(alfabeto,'7')] = 36;
        matriz[35][get_char_ref(alfabeto,'8')] = 36;
        matriz[35][get_char_ref(alfabeto,'9')] = 36;
        // transições de q36
        matriz[36][get_char_ref(alfabeto,'0')] = 37;
        matriz[36][get_char_ref(alfabeto,'1')] = 37;
        matriz[36][get_char_ref(alfabeto,'2')] = 37;
        matriz[36][get_char_ref(alfabeto,'3')] = 37;
        matriz[36][get_char_ref(alfabeto,'4')] = 37;
        matriz[36][get_char_ref(alfabeto,'5')] = 37;
        matriz[36][get_char_ref(alfabeto,'6')] = 37;
        matriz[36][get_char_ref(alfabeto,'7')] = 37;
        matriz[36][get_char_ref(alfabeto,'8')] = 37;
        matriz[36][get_char_ref(alfabeto,'9')] = 37;
        // transições de q37
        matriz[37][get_char_ref(alfabeto,' ')] = 38; // espaço válido
        // transições de q38
        matriz[38][get_char_ref(alfabeto,'0')] = 39;
        matriz[38][get_char_ref(alfabeto,'1')] = 39;
        matriz[38][get_char_ref(alfabeto,'2')] = 39;
        matriz[38][get_char_ref(alfabeto,'3')] = 39;
        matriz[38][get_char_ref(alfabeto,'4')] = 39;
        matriz[38][get_char_ref(alfabeto,'5')] = 39;
        matriz[38][get_char_ref(alfabeto,'6')] = 39;
        matriz[38][get_char_ref(alfabeto,'7')] = 39;
        matriz[38][get_char_ref(alfabeto,'8')] = 39;
        matriz[38][get_char_ref(alfabeto,'9')] = 39;
        // transições de q39
        matriz[39][get_char_ref(alfabeto,' ')] = 40; // espaço válido
        // transições de q40
        matriz[40][get_char_ref(alfabeto,'0')] = 41;
        matriz[40][get_char_ref(alfabeto,'1')] = 41;
        matriz[40][get_char_ref(alfabeto,'2')] = 41;
        matriz[40][get_char_ref(alfabeto,'3')] = 41;
        matriz[40][get_char_ref(alfabeto,'4')] = 41;
        matriz[40][get_char_ref(alfabeto,'5')] = 41;
        matriz[40][get_char_ref(alfabeto,'6')] = 41;
        matriz[40][get_char_ref(alfabeto,'7')] = 41;
        matriz[40][get_char_ref(alfabeto,'8')] = 41;
        matriz[40][get_char_ref(alfabeto,'9')] = 41;
        // transições de q41
        matriz[41][get_char_ref(alfabeto,'0')] = 42;
        matriz[41][get_char_ref(alfabeto,'1')] = 42;
        matriz[41][get_char_ref(alfabeto,'2')] = 42;
        matriz[41][get_char_ref(alfabeto,'3')] = 42;
        matriz[41][get_char_ref(alfabeto,'4')] = 42;
        matriz[41][get_char_ref(alfabeto,'5')] = 42;
        matriz[41][get_char_ref(alfabeto,'6')] = 42;
        matriz[41][get_char_ref(alfabeto,'7')] = 42;
        matriz[41][get_char_ref(alfabeto,'8')] = 42;
        matriz[41][get_char_ref(alfabeto,'9')] = 42;
        // transições de q42
        matriz[42][get_char_ref(alfabeto,'0')] = 43;
        matriz[42][get_char_ref(alfabeto,'1')] = 43;
        matriz[42][get_char_ref(alfabeto,'2')] = 43;
        matriz[42][get_char_ref(alfabeto,'3')] = 43;
        matriz[42][get_char_ref(alfabeto,'4')] = 43;
        matriz[42][get_char_ref(alfabeto,'5')] = 43;
        matriz[42][get_char_ref(alfabeto,'6')] = 43;
        matriz[42][get_char_ref(alfabeto,'7')] = 43;
        matriz[42][get_char_ref(alfabeto,'8')] = 43;
        matriz[42][get_char_ref(alfabeto,'9')] = 43;
        // transições de q43
        matriz[43][get_char_ref(alfabeto,'0')] = 44;
        matriz[43][get_char_ref(alfabeto,'1')] = 44;
        matriz[43][get_char_ref(alfabeto,'2')] = 44;
        matriz[43][get_char_ref(alfabeto,'3')] = 44;
        matriz[43][get_char_ref(alfabeto,'4')] = 44;
        matriz[43][get_char_ref(alfabeto,'5')] = 44;
        matriz[43][get_char_ref(alfabeto,'6')] = 44;
        matriz[43][get_char_ref(alfabeto,'7')] = 44;
        matriz[43][get_char_ref(alfabeto,'8')] = 44;
        matriz[43][get_char_ref(alfabeto,'9')] = 44;
        // transições de q44
        matriz[44][get_char_ref(alfabeto,'0')] = 45;
        matriz[44][get_char_ref(alfabeto,'1')] = 45;
        matriz[44][get_char_ref(alfabeto,'2')] = 45;
        matriz[44][get_char_ref(alfabeto,'3')] = 45;
        matriz[44][get_char_ref(alfabeto,'4')] = 45;
        matriz[44][get_char_ref(alfabeto,'5')] = 45;
        matriz[44][get_char_ref(alfabeto,'6')] = 45;
        matriz[44][get_char_ref(alfabeto,'7')] = 45;
        matriz[44][get_char_ref(alfabeto,'8')] = 45;
        matriz[44][get_char_ref(alfabeto,'9')] = 45;
        // transições de q45
        matriz[45][get_char_ref(alfabeto,'0')] = 46;
        matriz[45][get_char_ref(alfabeto,'1')] = 46;
        matriz[45][get_char_ref(alfabeto,'2')] = 46;
        matriz[45][get_char_ref(alfabeto,'3')] = 46;
        matriz[45][get_char_ref(alfabeto,'4')] = 46;
        matriz[45][get_char_ref(alfabeto,'5')] = 46;
        matriz[45][get_char_ref(alfabeto,'6')] = 46;
        matriz[45][get_char_ref(alfabeto,'7')] = 46;
        matriz[45][get_char_ref(alfabeto,'8')] = 46;
        matriz[45][get_char_ref(alfabeto,'9')] = 46;
        // transições de q46
        matriz[46][get_char_ref(alfabeto,'0')] = 47;
        matriz[46][get_char_ref(alfabeto,'1')] = 47;
        matriz[46][get_char_ref(alfabeto,'2')] = 47;
        matriz[46][get_char_ref(alfabeto,'3')] = 47;
        matriz[46][get_char_ref(alfabeto,'4')] = 47;
        matriz[46][get_char_ref(alfabeto,'5')] = 47;
        matriz[46][get_char_ref(alfabeto,'6')] = 47;
        matriz[46][get_char_ref(alfabeto,'7')] = 47;
        matriz[46][get_char_ref(alfabeto,'8')] = 47;
        matriz[46][get_char_ref(alfabeto,'9')] = 47;
        // transições de q47
        matriz[47][get_char_ref(alfabeto,'0')] = 48;
        matriz[47][get_char_ref(alfabeto,'1')] = 48;
        matriz[47][get_char_ref(alfabeto,'2')] = 48;
        matriz[47][get_char_ref(alfabeto,'3')] = 48;
        matriz[47][get_char_ref(alfabeto,'4')] = 48;
        matriz[47][get_char_ref(alfabeto,'5')] = 48;
        matriz[47][get_char_ref(alfabeto,'6')] = 48;
        matriz[47][get_char_ref(alfabeto,'7')] = 48;
        matriz[47][get_char_ref(alfabeto,'8')] = 48;
        matriz[47][get_char_ref(alfabeto,'9')] = 48;
        // transições de q48
        matriz[48][get_char_ref(alfabeto,'0')] = 49;
        matriz[48][get_char_ref(alfabeto,'1')] = 49;
        matriz[48][get_char_ref(alfabeto,'2')] = 49;
        matriz[48][get_char_ref(alfabeto,'3')] = 49;
        matriz[48][get_char_ref(alfabeto,'4')] = 49;
        matriz[48][get_char_ref(alfabeto,'5')] = 49;
        matriz[48][get_char_ref(alfabeto,'6')] = 49;
        matriz[48][get_char_ref(alfabeto,'7')] = 49;
        matriz[48][get_char_ref(alfabeto,'8')] = 49;
        matriz[48][get_char_ref(alfabeto,'9')] = 49;
        // transições de q49
        matriz[49][get_char_ref(alfabeto,'0')] = 50;
        matriz[49][get_char_ref(alfabeto,'1')] = 50;
        matriz[49][get_char_ref(alfabeto,'2')] = 50;
        matriz[49][get_char_ref(alfabeto,'3')] = 50;
        matriz[49][get_char_ref(alfabeto,'4')] = 50;
        matriz[49][get_char_ref(alfabeto,'5')] = 50;
        matriz[49][get_char_ref(alfabeto,'6')] = 50;
        matriz[49][get_char_ref(alfabeto,'7')] = 50;
        matriz[49][get_char_ref(alfabeto,'8')] = 50;
        matriz[49][get_char_ref(alfabeto,'9')] = 50;
        // transições de q50
        matriz[50][get_char_ref(alfabeto,'0')] = 51;
        matriz[50][get_char_ref(alfabeto,'1')] = 51;
        matriz[50][get_char_ref(alfabeto,'2')] = 51;
        matriz[50][get_char_ref(alfabeto,'3')] = 51;
        matriz[50][get_char_ref(alfabeto,'4')] = 51;
        matriz[50][get_char_ref(alfabeto,'5')] = 51;
        matriz[50][get_char_ref(alfabeto,'6')] = 51;
        matriz[50][get_char_ref(alfabeto,'7')] = 51;
        matriz[50][get_char_ref(alfabeto,'8')] = 51;
        matriz[50][get_char_ref(alfabeto,'9')] = 51;
        // transições de q51
        matriz[51][get_char_ref(alfabeto,'0')] = 52;
        matriz[51][get_char_ref(alfabeto,'1')] = 52;
        matriz[51][get_char_ref(alfabeto,'2')] = 52;
        matriz[51][get_char_ref(alfabeto,'3')] = 52;
        matriz[51][get_char_ref(alfabeto,'4')] = 52;
        matriz[51][get_char_ref(alfabeto,'5')] = 52;
        matriz[51][get_char_ref(alfabeto,'6')] = 52;
        matriz[51][get_char_ref(alfabeto,'7')] = 52;
        matriz[51][get_char_ref(alfabeto,'8')] = 52;
        matriz[51][get_char_ref(alfabeto,'9')] = 52;
        // transições de q52
        matriz[52][get_char_ref(alfabeto,'0')] = 53;
        matriz[52][get_char_ref(alfabeto,'1')] = 53;
        matriz[52][get_char_ref(alfabeto,'2')] = 53;
        matriz[52][get_char_ref(alfabeto,'3')] = 53;
        matriz[52][get_char_ref(alfabeto,'4')] = 53;
        matriz[52][get_char_ref(alfabeto,'5')] = 53;
        matriz[52][get_char_ref(alfabeto,'6')] = 53;
        matriz[52][get_char_ref(alfabeto,'7')] = 53;
        matriz[52][get_char_ref(alfabeto,'8')] = 53;
        matriz[52][get_char_ref(alfabeto,'9')] = 53;
        // transições de q53
        matriz[53][get_char_ref(alfabeto,'0')] = -1;
        matriz[53][get_char_ref(alfabeto,'1')] = -1;
        matriz[53][get_char_ref(alfabeto,'2')] = -1;
        matriz[53][get_char_ref(alfabeto,'3')] = -1;
        matriz[53][get_char_ref(alfabeto,'4')] = -1;
        matriz[53][get_char_ref(alfabeto,'5')] = -1;
        matriz[53][get_char_ref(alfabeto,'6')] = -1;
        matriz[53][get_char_ref(alfabeto,'7')] = -1;
        matriz[53][get_char_ref(alfabeto,'8')] = -1;
        matriz[53][get_char_ref(alfabeto,'9')] = -1;

        // ===== FIM DAS TRANSIÇÕES =====

        int estado = get_string_ref(estados,estado_inicial);
        int estado_anterior = -1;
        ArrayList<String> palavras_reconhecidas = new ArrayList();
        String palavra = "";

        for (int i=0;i<codigoHTML.length();i++){
            estado_anterior = estado;
            estado = proximo_estado(alfabeto,matriz,estado,codigoHTML.charAt(i));
            if (estado==-1){
                estado = get_string_ref(estados,estado_inicial);
                if (get_string_ref(estados_finais,estados[estado_anterior])!=-1){
                    if (!palavra.equals("")) palavras_reconhecidas.add(palavra);
                    i--;
                }
                palavra="";
            }else{
                palavra+=codigoHTML.charAt(i);
            }
        }

        for(String p: palavras_reconhecidas){
            System.out.println(p);
        }
    }
}
