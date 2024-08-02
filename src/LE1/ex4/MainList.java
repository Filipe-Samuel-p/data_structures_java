package LE1.ex4;

public class MainList {

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

       lista.createList();
       lista.insertionBegin(1010, 9.0);
       lista.insertionBegin(1022, 2.7);
       lista.insertionBegin(3018, 6.8);
       lista.insertinFinal(1722, 8.9);
       lista.insertinFinal(1639, 7.8);
       lista.insertinFinal(1682, 9.8);
       lista.showList();

    }
}
