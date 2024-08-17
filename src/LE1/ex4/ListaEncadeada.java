package LE1.ex4;

public class ListaEncadeada {

    private class Node{

        public DadosAluno data;
        public Node link;
    }

    private Node head;

    public void createList(){
        head = new Node();
        head.link = null;
    }

    public void insertionBegin(int id, double cr){
        Node newNode = new Node();
        newNode.data = new DadosAluno(cr,id);

        if(head.link == null){
            head.link = newNode;
            newNode.link = null;
        }
        else {
            Node temp = head.link;
            head.link = newNode;
            newNode.link = temp;
        }
    }

    public void insertinFinal(int id, double cr){

        Node newNode = new Node();
        newNode.data = new DadosAluno(cr,id);
        Node temp = head;
        while (temp.link != null){
            temp = temp.link;
        }
        temp.link = newNode;
        newNode.link = null;
    }

   public void showList(){
        Node temp = head.link;
        int count = 0;
        if(head.link == null){
            System.out.print("Lista vazia");
        }
        else{
            while (temp != null){
                count++;
                System.out.println("Aluno " + count + "\n");
                System.out.print("ID: " + temp.data.getId() + "\t");
                System.out.print("CR: "+temp.data.getCr() + "\n");
                temp = temp.link;
            }
        }
   }
}
