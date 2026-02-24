import java.util.Scanner;
public class main {
    public static Candidate getCandidateDetails() throws InvalidInternException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Candidate details:");
        System.out.println("Name:");
        String name=scanner.next();
        System.out.println("Gender:");
        String gender=scanner.next();
        System.out.println("Enter percentage in 10th:");
        int percentage=scanner.nextInt();
        if (percentage<50){
            throw new InvalidInternException("Registration failed");
        }else{
            Candidate canditate=new Candidate();
            canditate.setName(name);
            canditate.setGender(gender);
            canditate.setPercentage(percentage);
            return canditate;
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Interhiring tool");
        try{
            Candidate canditate=getCandidateDetails();
            System.out.println("Registration Sucessful");
        } catch(InvalidInternException e){
            System.out.println(e.getMessage());
        }
    }
}
