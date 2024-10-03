
public class TestMicroprocessor {
    public static void main(String[] args) {
        IntelProcessor intel = new IntelProcessor();
        AMDProcessor amd = new AMDProcessor();
        ARMProcessor arm = new ARMProcessor();

        System.out.println("Intel Details: " + intel.getDetails());
        System.out.println("AMD Details: " + amd.getDetails());
        System.out.println("ARM Details: " + arm.getDetails());
    }
}
