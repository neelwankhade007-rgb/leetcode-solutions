bool isPalindrome(int x) {
    int reversed = 0;
    if(x < 0 | (x % 10 == 0 && x !=0)){
        return false; 
    }
    while(x > reversed) {
        reversed = reversed * 10 + x % 10;
        x /= 10;
    }
    return (x == reversed || x == reversed / 10);
}