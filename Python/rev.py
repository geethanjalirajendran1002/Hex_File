num = int(input())
sum = 0

while num != 0:
    dig = num%10
    sum = sum * 10 + dig
    num //= 10
print(sum)
