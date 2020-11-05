# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
#print("Hello world")
opr = input("enter the operation 1=+; 2=-; 3=*; 4=/ => ")
opr = int(opr)
print(opr,type(opr))
if opr < 5 and opr > 0:
    f = input("enter the first digit")
    s = input("enter the second digit")
    f = int(f)
    s = int(s)
    if opr ==1:
        print("Result",f+s)
    elif opr == 2:
        print("Result",f-s)
    elif opr == 3:
        print("Result",f*s)
    elif opr == 4:
        print("Result",f/s)
    else :
        print("Galt cha")
else:
    print("Wrong Input ")




