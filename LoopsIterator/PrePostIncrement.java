class PrePostIncrement {
    public PrePostIncrement() {
        int i=0;
        while (i++<10) {
            System.out.println(i);
        }

        int j=0;
        do {
            System.out.println(j);
        } while (j++ < 10);
    }
}