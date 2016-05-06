//

import java.util.Scanner;

public class Bowtie {
    public static void main(String[] args) {
        while (true) {
            boolean oddInt = false;
            int nStars;
            int value = 0;
            Scanner input = new Scanner(System.in);
            
            while (!oddInt) {
                System.out.print("Enter an odd integer between 3 and 33: ");
                if (input.hasNextInt()) {
                    value = input.nextInt();
                    if (value>=3 && value<=33 && value%2==1) {
                        oddInt = true;
                    } else {
                        System.out.println("It has to be an odd integer between 3 and 33.");
                    }
                } else {
                    System.out.println("It has to be an odd integer between 3 and 33.");
                    input.next();
                }
            }
    
            nStars = value;
            
            for (int i=0; i<value; i++) {
                if (nStars>1) {
                    for (int j=0; j<(value/2-0.5*nStars); j++) {
                            System.out.print(" ");
                    }
                    for (int k=0; k<nStars; k++) {
                        System.out.print("*");
                    }
                    nStars = nStars - 2;
                    System.out.print("\n");
                }
            }
            for (int m=0; m<=value; m++) {
                if (nStars <=value) {
                    for (int n=0; n<(value/2-0.5*nStars); n++) {
                        System.out.print(" ");
                    }
                    for (int p=0; p<nStars; p++) {
                        System.out.print("*");
                    }
                    nStars = nStars + 2;
                    System.out.print("\n");
                }
            }
            
            System.out.print("\n");
            /*nStars = value;
            
            int i=0;
            while (i<value) {
                if (nStars>1) {
                    for (int j=0; j<(value/2-0.5*nStars); j++) {
                            System.out.print(" ");
                    }
                    for (int k=0; k<nStars; k++) {
                        System.out.print("*");
                    }
                    nStars = nStars - 2;
                    System.out.print("\n");
                }
                i++;
            }
            int m=0;
            while (m<=value) {
                if (nStars <= value) {
                    for (int n=0; n<(value/2-0.5*nStars); n++) {
                        System.out.print(" ");
                    }
                    for (int p=0; p<nStars; p++) {
                        System.out.print("*");
                    }
                    nStars = nStars + 2;
                    System.out.print("\n");
                }
                m++;
            }*/
            
            /*System.out.print("\n");
            
            nStars = value;
            
            i=0;
            do {
                if (i<value) {
                    if (nStars>1) {
                        for (int j=0; j<(value/2-0.5*nStars); j++) {
                                System.out.print(" ");
                        }
                        for (int k=0; k<nStars; k++) {
                            System.out.print("*");
                        }
                        nStars = nStars - 2;
                        System.out.print("\n");
                    }
                    i++;
                }
            } while (i<value);
            m=0;
            do {
                if (m<=value) {
                    if (nStars <= value) {
                        for (int n=0; n<(value/2-0.5*nStars); n++) {
                            System.out.print(" ");
                        }
                        for (int p=0; p<nStars; p++) {
                            System.out.print("*");
                        }
                        nStars = nStars + 2;
                        System.out.print("\n");
                    }
                    m++;
                }
            } while (m<=value); */
            
            System.out.print("Enter 'y' or 'Y' to continue. Enter anything else to quit: ");
            String x = input.next();
            if (!x.equals("y") && !x.equals("Y")) {
                break;
            }
        }
    }
}