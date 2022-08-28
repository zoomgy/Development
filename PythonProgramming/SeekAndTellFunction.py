file1 = open("FileWriteInPython.py","r")

print(file1.tell()) # This tells us where our file pointer is currently in the file on which index is our file pointer currently.
print(file1.readline())
print(file1.tell())
print(file1.readline())
print(file1.tell())

file1.seek(0) #This resets our file pointer to the index which we give as an argument.
print(file1.readline())

file1.close()