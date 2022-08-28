letter = '''Hello <|Name|> what are you doing.'''
name = input("Hello please enter your name : ")
print(letter.replace("<|Name|>",name))