file1 = open("sample.txt","r")
text = file1.read().split()

words = {}
for i in text :
    if i not in words :
        words[i] = 1
    else:
        words[i] = words[i] + 1

print(words)