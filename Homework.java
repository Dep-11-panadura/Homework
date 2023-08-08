import java.util.Scanner;

public class Homework {


     private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        if (name.length() > 0 && name.strip().length()>0){ 
            System.out.printf("Name: %s \n", name); 

        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); 
        if (age > 0 && age <= 18) {
            System.out.printf("Age: %s \n", age); 

            Scanner scanner = new Scanner(System.in);
        System.out.print("Enter subject 1: ");
        String subject1 = scanner.nextLine();
        if (subject1.startsWith("SE-")){
            System.out.printf("Subject 1: %s \n", subject1);

            System.out.print("Enter subject 1 Marks: ");
            double subjmark1 = scanner.nextDouble();
            if (0 <= subjmark1 && subjmark1 <= 100){
                System.out.printf("Subject 1 Marks: %s \n", subjmark1);



            Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter subject 2: ");
        String subject2 = scanner1.nextLine();
        if (subject2.startsWith("SE-")){
            System.out.printf("Subject2: %s \n", subject2);
        
            
            System.out.print("Enter subject 2 Marks: ");
            double subjmark2 = scanner.nextDouble();
            if (0 <= subjmark2 && subjmark2 <= 100){
                System.out.printf("Subject2 Marks: %s \n", subjmark2);
            
            
            
            Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter subject 3: ");
        String subject3 = scanner2.nextLine();
        if (subject3.startsWith("SE-")){
            System.out.printf("Subject3: %s \n", subject3);

            System.out.print("Enter subject 3 Marks: ");
            double subjmark3 = scanner.nextDouble();
            if (0 <= subjmark2 && subjmark2 <= 100){
                System.out.printf("Subject 3 Marks: %s \n", subjmark3);


                 double total = subjmark1 + subjmark2 + subjmark3 ;
                 double avg   = total/3 ;
                 String status = (75 <= avg) ? "Distinguished pass" : ( 65 <= avg) ? " Credit pass" : (55 <=avg) ? "pass":"Fail";
                 String statussub1 = (75 <= subjmark1) ? "Distinguished pass" : ( 65 <= subjmark1) ? " Credit pass" : (55 <=subjmark1) ? "pass":"Fail";
                 String statussub2 = (75 <= subjmark2) ? "Distinguished pass" : ( 65 <= subjmark2) ? " Credit pass" : (55 <=subjmark2) ? "pass":"Fail";
                 String statussub3 = (75 <= subjmark3) ? "Distinguished pass" : ( 65 <= subjmark3) ? " Credit pass" : (55 <=subjmark3) ? "pass":"Fail";
                
                 System.out.printf("+-----------------------------------------------------+\n");
                 System.out.printf("|Name:  %s%\t\t\t|n",BLUE,name.toUpperCase(),RESET);
                 System.out.printf("|Age:  %s%years pld%s        |n",RED,age,RESET,BLUE,RESET);
                 System.out.printf("|Status:  %s%\t\t\t|n",(status.equals("Distinguished pass")) ? BLUE :(status.equals(" Credit pass"))
                 System.out.printf("|Total:  %s.2f   Avg: %.2f\t|n",total,avg);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
                }else{System.out.print("Invalid subject 3 marks");}



            
        }else{System.out.print("Invalid subject 3");}
            
            
            }else{System.out.print("Invalid subject 2 marks");}

            
            
            
            }else{System.out.print("Invalid subject 2 ");}
        
        



        
        }else{System.out.print("Invalid subject 1 marks");}

        
     



        }else{System.out.print("Invalid subject 1 ");}


    }else{System.out.print("Inavalid Age");}


   
   
   
   
    }else{System.out.print("Inavalid Name");}








}
}