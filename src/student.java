public class student {

     int id;
     String name;
     int grade;
    int feesPaid;
    int feesTotal;

    /**
     * To create a new student by initializing.
     * Fees for every student is $30,000.
     * Fees paid initially is 0.
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */
    public student(int id, String name,int grade){
        feesPaid=0;
        feesTotal=200000;
        id=id;
        name=name;
        grade=grade;
    }

    //Not going to alter student's name, student's id.

    /**
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the fees paid.
     * The school is going receive the funds.
     *
     * @param fees the fees that the student pays.
     */
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }


    /**
     *
     * @return name of the student.
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student.
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student.
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return the total fees of the student.
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees.
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

}