/*write a program to accept name, Email, Phone Number, Percentage from the user and store the data using arraylist.
Accept name from the user and remove all the data from the list and display the output. 
and also perform the searching operation with the help of the name.
*/
package Collection;


public class student_2_lab
{
        private String name;
        private int regNumber;
        public student_2_lab(String n, int reg)
        {
                this.name = n;
                this.regNumber = reg;
        }
        public String getName()
        {
                return name;
        }
        public void setName(String name)
        {
                this.name = name;
        }
        public int getReg()
        {
                return regNumber;
        }
        public void setReg(int regNumber)
        {
                this.regNumber = regNumber;
        }
        public String toString()
        {
                return "Student Name: "+this.name+", Reg Number: "+this.regNumber;  
        }
}
