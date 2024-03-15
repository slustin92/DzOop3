import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flow implements Iterable<Groups>{

    private List<Groups> studyGroups = new ArrayList<>();

    public Flow(List<Groups> studyGroups) {
        this.studyGroups = studyGroups;
    }

    public List<Groups> getStudyGroups() {
        return studyGroups;
    }

    public void setStudyGroups(List<Groups> studyGroups) {
        this.studyGroups = studyGroups;
    }
    public void addFlow(Groups groups){
        studyGroups.add(groups);
    }

    @Override
    public String toString() {
        return "Flow{" +
                "studyGroups=" + studyGroups +
                '}';
    }

    @Override
    public Iterator<Groups> iterator() {
        return new FlowIterator(this);
    }
}
