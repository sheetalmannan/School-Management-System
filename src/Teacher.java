public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int i, String n, int sal){
        id=i;
        name=n;
        salary=sal;
        salaryEarned=0;
    }

    /**
     *
     * @return the id of the teacher.

    public int getId(){
        return id;
    }
*/
    /**
     *
     * @return name of the teacher.

    public String getName(){
        return name;
    }


    /**
     *
     * @return the salary of the teacher.

    public int getSalary(){
        return  salary;
    }

    /**
     * set the salary.
     * @param salary

    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     * Adds  to salaryEarned.
     * Removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }
}