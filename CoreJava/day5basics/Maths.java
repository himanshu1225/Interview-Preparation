package CoreJava.day5basics;

public class Maths {
    public int divide(int a, int b){
        int ans = -1;
        try {
            ans = a / b;
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
            return ans; // This will return -1 if an exception occurs, which is the default value we assigned to ans.   
        } finally{
            System.out.println("Division operation completed."); 
            // In case of an exception, the finally block will still execute, and we can perform any necessary cleanup or logging here.
            // If we had a return statement in the try/Catch  block, the finally block would execute before the method returns, allowing us to ensure that certain actions are always performed regardless of whether an exception occurred or not.
        }
        return ans;
    }
}
