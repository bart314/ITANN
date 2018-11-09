class ArrayDemo {
    void createDemo() {
        String[] foo = new String[5];
        
        int[] primes = {2,3,5,7,11,13};
        int[] even = new int[]{2,4,6,8,10};
        
        int[] odd = new int[5];
        odd[0]=2;
        odd[1]=4;
        odd[2]=6;
        odd[3]=8;
        odd[4]=10;
        
        System.out.println(primes);
    }
    
    void gebruikDemo() {
        int[] primes = {2,3,5,7,11,13};
        primes[1]++;
        System.out.println(primes[1]); 
        
        primes[2] = 6;
        System.out.println(primes[2]);
        
        primes[3] = primes[2] + primes[3];
        System.out.println(primes[3]);
    }
    
    void loopingDemo1() {        
        int[] primes = {2,3,5,7,11,13};
        
        for (int i=0; i<primes.length; i++) {
            System.out.print("Het priemnummer op " +i+": ");
            System.out.println(primes[i]);
        }
        
        //quizzzz: wat is de waarde van i hier?
    }
    
    void loopingDemo2() {
        int[] primes = {2,3,5,7,11,13};
        int check = 0;
        
        while (check < primes.length) {
            System.out.print("Het priemnummer op " +check+": ");
            System.out.println(primes[check]);
            check++;
        }
        
        //quizzzzz: wat is de waarde van check hier?
    }    
    
    void loopingDemo3() {
        int[] primes = {2,3,5,7,11,13};
        int check = 0;
        do {
            System.out.print("Het priemnummer op " +check+": ");
            System.out.println(primes[check]);
        } while (++check < primes.length);
        
        // Quizzzzzz: waarom gaat het hierboven goed met die pre-increment?
    }
}
        
        
        