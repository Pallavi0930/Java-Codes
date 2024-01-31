class Developer extends Employee {
    private String project;
    private int projectCode;
    private int projectDurationInMonths;
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(int projectCode) {
        this.projectCode = projectCode;
    }

    public int getProjectDurationInMonths() {
        return projectDurationInMonths;
    }

    public void setProjectDurationInMonths(int projectDurationInMonths) {
        this.projectDurationInMonths = projectDurationInMonths;
    }


}
