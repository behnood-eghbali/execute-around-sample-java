public class ResourceB {
    public ResourceB() {
        System.out.println("created...");
    }

    public ResourceB op1() {
        System.out.println("op1...");
        return this;
    }

    public ResourceB op2() {
        System.out.println("op2...");
        return this;
    }

    public void close(){ System.out.println("clean up"); }
}
