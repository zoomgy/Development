choice1 = int(input("Enter for which student you want to log : \n1. Rohan\n2.Sameer\n3.Mohammad\n->"))
def getdate():
    import datetime
    return datetime.datetime.now()

if choice1 == 1:
    choice2 = int(input("Press 1 for Diet and Press 2 for Exercise : "))
    if choice2 == 1 :
        with open("RohanDiet.txt","a") as file:
            file.write("["+str(getdate())+"] - ")
            file.write(input("What did you eat ? : ") + "\n")
    elif choice2 == 2:
        with open("RohanExercise.txt","a") as file:
            file.write("["+str(getdate())+"] - ")
            file.write(input("What did you do ? : ") + "\n")
    else:
        print("Wrong Choice.")

elif choice1 == 2:
    choice2 = int(input("Press 1 for Diet and Press 2 for Exercise : "))
    if choice2 == 1 :
        with open("SameerDiet.txt","a") as file:
            file.write("["+str(getdate())+"] - ")
            file.write(input("What did you eat ? : ") + "\n")
    elif choice2 == 2:
        with open("SameerExercise.txt","a") as file:
            file.write("["+str(getdate())+"] - ")
            file.write(input("What did you do ? : ") + "\n")
    else:
        print("Wrong Choice.")
elif choice1 == 1:
    choice2 = int(input("Press 1 for Diet and Press 2 for Exercise : "))
    if choice2 == 1 :
        with open("MohammadDiet.txt","a") as file:
            file.write("["+str(getdate())+"] - ")
            file.write(input("What did you eat ? : ") + "\n")
    elif choice2 == 2:
        with open("MohammadExercise.txt","a") as file:
            file.write("["+str(getdate())+"] - ")
            file.write(input("What did you do ? : ") + "\n")
    else:
        print("Wrong Choice.")
else:
    print("Wrong Choice.")