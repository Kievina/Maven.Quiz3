package rocks.zipcode.io.quiz3.collections;

import java.util.*;

/**
 * @author leon on 10/12/2018.
 */
public class Student {
    private List<Lab> labs;

    public Student() {
        this(null);
    }

    public Student(List<Lab> labs) {
        this.labs = new ArrayList<>();
    }

    public Lab getLab(String labName) {
        Lab lab = null;
        for (int i = 0; i < labs.size(); i++) {
            if (labs.get(i).getName().equals(labName)) {
                lab = labs.get(i);
                break;
            }
        }
        return lab;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        for (int i = 0; i < labs.size(); i++) {
            if (labs.get(i).equals(getLab(labName)))
                labs.get(i).setStatus(labStatus);
        }
    }

    public void forkLab(Lab lab) {
        labs.add(lab);

    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).getStatus();
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < labs.size(); i++) {
            result = result + labs.get(i).getName() + " > " + labs.get(i).getStatus() + '\n';
        }
        return result;
    }
}
