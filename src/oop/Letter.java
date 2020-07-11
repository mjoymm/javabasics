package oop;

class Letter implements Printable{

        public void print(){
            System.out.println("Hello");}

        public static void main(String args[]){
            Letter obj = new Letter();
            obj.print();
        }
    }
