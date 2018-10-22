package quickcheckconnectivity;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class QuickF {
  
  public static void checkIfConnected(Scanner reader) {
    int tamanhoVetor = Integer.parseInt(reader.next());
    int quantidadePares = Integer.parseInt(reader.next());
    int[] id = new int[tamanhoVetor];
    for(int i = 0; i < tamanhoVetor; i++) id[i] = i; //TODO: create a function
    for(int i = 0; i < quantidadePares; i++) { //TODO: create a function
      int p = Integer.parseInt(reader.next());
      int q = Integer.parseInt(reader.next());
      
      for(int contador = 0; contador < tamanhoVetor; contador++) {
        if(id[contador] == p) {
          id[contador] = id[q];
        }
      }
    }
    System.out.print("Vetor: "); //TODO: create a function
    for(int i = 0; i < tamanhoVetor; i++) {
      System.out.print(id[i] + " ");  
    }
    System.out.println("");
    int vertice1 = Integer.parseInt(reader.next());
    int vertice2 = Integer.parseInt(reader.next());
    if(id[vertice1] == id[vertice2]) { //TODO: create a function
      System.out.println("Os vertices " + vertice1 + " e " + vertice2 + " estão conectados.");
    } else {
      System.out.println("Os vertices " + vertice1 + " e " + vertice2 + " não estão conectados.");
    }
  }
  
  public static void main(String[] args) throws IOException {
    try (
        Scanner reader = new Scanner(new FileReader("src/quickcheckconnectivity/test1"));  
    ){
      checkIfConnected(reader);
    } catch (Exception e) {
      e.printStackTrace();
    }
    try (
        Scanner reader = new Scanner(new FileReader("src/quickcheckconnectivity/test2"));  
    ){
      checkIfConnected(reader);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
