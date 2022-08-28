file = open("hello1.txt","w") #File Opening in python using append mode

#Writing in a file in python
numberOfCharactersWritten = file.write("\n\nThis is written in the file using the write of python.\n")
print(numberOfCharactersWritten)

file.close() #File closing in python

file1 = open("hello.txt","r+") #file open in read as well as write mode.

content = file1.read()
print(content)

file1.close()