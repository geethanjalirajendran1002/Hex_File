ssize = int(input())
arr1 = list()
for i in range(ssize):
    elemnt = input()
    arr1.append(elemnt)
arr1 = list(set(arr1))
arr1.sort()
print(arr1[1])
