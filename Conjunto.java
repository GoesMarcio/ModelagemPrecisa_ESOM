package conjunto;

import java.util.ArrayList;

public class Conjunto{
	public ArrayList<Integer> conj;

    public Conjunto(){
        conj = new ArrayList<Integer>();
    }

    //@invariant size()>=0;
    public int size(){
        return conj.size();
    }

    //@requires !conj.contains(e);
    //@ensures conj.contains(e);
    public boolean addElemento(int e){
        if(!contains(e)){
            conj.add(e);
            return true;
        }
 
        return false;
    }

    //@requires conj.contains(e);
    //@ensures !conj.contains(e);
    public boolean removeElemento(int e){
        if(contains(e)){
            for(int i = 0; i<size(); i++){
                if(e == conj.get(i)){
                	conj.remove(i);
                	return true;
                }
            }
        }
        return false;
    }

    public int somaConjunto(){
        int res = 0;
        for(int i = 0; i<size(); i++){
            res += conj.get(i);
        }

        return res;
    }

    //@requires size()>0;
    //@ensures \result == (\sum int i; 0 <= i && i < size(); conj.get(i))/size();
    public double calculaMedia(){
        return somaConjunto()*1.0/size();
    }

    public  boolean contains(int e){
        for(int i = 0; i<size(); i++){
            if(e == conj.get(i)) return true;
        }
        return false;
    }
}