num = 123456789123456789123456789
sum = 0
while num >= 1:
    sum += num % 10
    num //= 10
print(sum)
