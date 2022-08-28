# File IO Basics
'''
R - Read Mode of the file - Default mode
W - For writing in the file
X - Exclusive creation creates file when not exists
A - Add more content to a file
T - Text Mode with text data are opened in it - Default mode
B - Binary mode
+ - for reading and writing both
'''

myFile = open("ExceptionalHandlingInPython.py","r")

content = myFile.read()
print(content)
myFile.close()