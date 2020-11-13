public class PalindromicNumberFinder {
    private int num;

    // constructor
    public PalindromicNumberFinder(int num){
        this.num = num;
    }

    // accessor/getter method
    public int getNum(){
        return this.num;
    }

    // this method should find the next palindromic number
    public int searchForPalindromicNum(int num){
      this.num = num;
      int counter = num;
      boolean palindrome = false;

      while(palindrome != true){
        counter++;
        testPalindromicNum(counter);
        if(testPalindromicNum(counter)){
          palindrome = true;
        }
      }
      return counter - num;
    }

    // this is a helper method for searchForPalindromicNum. It's purpose is to test if a number is actually a palindrome
    public boolean testPalindromicNum(int num){
     int reversedNum = Integer.parseInt(reverseNum(num));
        if (num == reversedNum)
            return true;
        else{
           return false;
        }   
    }
  


    // this is a helper method for testPalindromicNum. It should reverse the number and return it.
    public String reverseNum(int num){
      int reverse = 0;

    while(num != 0)
    {
      reverse = reverse * 10;
      reverse = reverse + num%10;
      num = num/10;
    }
    String result = String.valueOf(reverse);
    return result;

    }


    @Override
    public String toString(){
        return "You'd have to drive " + searchForPalindromicNum(this.num) + " miles";
    }
}