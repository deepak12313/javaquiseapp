import java.util.Scanner;
public class condition {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("welcome to your school");
        System.out.println("please enter your class ");
        int cl=sc.nextInt();
         sc.nextLine();

        System.out.println("you are in class "+cl);
        System.out.println("please enter your name");
        String name= sc.nextLine();
                System.out.println("welcome "+name+"\n please start your test \n type 'Yes' if you are ready for the test");

                String response= sc.nextLine();

                int score=0;

                if (response.equalsIgnoreCase("Yes")) {

                    System.out.println("Great! "+name+" let's start your test.");

                    System.out.println("Q.1: what is the capital of india?");

                    System.out.println("a)Mumbai\nb)Delhi\nc)Rajasthan\nd)Goa");

                    String ans1= sc.nextLine();

                    if (ans1.equalsIgnoreCase("B")|| ans1.equalsIgnoreCase("Delhi")) {
                        
                        System.out.println("woohoooo!, this is the correct answer.");
                        score++;
                        
                    }
                    else
                    System.out.println("oops! wrong answer the correct answer is 'b' \n try the next one");
                    
                    System.out.println("Q.2: who is the prime minister of india?");
                    System.out.println("a)Bhajan lal sharma \nb)Mahatma gandhi \nc)Narendra modi \nd)Rahul gandhi");
                                        String ans2= sc.nextLine();
                                        if (ans2.equalsIgnoreCase("C")|| ans2.equalsIgnoreCase("Narendra Modi")) {
                        
                        System.out.println("woohoooo!, you are going well.");
                        score++;
                    }
                       else
                    System.out.println("oops! wrong answer the correct answer is 'c' \n try the next one");

                    System.out.println("Q.3: What is the capital of rajasthan?");
                    System.out.println("a)Dausa\nb)Sawai madhopur\nc)Bharatpur\nd)Jaipur");
                      String ans3= sc.nextLine();

                    if (ans3.equalsIgnoreCase("D")|| ans3.equalsIgnoreCase("Jaipur")) {
                        
                        System.out.println("woohoooo!, this is the correct answer.");
                        score++;
                        
                    }
                    else
                    System.out.println("oops! wrong answer the correct answer is 'd' \n try the next one");

                    
                    System.out.println("Q.4: In wh4ich year our country got freedom?");
                    System.out.println("a)1947\nb)1865\nc)1967\nd)2025");
                      String ans4= sc.nextLine();

                    if (ans4.equalsIgnoreCase("A")|| ans4.equalsIgnoreCase("1947")) {
                        
                        System.out.println("woohoooo!, this is the correct answer.");
                        score++;
                        
                    }
                    else
                    System.out.println("oops! wrong answer the correct answer is 'a' \n try the next one");

                    
                    System.out.println("Q.5: what is the national bird of india?");
                    System.out.println("a)parrot\nb)peacocke\nc)sparrow\nd)crow");
                      String ans5= sc.nextLine();

                    if (ans5.equalsIgnoreCase("B")|| ans5.equalsIgnoreCase("Peacoke")) {
                        
                        System.out.println("woohoooo!, this is the correct answer.");
                        score++;
                        
                    }
                    else
                    System.out.println("oops! wrong answer the correct answer is 'b' \n try the next one");


                    System.out.println("your test is completed type 'yes' to get your score");
                    String response2= sc.nextLine();

                    if (response2.equalsIgnoreCase("Yes")) {
                        System.out.println("your score is "+score+"/5 \n Congratulations!");
         
                        
                    }
                                   else
                        System.out.println("thanks come again");

                    

                    

                    




            
                    
                }
                else
                System.out.println("No problem!, here to see you again.");
                    
                }


        

        
    }

