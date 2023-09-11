package sp.fateczl.lucas.PilhaInt;

public class PilhaInt {
	    No topo;
	    
	    public PilhaInt() {
	        this.topo = null;
	    }
	    
	    public boolean isEmpty() {
	        return this.topo == null;
	    }
	    
	    public void push(final int e) {
	        final No elemento = new No();
	        elemento.dado = e;
	        if (this.isEmpty()) {
	            this.topo = elemento;
	        }
	        else {
	            elemento.proximo = this.topo;
	            this.topo = elemento;
	        }
	    }
	    
	    public int pop() throws Exception {
	        if (this.isEmpty()) {
	            throw new Exception("Não há elementos para desempilhar");
	        }
	        final int valor = this.topo.dado;
	        this.topo = this.topo.proximo;
	        return valor;
	    }
	    
	    public int top() throws Exception {
	        if (this.isEmpty()) {
	            throw new Exception("Não há elementos na pilha");
	        }
	        return this.topo.dado;
	    }
	    
	    public int size() {
	        int count = 0;
	        if (!this.isEmpty()) {
	            No auxiliar;
	            for (auxiliar = this.topo, count = 1; auxiliar.proximo != null; auxiliar = auxiliar.proximo, ++count) {}
	        }
	        return count;
	    }
	}