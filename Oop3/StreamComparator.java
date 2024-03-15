import java.util.Comparator;

public class StreamComparator implements Comparator<Flow> {

    public Flow StreamComparator(Flow o1, Flow o2) {
        int a = o1.getStudyGroups().size();
        int c = o2.getStudyGroups().size();
        if (a < c) {
            return o2;
        } else return o1;
    }

    @Override
    public int compare(Flow o1, Flow o2) {
        return 0;
    }

}
