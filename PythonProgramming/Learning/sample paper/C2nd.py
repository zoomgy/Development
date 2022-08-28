list1 = [1,2,3,4,5,6]
def sumsquare(l):
    evensum = 0
    oddsum = 0
    for i in l:
        if i%2 == 0:
            evensum = evensum + i**2
        if i%2 == 1:
            oddsum = oddsum + i**2
    return [oddsum,evensum]

print(sumsquare(list1))