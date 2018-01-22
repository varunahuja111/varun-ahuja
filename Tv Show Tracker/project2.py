import sqlite3
import tkinter
import os
try:
    conn = sqlite3.connect('python.db')
    root=tkinter.Tk()
    root.title("TV Show Tracker")
    root.geometry("300x300")
    def act():
        print("Created")
        conn.execute("insert into login (username,password) values (?,?)",(e1.get(),e2.get()))
        conn.commit()
        root.destroy()
        os.system("python project3.py")
    l1=tkinter.Label(root,text="Username",bd=4)
    e1=tkinter.Entry(root,text=" ")
    l2=tkinter.Label(root,text="Password",bd=4)
    e2=tkinter.Entry(root,text="")
    b1=tkinter.Button(root,text="Sign up",command=act)
    l1.pack()
    e1.pack()
    l2.pack()
    e2.pack()
    b1.pack()
    root.mainloop()
except sqlite3.ProgrammingError as e:
    print (e)   