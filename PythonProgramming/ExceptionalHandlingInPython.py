print("This is the first line of the code .")
print("This is the second line of the code.\n")

number1 = input("Please enter the number 1 : ")
number2 = input("Please enter the number 2 : ")

try:
    print("\nThe sum of the two numbers is : ",int(number1) + int(number2))
except Exception as e:
    print(e)