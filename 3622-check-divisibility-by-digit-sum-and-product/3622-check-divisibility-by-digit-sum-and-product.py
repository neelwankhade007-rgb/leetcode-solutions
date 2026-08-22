class Solution:
    def checkDivisibility(self, n: int) -> bool:
        num = n
        digit_sum = 0
        digit_product = 1

        while num > 0:
            digit = num % 10
            digit_sum += digit
            digit_product *= digit
            num = num // 10

        total = digit_sum + digit_product

        if n % total == 0:
            return True
        else:
            return False