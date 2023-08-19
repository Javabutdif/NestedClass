import java.util.*;

public class Nested {
    
    public static void main(String[] args) {
        Nested mainDisplay = new Nested();
        
        mainDisplay.input();
        
        
    }
    
    //Method
    private void input(){
        Scanner console = new Scanner(System.in);
        
        System.out.print("Enter first name: ");
        String firstname = console.nextLine();
        System.out.print("Enter last name: ");
        String lastname = console.nextLine();
        
        enteredData(firstname,lastname);
    }
    
    private void enteredData(String firstname, String lastname){
        User user = new User();
        
        User.AccountCreation userCreate = user.new AccountCreation();
        User.DataStoring dataHandle = new User.DataStoring();
        
        userCreate.setFirstName(firstname);
        userCreate.setLastName(lastname);
        
        
         new User.DataStoring(firstname, userCreate);
        
        User.AccountCreation x = dataHandle.viewData(firstname);
        
        System.out.println("Output: \n"+ x.getFirstName()  +"\n"+x.getLastName());
        
    }
    
}

class User{
    
    class AccountCreation{
        private String lastName = "";
        private String firstName = "";
        
        //Method
        //Getter
        public String getFirstName(){
            return this.firstName;
        }
        public String getLastName(){
            return this.lastName;
        }
        //Setter 
        public void setLastName(String lastname){
            this.lastName= lastname;
        }
        public void setFirstName(String firstname){
            this.firstName = firstname;
        }
    }
    
    //Storing Data
   static class DataStoring{
        static HashMap<String,AccountCreation> data = new HashMap<String,AccountCreation>();
        
       DataStoring(){}
       
       DataStoring(String firstname,AccountCreation x){
           data.put(firstname,x);
       }
       
       //
       public AccountCreation viewData(String firstname){
           
            return data.get(firstname);
               
           
       }
        
    }
    
    
    
}