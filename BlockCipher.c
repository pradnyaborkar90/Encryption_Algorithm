/*
Pradnya Borkar
CSS
Block Cipher
*/
list2=[]
def encrypt(pt,l,h):
    if(len(pt)>4):
        ptt=pt[2:h]+pt[l:2]
        print(ptt,"if")
        mid=int((h-l)/2)
        print(mid,"mid")
        print(l,h)
        encrypt(ptt[l:mid],l,mid)
        encrypt(ptt[mid:h],mid,h)
    elif(len(pt)==4):
        print(l,h,"elif")
        ptt=pt[2:h]+pt[l:2]
        print(ptt)
        list2.extend(ptt)
    else:
        pass;
        
    
    
    
    


plainText=list(input("Enter Message to be encrypted"))
#pT=plainText[2:len(plainText)]+plainText[0:2]
pT=encrypt(plainText,0,len(plainText))
print(list2)