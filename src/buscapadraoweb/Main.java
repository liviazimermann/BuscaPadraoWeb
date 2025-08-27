/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package buscapadraoweb;

import buscaweb.CapturaRecursosWeb;
import java.util.ArrayList;

/**
 *
 * @author Santiago
 */
public class Main {

    // busca char em vetor e retorna indice
    public static int get_char_ref (char[] vet, char ref ){
        for (int i=0; i<vet.length; i++ ){
            if (vet[i] == ref){
                return i;
            }
        }
        return -1;
    }

    // busca string em vetor e retorna indice
    public static int get_string_ref (String[] vet, String ref ){
        for (int i=0; i<vet.length; i++ ){
            if (vet[i].equals(ref)){
                return i;
            }
        }
        return -1;
    }

    //retorna o próximo estado, dado o estado atual e o símbolo lido
    public static int proximo_estado(char[] alfabeto, int[][] matriz,int estado_atual,char simbolo){
        int simbol_indice = get_char_ref(alfabeto, simbolo);
        if (simbol_indice != -1){
            return matriz[estado_atual][simbol_indice];
        }else{
            return -1;
        }
    }

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //instancia e usa objeto que captura código-fonte de páginas Web
        CapturaRecursosWeb crw = new CapturaRecursosWeb();
        crw.getListaRecursos().add("https://www.boletobancario-codigodebarras.com/2016/04/linha-digitavel.html");
        ArrayList<String> listaCodigos = crw.carregarRecursos();

        String codigoHTML = listaCodigos.get(0);

        //mapa do alfabeto (dígitos 0–9)
        char[] alfabeto = new char[10];
        alfabeto[0] = '0';
        alfabeto[1] = '1';
        alfabeto[2] = '2';
        alfabeto[3] = '3';
        alfabeto[4] = '4';
        alfabeto[5] = '5';
        alfabeto[6] = '6';
        alfabeto[7] = '7';
        alfabeto[8] = '8';
        alfabeto[9] = '9';

        //mapa de estados (q0 até q48)
        String[] estados = new String[49];
        for (int i = 0; i <= 48; i++) {
            estados[i] = "q" + i;
        }

        String estado_inicial = "q0";

        //estados finais (linhas digitáveis: 47 ou 48 dígitos)
        String[] estados_finais = new String[2];
        estados_finais[0] = "q47"; // boleto bancário
        estados_finais[1] = "q48"; // concessionária

        //tabela de transição do AFD
        int[][] matriz = new int[49][10];
        // para cada estado qi (0 <= i < 48), lendo qualquer dígito vai para qi+1
        for (int i = 0; i < 48; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = i + 1;
            }
        }
        // q48 é final, não tem saída (rejeita)
        for (int j = 0; j < 10; j++) {
            matriz[48][j] = -1;
        }

        int estado = get_string_ref (estados, estado_inicial);
        int estado_anterior = -1;
        ArrayList<String> palavras_reconhecidas = new ArrayList();

        String palavra = "";

        //varre o código-fonte
        for (int i=0; i<codigoHTML.length(); i++){
            estado_anterior = estado;
            estado = proximo_estado(alfabeto, matriz, estado, codigoHTML.charAt(i));

            //se não há transição
            if (estado == -1){
                //pega estado inicial
                estado = get_string_ref(estados, estado_inicial);
                // se o estado anterior foi um estado final
                if (get_string_ref(estados_finais, estados[estado_anterior]) != -1){
                    //se a palavra não é vazia adiciona palavra reconhecida
                    if ( ! palavra.equals("")){
                        palavras_reconhecidas.add(palavra);
                    }
                    // se ao analisar este caracter não houve transição
                    // teste-o novamente, considerando que o estado seja inicial
                    i--;
                }
                //zera palavra
                palavra = "";
            }else{
                //se houver transição válida, adiciona caracter a palavra
                palavra += codigoHTML.charAt(i);
            }
        }

        //foreach no Java para exibir todas as palavras reconhecidas
        for (String p: palavras_reconhecidas){
            System.out.println (p);
        }
    }
}
