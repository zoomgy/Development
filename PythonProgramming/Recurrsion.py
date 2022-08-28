# def print2(str1):
#     print("This is "+str1)

# print2("Madarchod")

def factorial(n):
    if n == 1:
        return 1
    else:
        return n * factorial(n-1)

n = int(input("Enter the number for factorial calculation : "))
print(factorial(n))