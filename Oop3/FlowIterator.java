import java.util.Iterator;
import java.util.List;

public class FlowIterator implements Iterator<Groups> {
private List<Groups> studyGroupsList;
private int count;
    public FlowIterator(Flow studyGroups){
        this.studyGroupsList = studyGroups.getStudyGroups();
    }
    @Override
    public boolean hasNext() {
        return count < studyGroupsList.size();
    }

    @Override
    public Groups next() {
        if(hasNext()){
            return studyGroupsList.get(count++);
        }
        return null;
    }
}
