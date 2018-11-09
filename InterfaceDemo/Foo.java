public abstract final class Foo extends Bart implements IDemo, Button {
    public String demoMethod () {
        return "Uit andere klasse";
    }
    
    public int multiplyDemo() {
        return 80;
    }
    
    
    public void clicked() {
        System.out.println("Button Clicked");
    }
}

        