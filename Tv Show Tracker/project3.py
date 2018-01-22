import tkinter
import os
import webbrowser
import sqlite3
root=tkinter.Tk()
root.title("TV Show Tracker")
root.geometry("300x300")
conn=sqlite3.connect('python.db')
def act():
    conn.execute("insert into details (name,age,gender,ch,sh,email) values (?,?,?,?,?,?)", (e1.get(), e2.get(),e3.get(),e4.get(),e5.get(),e6.get()))
    new = 2
    if(e4.get()=="colors"):
        url="http://www.colorstv.com/in/"
        webbrowser.open(url,new=new)
    elif(e4.get()=="sony"):
        url="http://www.dittotv.com/livetv/sony-entertainment-television"
        webbrowser.open(url,new=new)
    elif(e4.get()=="sab"):
        url="http://www.dittotv.com/livetv/sony-entertainment-television"
        webbrowser.open(url,new=new)
    elif(e4.get()=="zee"):
        url="http://www.dittotv.com/livetv/zee-tv-hd"
        webbrowser.open(url,new=new)
    else:
        os.system("python project.py")
    root.destroy()
l1=tkinter.Label(root,text="Name",bd=4)
e1=tkinter.Entry(root,text=" ")
l2=tkinter.Label(root,text="Age",bd=4)
e2=tkinter.Entry(root,text="")
l3=tkinter.Label(root,text="Gender")
e3=tkinter.Entry(root,text="   ")
l4=tkinter.Label(root,text="Tv Show Channel")
e4=tkinter.Entry(root,text="  ")
l5=tkinter.Label(root,text="Tv Show Name")
e5=tkinter.Entry(root,text="    ")
l6=tkinter.Label(root,text="Email")
e6=tkinter.Entry(root,text="      ")
b1=tkinter.Button(root,text="!!!Submit!!!",command=act)
l1.pack()
e1.pack()
l2.pack()
e2.pack()
l3.pack()
e3.pack()
l4.pack()
e4.pack()
l5.pack()
e5.pack()
l6.pack()
e6.pack()
b1.pack()
conn.commit()
root.mainloop()