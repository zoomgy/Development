i,j = 1,1
matrix1 = [[int(input()) for j in range(3)] for i in range(3)]
matrix2 = [[int(input()) for j in range(3)] for i in range(3)]
matrix3 = [[matrix1[i][j] + matrix2[i][j] for j in range(3)] for i in range(3)]
print(matrix3)