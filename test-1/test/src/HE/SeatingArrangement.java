package HE;

import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class SeatingArrangement {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();                 // Reading input from STDIN
        for(int i =0; i<test;i++){
            int seatNo = s.nextInt();
            int aNo= SeatingArrangement.getAppartmentNo(seatNo);
            int mod = seatNo%12;
            int facingSeat=aNo*12-((mod==0?12:mod)-1);
            System.out.println(facingSeat+" ");
            System.out.println(SeatingArrangement.getSeatType(facingSeat, aNo));
        }

    }
    
    private static String getSeatType(int facingSeat, int aNo) {
        int mod = facingSeat%12;
        int count = aNo*12;
        if(mod==0 ||count-5==facingSeat ||count-6== facingSeat|| count-11==facingSeat )
            return "WS";
        else if(count-2==facingSeat ||count-3== facingSeat|| count-8==facingSeat || count-9==facingSeat )
            return "AS";
        else
            return "MS";
        
    }
    
    private static int getAppartmentNo(int seatNo) {
        int n = seatNo/12;
        return seatNo%12 == 0 ? n:++n;
    }
}