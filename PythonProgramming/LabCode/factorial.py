radius = float(input("Enter radius of the base of container in meters : "))
height = float(input("Enter the height in meters : "))
volume = 3.14 * radius * radius * height

flowrate = float(input("Enter flow rate in cubic meter per minute : "))
time = float(input("Enter time : "))
volume2 = flowrate * time

if (volume2 == volume):
    print("Tank will fill completely.")
elif(volume2 > volume):
    print("Overflow.")
elif(volume2 < volume):
    print("Not fully filled.")