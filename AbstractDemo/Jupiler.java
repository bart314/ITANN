class Jupiler extends Beer {
    public Jupiler(String foo) {
        super("jupiler");
    }
    
    @Override
    public void drink(int amount) {
        System.out.println("Lekker op het terras met een glaasje");
    }
}