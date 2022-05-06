num1 = int(input())
sum1 = 0
temp = num1
while temp > 0:
    dig = temp%10
    sum1 = sum1 * 10 + dig
    temp //= 10
if sum1 == num1:
    print("palindrome")
else:
    print("no palindrome")
