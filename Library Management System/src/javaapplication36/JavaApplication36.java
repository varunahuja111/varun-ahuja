
package javaapplication36;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
class myexception extends Exception{
    myexception(String name){
        super(name);
    }
}
 abstract class library{
      String name="ABC";
      String id="XYZ";
      library(String n,String i){
          name=n;
          id=i;
      }
       abstract void display();
}
class librarian extends library{
    String password;
    librarian(String na,String id,String p){
        super(na,id);
        password=p;
    } 
    librarian(String na,String id){
        super(na,id);
    }
    void display(){
        
    }
}
class student extends library{
    student(String na,String id){
        super(na,id);
    }
void display(){
        System.out.println("                ---------------------               ");
        System.out.println("                +  Student Section  +               ");
        System.out.println("                ---------------------               ");
    }
}
class teacher extends library{
    teacher(String na,String id){
        super(na,id);
    }
    void display(){
        System.out.println("                ---------------------               ");
        System.out.println("                +  Teacher Section  +               ");
        System.out.println("                ---------------------               ");
    }
}
public class JavaApplication36 {
static int z=0;
    public static void main(String[] args) {
        System.out.println("                   ---------------------------                   ");
        System.out.println("                   |Library Management System|                   ");
        System.out.println("                   ---------------------------                   ");
        while(1<10){
        System.out.println("                  1).Librarian                                   ");
        System.out.println("                  2).Student                                     ");
        System.out.println("    `             3).Teacher                                     ");
        System.out.println("                  4).Exit                                        ");
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        switch(a){
            case 1:{
                try{
                    System.out.println("                ---------------------               ");
                    System.out.println("                + Librarian Section +               ");
                    System.out.println("                ---------------------               ");
                System.out.println("                If you are a existing librarian then press 1              ");
                int q;
                q=sc.nextInt();
                if(q==1){
                System.out.println("                Enter the password:                     ");
                String p;
                p=sc.next();
                if(p.equalsIgnoreCase("library123")==false)
                    System.out.println("                    !!!Enter the correct password!!!                    ");
                while(1<10){
                System.out.println("                1). Add             ");
                System.out.println("                2). Remove          ");
                System.out.println("                3). Check           ");
                System.out.println("                4). Display Info    ");
                System.out.println("                5). Exit            ");
                int b;
                b=sc.nextInt();
                Map m=new HashMap();
                Map m1=new HashMap();
                Map m2=new HashMap();
                Set e1=m2.keySet();
                Collection c=m.values();
                Collection c1=m1.values();
                Collection c2=m2.values();
                Scanner st=new Scanner(System.in);
                if(b==1){
                    System.out.println("Enter the name:");
                    String n;
                    String e;
                    n=sc.next();
                    System.out.println("Enter the Email Id:");
                    e=st.next();
                    System.out.println("Enter the Id:");
                    String i;
                    i=sc.next();
                    System.err.println("Your password is ");
                    System.err.println("'library123'");
                    m.put(1,n);
                    m1.put(1, e);
                    m2.put(1,i);
                }
                else if(b==2){
                    System.out.println("Enter the Id:");
                    String i;
                    i=sc.next();
                    if(c2.equals(i))
                    {
                        int sa=(int)getKeyFromValue(m2,i);
                        m2.remove(sa);
                        m1.remove(sa);
                        m.remove(sa);
                        System.out.println("Removed...");
                    }
                    else
                        throw new myexception("ERROR!!!");
                }
                else if(b==3){
                    System.out.println("Enter the Id:");
                    String i;
                    i=sc.next();
                    if(c2.equals(i))
                    {
                        System.out.println("Employ Exist...");
                    }
                    else 
                        throw new myexception("ERROR!!!");
                }
                else if(b==4){
                    System.out.println("Enter the Id:");
                    String i;
                    i=sc.next();
                    if(c2.equals(i))
                    {
                        int sa=(int)getKeyFromValue(m2,i);
                        String x=(String)m.get(sa);
                        String y=(String)m1.get(sa);
                        System.out.println("NAME:"+x);
                        System.out.println("EMAIL ID:"+y);
                    }
                }
                else
                    break;
                }
                }
                else 
                    throw new myexception("!!!ERROR!!!");
                }
            catch(myexception e){
                System.out.println(e.getMessage());
            }
                catch(Exception ex)
                {
                    System.out.println(ex.getMessage());
                }
            }break;
            case 2:
            {   Scanner st=new Scanner(System.in);
                try{
                System.out.println("                Enter the Student Name:               ");
                String i,n;
                n=sc.next();
                System.out.println("                Enter the Student Id:                 ");
                i=st.next();
                student s=new student(n,i);
                s.display();
                while(1<10){
                System.out.println("Enter the option:\n1)Issue\n2).Reissue\n3).Return\n4).Check Account");
                int ab;
                ab=sc.nextInt();
                Map l=new HashMap();
                Map l1=new HashMap();
                Map l2=new HashMap();
                Map l3=new HashMap();
                Map l4=new HashMap();
                Collection c=l.values();
                Collection c1=l.values();
                Collection c2=l.values();
                Collection c3=l.values();
                Collection c4=l.values();
                switch(ab){
                    case 1:
                    {
                        System.out.println("Enter the no. of books you want to issue:");
                        int no;
                        no=sc.nextInt();
                        if(no<6&&no!=0){
                        if(no==1){
                        System.out.println("Enter the book id:");
                        String id;
                        id=sc.next();
                        if(c.equals(id)==false){
                        l.put(i,id);
                        System.out.println("ISSUED...");
                        }
                        }
                        else if(no==2)
                        {
                            System.out.println("Enter the book id:");
                        String id;
                        id=sc.next();
                        if(c.equals(id)==false){
                        l.put(i,id);
                        System.out.println("Enter the book id:");
                        String id1;
                        id1=sc.next();
                        if(c.equals(id1)==false){
                        l1.put(i,id1);
                        System.out.println("ISSUED...");
                        }
                        }
                        }
                        else if(no==3){
                            System.out.println("Enter the book id:");
                        String id;
                        id=sc.next();
                        if(c.equals(id)==false){
                        l.put(i,id);
                        System.out.println("Enter the book id:");
                        String id1;
                        id1=sc.next();
                        if(c.equals(id1)==false){
                        l1.put(i,id1);
                        System.out.println("Enter the book id:");
                        String id2;
                        id2=sc.next();
                        if(c.equals(id2)==false){
                        l2.put(i,id2);
                        System.out.println("ISSUED...");
                        }
                        }
                    }}
                        else if(no==4){
                            System.out.println("Enter the book id:");
                        String id;
                        id=sc.next();
                        if(c.equals(id)==false){
                        l.put(i,id);
                        System.out.println("Enter the book id:");
                        String id1;
                        id1=sc.next();
                        if(c.equals(id1)==false){
                        l1.put(i,id1);
                        System.out.println("Enter the book id:");
                        String id2;
                        id2=sc.next();
                        if(c.equals(id2)==false){
                        l2.put(i,id2);
                        System.out.println("Enter the book id:");
                        String id3;
                        id3=sc.next();
                        if(c.equals(id)==false){
                        l3.put(i,id3);
                        System.out.println("ISSUED...");
                        }}}}}
                        
                        else if(no==5){
                            System.out.println("Enter the book id:");
                        String id;
                        id=sc.next();
                        if(c.equals(id)==false){
                        l.put(i,id);
                        System.out.println("Enter the book id:");
                        String id1;
                        id1=sc.next();
                        if(c.equals(id1)==false){
                        l1.put(i,id1);
                        System.out.println("Enter the book id:");
                        String id2;
                        id2=sc.next();
                        if(c.equals(id2)==false){
                        l2.put(i,id2);
                        System.out.println("Enter the book id:");
                        String id3;
                        id3=sc.next();
                        if(c.equals(id3)==false){
                        l3.put(i,id3);
                            System.out.println("Enter the book id:");
                        String id4;
                        id4=sc.next();
                        if(c.equals(id4)==false){
                        l3.put(i,id4);
                        }}}}}}
                        }}break;
                    case 2:
                    {
                        System.out.println("Enter the book id:");
                        String id;
                        id=sc.next();
                        if(c.equals(id)||c1.equals(id)||c2.equals(id)||c3.equals(id)||c4.equals(id))
                            System.out.println("Reissued");
                        else 
                            throw new myexception("ERROR!!!");
                    }break;
                    case 3:
                    {
                        System.out.println("Enter the book id:");
                        String id;
                        id=sc.next();
                        if(c.equals(id)){
                            l.remove(id);
                        }
                        else if(c1.equals(id)){
                            l1.remove(id);
                        }
                        else if(c2.equals(id)){
                            l2.remove(id);
                        }
                        else if(c3.equals(id)){
                            l3.remove(id);
                        }
                        else if(c4.equals(id)){
                            l4.remove(id);
                        }
                        else
                            throw new myexception("ERROR!!!");
                    }break;
                    case 4:
                    {
                        System.out.println("Issued Books Are:");
                        System.out.println(l.get(i));
                        System.out.println(l1.get(i));
                        System.out.println(l2.get(i));
                        System.out.println(l3.get(i));
                        System.out.println(l4.get(i));
                    }break;
                    default:
                        throw new myexception("ERROR!!!");
                }
            }}
            catch(myexception e){
                    System.out.println(e.getMessage());
                    }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }}break;
            case 3:
            {   Scanner st=new Scanner(System.in);
                try{
                System.out.println("                Enter the Teacher Name:               ");
                String i,n;
                n=sc.next();
                System.out.println("                Enter the Teacher Id:                 ");
                i=st.next();
                teacher t=new teacher(n,i);
                t.display();
                while(1<10){
                System.out.println("Enter the option:\n1)Issue\n2).Reissue\n3).Return\n4).Check Account");
                int ab;
                ab=sc.nextInt();
                Map l=new HashMap();
                Map l1=new HashMap();
                Map l2=new HashMap();
                Map l3=new HashMap();
                Map l4=new HashMap();
                Collection c=l.values();
                Collection c1=l.values();
                Collection c2=l.values();
                Collection c3=l.values();
                Collection c4=l.values();
                switch(ab){
                    case 1:
                    {
                        System.out.println("Enter the no. of books you want to issue:");
                        int no;
                        no=sc.nextInt();
                        if(no<6&&no!=0){
                        if(no==1){
                        System.out.println("Enter the book id:");
                        String id;
                        id=sc.next();
                        if(c.equals(id)==false){
                        l.put(i,id);
                        System.out.println("ISSUED...");
                        }
                        }
                        else if(no==2)
                        {
                            System.out.println("Enter the book id:");
                        String id;
                        id=sc.next();
                        if(c.equals(id)==false){
                        l.put(i,id);
                        System.out.println("Enter the book id:");
                        String id1;
                        id1=sc.next();
                        if(c.equals(id1)==false){
                        l1.put(i,id1);
                        System.out.println("ISSUED...");
                        }
                        }
                        }
                        else if(no==3){
                            System.out.println("Enter the book id:");
                        String id;
                        id=sc.next();
                        if(c.equals(id)==false){
                        l.put(i,id);
                        System.out.println("Enter the book id:");
                        String id1;
                        id1=sc.next();
                        if(c.equals(id1)==false){
                        l1.put(i,id1);
                        System.out.println("Enter the book id:");
                        String id2;
                        id2=sc.next();
                        if(c.equals(id2)==false){
                        l2.put(i,id2);
                        System.out.println("ISSUED...");
                        }
                        }
                    }}
                        else if(no==4){
                            System.out.println("Enter the book id:");
                        String id;
                        id=sc.next();
                        if(c.equals(id)==false){
                        l.put(i,id);
                        System.out.println("Enter the book id:");
                        String id1;
                        id1=sc.next();
                        if(c.equals(id1)==false){
                        l1.put(i,id1);
                        System.out.println("Enter the book id:");
                        String id2;
                        id2=sc.next();
                        if(c.equals(id2)==false){
                        l2.put(i,id2);
                        System.out.println("Enter the book id:");
                        String id3;
                        id3=sc.next();
                        if(c.equals(id)==false){
                        l3.put(i,id3);
                        System.out.println("ISSUED...");
                        }}}}}
                        
                        else if(no==5){
                            System.out.println("Enter the book id:");
                        String id;
                        id=sc.next();
                        if(c.equals(id)==false){
                        l.put(i,id);
                        System.out.println("Enter the book id:");
                        String id1;
                        id1=sc.next();
                        if(c.equals(id1)==false){
                        l1.put(i,id1);
                        System.out.println("Enter the book id:");
                        String id2;
                        id2=sc.next();
                        if(c.equals(id2)==false){
                        l2.put(i,id2);
                        System.out.println("Enter the book id:");
                        String id3;
                        id3=sc.next();
                        if(c.equals(id3)==false){
                        l3.put(i,id3);
                            System.out.println("Enter the book id:");
                        String id4;
                        id4=sc.next();
                        if(c.equals(id4)==false){
                        l3.put(i,id4);
                        }}}}}}
                        }}break;
                    case 2:
                    {
                        System.out.println("Enter the book id:");
                        String id;
                        id=sc.next();
                        if(c.equals(id)||c1.equals(id)||c2.equals(id)||c3.equals(id)||c4.equals(id))
                            System.out.println("Reissued");
                        else 
                            throw new myexception("ERROR!!!");
                    }break;
                    case 3:
                    {
                        System.out.println("Enter the book id:");
                        String id;
                        id=sc.next();
                        if(c.equals(id)){
                            l.remove(id);
                        }
                        else if(c1.equals(id)){
                            l1.remove(id);
                        }
                        else if(c2.equals(id)){
                            l2.remove(id);
                        }
                        else if(c3.equals(id)){
                            l3.remove(id);
                        }
                        else if(c4.equals(id)){
                            l4.remove(id);
                        }
                        else
                            throw new myexception("ERROR!!!");
                    }break;
                    case 4:
                    {
                        System.out.println("Issued Books Are:");
                        System.out.println(l.get(i));
                        System.out.println(l1.get(i));
                        System.out.println(l2.get(i));
                        System.out.println(l3.get(i));
                        System.out.println(l4.get(i));
                    }break;
                    default:
                        throw new myexception("ERROR!!!");
                }
            }}
            catch(myexception e){
                    System.out.println(e.getMessage());
                    }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }}break;
            case 4:
                break;
            default:
                System.out.println("Enter the correct option!!!");
                break;
        }
        }}
    
    public static Object getKeyFromValue(Map hm, Object value) {
    for (Object o : hm.keySet()) {
      if (hm.get(o).equals(value)) {
        return o;
      }
    }
    return null;
  }
    }