string1 = input("Enter a string : ")
mydict = {}
mydict = {i:string1.count(i) for i in string1 if i not in mydict}
print(mydict)