package package_09; 


public class LinkedListClass 
{ 
   //head of the list
   Student head;

   //method used to insert a new node 
   public LinkedListClass insert(LinkedListClass list, int id, String name) 
      { 
         //create the new node
	     //use the name and id inserted
         Student new_student = new Student(id, name); 
         
         //set the next Student to null
         new_student.next = null;
          
         //check if the list is empty
         //if so set the head as the newest student addition
         if (head == null)
         {
             head = new_student;
         } 
         
         //otherwise go through until the last node and add the newest student at the end
         else 
         {
        	 //track the current student
        	 Student current = head;

        	 //until the next node is null, continue traversing through the list
        	 while (current.next != null)
        	 {
                 current = current.next;
        	 }       
       
             //insert the newest student at the last node 
        	 current.next = new_student; 
         }
         
         //return the list
         return list;
      } 


   //method to print the list
   public void printList(LinkedListClass list) 
      { 
         //track the current node/student
       	 Student current = head;
       	 
       	 //print the linkedList title
       	 System.out.println("LinkedList:");
       	 
         //go through each node in the list 
       	 //print the current name and id 
         while (current != null) 
         {
        	 System.out.format("%s %d\n", current.name, current.id);
        	 current = current.next;
         }
      } 




}