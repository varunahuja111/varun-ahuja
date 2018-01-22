import tkinter
import os
import sqlite3
conn = sqlite3.connect('python.db')
root=tkinter.Tk()
root.title("TV Show Tracker")
root.geometry("300x300")
def act():
    f=0
    cursor = conn.execute("select * from login")
    for row in cursor:
        c1=row[0]
        c2=row[1]
        if ((c1==e1.get())&(c2==e2.get())):
            f=1
            break;
        else:
            continue;
    if(f==1):
        root.destroy()
        os.system("python project3.py")
    else:
        root.destroy()
        os.system("python project4.py")
    
l1=tkinter.Label(root,text="Username",bd=4)
e1=tkinter.Entry(root,text=" ")
l2=tkinter.Label(root,text="Password",bd=4)
e2=tkinter.Entry(root,show="*")
b1=tkinter.Button(root,text="Sign In",command=act)
l1.pack()
e1.pack()
l2.pack()
e2.pack()
b1.pack()
conn.commit()
root.mainloop()
