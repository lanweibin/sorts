public class VariantTest {
    public static void main(String[] args) {

    }
        public static int staticVar = 0;
        public int instanceVar = 0;
        public VariantTest(){
            staticVar++;
            instanceVar++;
            System.out.println("staticVar=" + staticVar + ",instanceVar=" + instanceVar);
        }

}
