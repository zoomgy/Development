message = input("Enter a string with emoticons : ")
emoji_dict = {
    ":)" : "😆",
    ":(" : "😞"
}
message_words = message.split()
result_string = ""
for word in message_words:
    result_string = result_string + emoji_dict.get(word,word) + " "
print(result_string)
