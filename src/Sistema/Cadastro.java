package Sistema;
import java.util.ArrayList;
import java.util.List;

import ClasseAbstrata.Desenvolvedor;
import ClasseAbstrata.Estagiario;
import ClasseAbstrata.Gerente;

public class Cadastro {
    
    private static List<Gerente> listaGerente = new ArrayList<>();
    private static List<Desenvolvedor> listaDesenvolvedor = new ArrayList<>();
    private static List<Estagiario> listaEstagiario = new ArrayList<>();

    public static void cadastrarDesenvolvedor(Desenvolvedor desenvolvedor){
        listaDesenvolvedor.add(desenvolvedor);
    }

    public static void cadastrarGerente (Gerente gerente){
        listaGerente.add(gerente);
    }

    public static void cadastrarEstagiario(Estagiario estagiario){
        listaEstagiario.add(estagiario);
    }

    public static boolean excluirDesenvolvedor(int matricula){
         for (Desenvolvedor temp : listaDesenvolvedor) {
            if(temp.getMatricula() == matricula) {
                listaDesenvolvedor.remove(temp);
                return true;
            }
        }
        return false;
    }
    public static boolean excluirGerente(int matricula){
        for (Gerente temp : listaGerente) {
           if(temp.getMatricula() == matricula) {
               listaGerente.remove(temp);
               return true;
           }
       }
       return false;
   }

   public static boolean excluirEstagiario(int matricula){
    for (Estagiario temp : listaEstagiario) {
       if(temp.getMatricula() == matricula) {
           listaEstagiario.remove(temp);
           return true;
       }
   }
   return false;
}

    public static List<Estagiario> getListaEstagiario() {
        return listaEstagiario;
    }

    public static List<Desenvolvedor> getListaDesenvolvedor() {
        return listaDesenvolvedor;
    }

    public static List<Gerente> getListaGerente() {
        return listaGerente;
    }

    public static Estagiario buscarEstagiario(int matricula){
        for (Estagiario temp : listaEstagiario) {
            if (temp.getMatricula() == matricula){
                return temp;
            }
        }
        return null;
    }

    public static Desenvolvedor buscarDesenvolvedor(int matricula){
        for (Desenvolvedor temp : listaDesenvolvedor) {
            if (temp.getMatricula() == matricula){
                return temp;
            }
        }
        return null;
    }

    public static Gerente buscarGerente(int matricula){
        for (Gerente temp : listaGerente) {
            if (temp.getMatricula() == matricula){
                return temp;
            }
        }
        return null;
    }



}
