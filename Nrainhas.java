import java.util.Stack;

public class Nrainhas{
    int size = 0;
    Stack<String> pilha = new Stack<String>();
    

    public Stack<String> positionQueens(int size){
        int[][] board = new int[size][size];
//primeira posição que ela pode ficar
        for (int i=0; i < size; i++){
            //posicao atual
            for (int j=0; j < size; j++){
                if (verificaLinha(board, i, size) && verificaColuna(board, j, size) 
                && verificaDiagonais(board, j, i, size)){
                   // pilha.add(i,j) to String
                   //continue?
                }
            }
            // if posicao atual add na stack
            // if ! posicao atual => pega ultima posicao da stack i = pos e j = pos
        }
        //check if stack has something, else return no position available

    }
    public boolean verificaLinha(int[][] board1, int linha, int size){
        for (int j =0; j < size; j++){
            if(board1[linha][j] != 0){
                return false;
            }
        }
        return true;
    }
    public boolean verificaColuna(int[][] board1, int coluna, int size){
        for (int j =0; j < size; j++){
            if(board1[j][coluna] != 0){
                return false;
            }
        }
        return true;
    }

    public boolean verificaDiagonais(int[][] board1, int coluna, int linha, int size){
        return verificaDiagonalDirInf(board1, coluna, linha, size) && 
        verificaDiagonalDirSup(board1, coluna, linha, size) &&
        verificaDiagonalEsqInf(board1, coluna, linha, size) &&
        verificaDiagonalEsqSup(board1, coluna, linha, size);
    }

    public boolean verificaDiagonalEsqSup(int[][] board1, int coluna, int linha, int size){
        if(linha > 0 && coluna > 0){
            for (int j = 1; j < size; j++){
                if(board1[linha-j][coluna-j] != 0){
                    return false;
                }
                if(linha-j == 0 || coluna-j == 0) {
                    return true;
                }
            }

        }
        return true;
    }

    public boolean verificaDiagonalEsqInf(int[][] board1, int coluna, int linha, int size){
        if(linha < size && coluna > 0){
            for (int j = 1; j < size; j++){
                if(board1[linha-j][coluna+j] != 0){
                    return false;
                }
                if(linha-j == 0 || coluna+j == 0) {
                    return true;
                }
            }

        }
        return true;
    }

    public boolean verificaDiagonalDirSup(int[][] board1, int coluna, int linha, int size){
        if(linha > 0 && coluna < size){
            for (int j = 1; j < size; j++){
                if(board1[linha+j][coluna+j] != 0){
                    return false;
                }
                if(linha+j == 0 || coluna+j == 0) {
                    return true;
                }
            }

        }
        return true;
    }
    public boolean verificaDiagonalDirInf(int[][] board1, int coluna, int linha, int size){
        if(linha < size && coluna < size){
            for (int j = 1; j < size; j++){
                if(board1[linha+j][coluna-j] != 0){
                    return false;
                }
                if(linha+j == 0 || coluna-j == 0) {
                    return true;
                }
            }

        }
        return true;
    }
}