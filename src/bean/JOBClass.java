package bean;

import java.util.HashMap;
import java.util.Objects;

public class JOBClass {

    private String jobname;
    private String description;
    private String date;
    private String env_var;
    private HashMap<String,String> activity_number;
    private HashMap<String,String> activity_comment;

    public JOBClass() {
    }

    public JOBClass(String jobname, String description, String date, String env_var) {
        this.jobname = jobname;
        this.description = description;
        this.date = date;
        this.env_var = env_var;
    }

    public JOBClass(String jobname, String description, String date, String env_var, HashMap<String, String> activity_number, HashMap<String, String> activity_comment) {
        this.jobname = jobname;
        this.description = description;
        this.date = date;
        this.env_var = env_var;
        this.activity_number = activity_number;
        this.activity_comment = activity_comment;
    }

    public String getJobname() {
        return jobname;
    }

    public void setJobname(String jobname) {
        this.jobname = jobname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEnv_var() {
        return env_var;
    }

    public void setEnv_var(String env_var) {
        this.env_var = env_var;
    }

    public HashMap<String, String> getActivity_number() {
        return activity_number;
    }

    public void setActivity_number(HashMap<String, String> activity_number) {
        this.activity_number = activity_number;
    }

    public HashMap<String, String> getActivity_comment() {
        return activity_comment;
    }

    public void setActivity_comment(HashMap<String, String> activity_comment) {
        this.activity_comment = activity_comment;
    }

    @Override
    public String toString() {
        return "JOBClass{" +
                "jobname='" + jobname + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                ", env_var='" + env_var + '\'' +
                ", activity_number=" + activity_number +
                ", activity_comment=" + activity_comment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JOBClass jobClass = (JOBClass) o;
        return Objects.equals(getJobname(), jobClass.getJobname()) &&
                Objects.equals(getDescription(), jobClass.getDescription()) &&
                Objects.equals(getDate(), jobClass.getDate()) &&
                Objects.equals(getEnv_var(), jobClass.getEnv_var()) &&
                Objects.equals(getActivity_number(), jobClass.getActivity_number()) &&
                Objects.equals(getActivity_comment(), jobClass.getActivity_comment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getJobname(), getDescription(), getDate(), getEnv_var(), getActivity_number(), getActivity_comment());
    }
}
