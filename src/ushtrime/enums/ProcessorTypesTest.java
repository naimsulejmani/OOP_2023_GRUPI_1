package ushtrime.enums;

public class ProcessorTypesTest {
    public static void main(String[] args) {
        ProcessorTypes p1 = ProcessorTypes.OCTA_CORE;

        for (ProcessorTypes p: ProcessorTypes.values()){
            System.out.println(p);
        }

        ProcessorTypes p2 = ProcessorTypes.valueOf("DECA_CORE");


    }
}
