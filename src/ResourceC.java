import java.util.function.Consumer;

public class ResourceC {
    private ResourceC() {
        System.out.println("created...");
    }

    public ResourceC op1() {
        System.out.println("op1...");
        return this;
    }

    public ResourceC op2() {
        System.out.println("op2...");
        return this;
    }

    private void close(){ System.out.println("clean up"); }

    public static void use(Consumer<ResourceC> block){
        ResourceC resource = new ResourceC();

        try {
            block.accept(resource);
        } finally {
            resource.close();
        }
    }
}
