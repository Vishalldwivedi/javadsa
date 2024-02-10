public class mutable {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder("vishal");
        st.append("dwivedi");
        System.out.println(st);


        final StringBuilder sb = new StringBuilder("vishall");
        sb.append("dwivedi");
        //sb = new StringBuilder("zdfc");/error


        StringBuilder sb2 = new StringBuilder("vishall");
        sb2.append("dwivedi");
        sb2 = new StringBuilder("zdfc");
    }
}
