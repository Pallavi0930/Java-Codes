public class FullStackDeveloper extends Developer{
    private String roleInProject;

    public String getRoleInProject() {
        return roleInProject;
    }

    public void setRoleInProject(String roleInProject) {
        this.roleInProject = roleInProject;
    }
    @Override
    public String toString() {
        return "Developer{" +
                "empCode=" + getEmpCode() +
                ", empName='" + getEmpName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", dept='" + getDept() + '\'' +
                ", role='" + getRoleInProject() + '\'' +
                "project='" + getProject() + '\'' +
                ", projectCode=" + getProjectCode() +
                ", projectDurationInMonths=" + getProjectDurationInMonths() +
                '}';
    }
}
