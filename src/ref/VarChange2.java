package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;

        System.out.println("dataA 참조값=" + dataA );
        System.out.println("dataB 참조값=" + dataA);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataA.value);

        //dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataA.value);

        //dataB 변경
        dataA.value = 30;
        System.out.println("변경 data3.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataA.value);
    }
}
