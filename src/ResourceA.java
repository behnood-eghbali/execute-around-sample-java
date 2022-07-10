public class ResourceA {
    public ResourceA() { System.out.println("created..."); }

    public ResourceA op1() {
        System.out.println("op1...");
        return this;
    }

    public ResourceA op2() {
        System.out.println("op2...");
        return this;
    }

    public void finalize(){ System.out.println("clean up"); }
}
