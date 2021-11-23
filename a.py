vow=['a','e','i','o','u','A','E','I','O','U']
text=input()
list=[i for i in text]
list.reverse()
l=[]
for i in list:
	if i not in vow:
		l.append(i)
str=''
for i in l:
	str+=i
print(str)
