package estruturaDeDados;

public class Lista {
    public class No {
        private int V;
        private No prox;

        public No(int V){
            this.V = V;
            this.prox = null;
        }

        public void setProx(No prox) {
            this.prox = prox;
        }

        public No getProx() {
            return prox;
        }

        public int getV() {
            return V;
        }

        public void setV(int v) {
            V = v;
        }
    }

    private No cabeca;

    public Lista() {
        this.cabeca = null;
    }

    public void insereInicio(int i) {
        No novoNo = new No(i);     // Cria um novo nó com o valor fornecido
        novoNo.setProx(cabeca);    // Aponta o novo nó para a antiga cabeça
        cabeca = novoNo;           // Atualiza a cabeça para o novo nó
    }

    public boolean buscaElemento(int i) {
        No atual = cabeca;

        while(atual != null) {

            if (atual.getV() == i) {
                return true;  // Retorna true se o valor for encontrado
            }
            atual = atual.getProx();

        }
        return false;
    }

    public Object buscaIndice(int i) {
     No atual = cabeca;
     int indice = 0;

     while(atual != null){
         if(atual.getV() == i) {
             return indice;
         }
         atual = atual.getProx();
         indice ++;
     }
     return null;
    }

    public void insereFim(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereFim'");
    }

    public void removeInicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeInicio'");
    }

    public void removeFim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFim'");
    }

    public void removeIndice(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeIndice'");
    }

    public void insereElementoPosicao(int i, int j) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereElementoPosicao'");
    }
    
}
