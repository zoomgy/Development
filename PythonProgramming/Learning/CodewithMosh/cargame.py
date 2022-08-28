command = "help"
car_status = "off"
while(command != "quit"):
	command = input("> ").lower()
	if (command=="start" and car_status=="off"):
		print("The car is started.")
		car_status = "on"
	elif (command == "start" and car_status == "on"):
		print("The car is already started. Type stop or help.")
	elif (command == "stop" and car_status == "on"):
		print("The car is stopped.")
		car_status = "off"
	elif (command == "stop" and car_status =="off"):
		print("The car is already stoppped. Type start or help.")
	elif(command == "help"):
		print("type Start, Stop or Help")
	elif(command == "quit"):
		pass
	else:
		print("I dont understand the message.")