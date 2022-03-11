import java.util.LinkedList;

public class tugas2 {
    public static void main(String[] args) {
        LinkedList<String> saya = new LinkedList<String>();
       
        //karakter nama "LUTFI MAULANA "
        saya.add("L");
        saya.add("U");
        saya.add("T");
        saya.add("F");
        saya.add("I");
        saya.add("");
        saya.add("M");
        saya.add("A");
        saya.add("U");
        saya.add("L");
        saya.add("A");
        saya.add("N");
        saya.add("A");
        
        System.out.println("=====================================");
        System.out.println(saya);
        System.out.println("\n");

        saya.add("D");
        saya.add("I");
        saya.add("S");
        saya.add("I");
        saya.add("P");
        saya.add("L");
        saya.add("I");
        saya.add("N");
        System.out.println("List sebelum di tambahkan karakter: " + saya);
        System.out.println("\n");

        //fungsi menyisipkan karakter
        saya.set(0,"B");
        saya.set(5,"A");
        saya.set(2,"I");
        saya.set(10,"K");
        System.out.println("List setelah ditambahkan karakter: " + saya);
        System.out.println("\n");

        //fungsi Remove
        saya.remove(5);
        saya.remove(3);
        saya.remove(7);
        saya.remove(3);
        saya.remove(2);
        saya.remove(8);
        saya.remove(1);
        saya.remove(4);
        System.out.println("List setalah di remove: " + saya);
        System.out.println(" \n");

        //Fungsi push
        saya.push("SEDERHANA");
        saya.push("SETIA");
        saya.push("RAJIN");
        System.out.println("Setelah elemen di push" + saya);
        System.out.println("\n");

        //Fungsi POP
        saya.pop();
        System.out.println("setelah pop: " + saya);
        //System.out.println(saya.pop());

    }

    }

