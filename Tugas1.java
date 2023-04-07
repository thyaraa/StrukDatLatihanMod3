package Latihan3;

import java.util.Stack;

public class Tugas1 {
    public static void main(String[] args) {
        Stack st = new Stack();//membuat stack baru
        st.push("Aku");//push item
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next : " +st.peek());//peek : Menghasilkan elemen pada top stack, tetapi tidak me remove.
        st.push("Raya");
        System.out.println(st.pop());//pop : Menghasilkan elemen pada stack, dan mengambil/menghapus (remove) elemen tersebut
        st.push("!");

        int count = st.search("Aku");
        while (count != -1 && count > 1){
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        System.out.println(st.empty());//Menghasilkan nilai True jika stack kosong, dan nilai False jika stack berisi elemen.
    }
}
