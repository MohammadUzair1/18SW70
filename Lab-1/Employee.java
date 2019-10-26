class Employee{
        static int salary;
        int hours; //declaration of instance variables  to get the value of final salary.
        public void getInfo(int salary, int hours){
        this.salary=salary;
        this.hours=hours;

    }//end of method getInfo.
    public int addSal(){
        if(salary<500){
            salary = salary+10; //adding 10$ to salary if the condition is true.
        }//end of if condition
        return salary;
    }//end of method addSal.
    public int addWork()
    {
        if(hours>6){
            salary = salary+5; // adding 5$ if the condition is true.
        }//end of if condition.
        return salary;
    }//end of method addWork.
    public static void main(String[] args) {
        Employee e = new Employee();
        e.getInfo(1000, 7);
        e.addSal();//returning value of salary according to condition given.
        e.addWork();//returning value of salary according to condition given.
        System.out.println("Final Salary: "+salary);
    }//end of main method.
}//end of class 