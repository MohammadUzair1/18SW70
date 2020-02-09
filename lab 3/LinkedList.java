class LinkedList{
    Node start;
    private int size;

    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
        Node(int data,Node next){
            this.data=data;
            this.next=next;
        }
    }

    public Node insert(int value){
        //Pre-condition: List is sorted
        //Post-condition: value is inserted in the list
        ++size;
        if(start==null || start.data>value){
            start = new Node(value,start);
            return start;
        }
        Node p=start;
        while(p.next!=null){
            if(p.next.data>value)
                break;
            p=p.next;
        }
        p.next=new Node(value,p.next);
        return start;
    }

    public Node delete(Node start,int key){
        if(size>0){
            if(start==null || start.data>key){ 
                System.out.println("Element not present in list");
            }
            else if(start.data==key){
                start=start.next;
                --size;
            }
            Node p=start;
            while(p.next!=null){
                if(p.next.data>key){ 
                    System.out.println("Element not present in list");
                    break;
                }
                else if(p.next.data==key){
                    p.next=p.next.next;
                    --size;
                    break;
                }
                p=p.next;
            }
            return start;
        }
        else{
            System.out.println("LinkedList is Empty");
            return null;
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public int sum(){
        int sum=0;
        Node n = start;
        while(n.next!=null){
            sum+=n.data;
            n=n.next;
        }
        sum+=n.data;
        return sum;
    }

    public int get(int index){ 
        if(index<size){
            int value=0;
            int i=0;
            Node n=start;
            while(n.next!=null){
                if(i==index){
                    value=n.data;
                    break;
                }
                n=n.next;
                i++;
            }
            if(i==index)
                return n.data;   //If index is of last value
            return value;
        }
        else{
            System.out.println("Invalid Index");
            return 0;
        }   
    }

    public int getIndex(int value){
        int i=0;
        Node n=start;
        while(n.next!=null){
            if(n.data==value)
                return i;
            n=n.next;
            i++;
        }
        if(n.data==value)
            return i;
        return -1;
    }
    public Node set(Node start,int index,int value){
        if(index<size){
            if(index==0){
                start = new Node(value,start.next);
                return start;
            }
            Node node=null;
            int i=1;
            Node n=start;
            while(n.next!=null){
                if(i==index){
                    node = new Node(value,n.next.next);
                    n.next = node;
                    break;
                }
                n=n.next;
                i++;
            }
            if(i==index){
                //If index is of last value
                node = new Node(value,null);
                n.next = node;
                return start;                
            }
            return start;
        }
        else{
            System.out.println("Invalid Index");
            return start;
        }
    }


    public String toString(){
        String str="";
        Node n = start;
        while(n.next!=null){
            str+=n.data+",";
            n=n.next;
        }
        str+=n.data;
        return "["+str+"]";
    }
}