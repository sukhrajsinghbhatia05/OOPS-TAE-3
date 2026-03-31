class HospitalStaff 
{
    void work() { System.out.println("Staff is working."); }
}

class Doctor extends HospitalStaff 
{
    void work() { System.out.println("Doctor is treating patients."); }
}

class Nurse extends HospitalStaff 
{
    void work() { System.out.println("Nurse is assisting."); }
}
