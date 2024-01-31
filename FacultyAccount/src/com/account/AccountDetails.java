package com.account;
import com.faculty.FacultyDetails;

public class AccountDetails {
    private long accountNumber;
    private boolean accountActive;
    public String accountHolderName;
    FacultyDetails  fdobj = new FacultyDetails();
    public AccountDetails()
    {

        fdobj.facultyName="abc";
    }



}
