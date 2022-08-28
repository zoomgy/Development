for n in range(1,10001):
    c=0
    sum = 0
    o = n
    p = n
    while n!=0 : 
        c = c + 1
        n=n//10
    while o!=0 :
        last = o%10
        o=o//10
        sum = sum + last**c
    if (p == sum):
        print (p,end = " ")