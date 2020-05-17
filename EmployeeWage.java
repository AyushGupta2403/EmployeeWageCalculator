import java.util.LinkedList;

interface IEmployeeWage{
    void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth);
    void totalEmpWage();
}

public class EmployeeWage implements IEmployeeWage{
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;

    private int numOfCompanies = 0;
    private LinkedList<CompanyObj> listOfComp;

    public EmployeeWage(){
        listOfComp = new LinkedList<>();
    }

    public void addCompanyEmpWage(String company, int empRatePerHr, int numOfWorkingDays, int maxHoursPerMonth){
        CompanyObj newWage = new CompanyObj(company, empRatePerHr, numOfWorkingDays, maxHoursPerMonth);
        listOfComp.add(newWage);
    }

    public void totalEmpWage(){
        for(int i = 0; i < listOfComp.size(); i++){
            CompanyObj tempComp = listOfComp.get(i);
            tempComp.setTotalEmpWage(this.totalEmpWage(tempComp));
            System.out.println(tempComp);
        }
    }

    public int totalEmpWage(CompanyObj companyObj) {
        //VARIABLES
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        //COMPUTATION
        while (totalEmpHrs <= companyObj.maxHoursPerMonth && totalWorkingDays < companyObj.numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Days: " + totalWorkingDays + " Emp Hours: " + empHrs);
        }
        return totalEmpHrs * companyObj.empRatePerHr;
        //System.out.println("Total Emp Wage for company company is " + totalEmpWage);
    }

    public static void main(String[] args){
        EmployeeWage arrObject = new EmployeeWage();
        arrObject.addCompanyEmpWage("DMart", 20, 2, 10);
        arrObject.addCompanyEmpWage("Reliance", 50, 5, 15);
        arrObject.totalEmpWage();
    }
}
