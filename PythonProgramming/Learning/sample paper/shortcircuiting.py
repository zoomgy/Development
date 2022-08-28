import numpy as np

a = [[1,11,6],[3,2,1],[2,6,1]]
x=0
for i in range(3):
    x = max(a[i])
    y = a[i][2]
    index1 = a[i].index(x)
    index2 = 2
    temp = a[i][index1]
    a[i][index1] = a[i][2]
    a[i][2] = temp
print(np.array(a))