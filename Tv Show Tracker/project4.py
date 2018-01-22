import tkinter
import os
root=tkinter.Tk()
root.title("TV Show Tracker")
root.geometry("300x300")
def act():
    root.destroy()
    os.system("python project.py")
b1=tkinter.Button(root,text="!!!ERROR!!!",command=act)
b1.pack()
root.mainloop()