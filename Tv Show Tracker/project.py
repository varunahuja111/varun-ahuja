import tkinter
import sqlite3
import os
conn = sqlite3.connect('python.db')
root=tkinter.Tk()
root.title("TV Show Tracker")
root.geometry("300x300")
def act():
    root.destroy()    
    os.system("python project2.py")
    
def act1():
    root.destroy()
    os.system("python project1.py")
b1=tkinter.Button(root,text="New User",command=act)
b2=tkinter.Button(root,text="Existing User",command=act1)
b1.pack()
b2.pack()
conn.commit()
root.mainloop()