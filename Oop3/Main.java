import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Groups groups1 = new Groups("18");
        Groups groups2 = new Groups("23");
        Groups groups3 = new Groups("31");
        Flow flow = new Flow(new ArrayList<>());
        Flow flow1 = new Flow(new ArrayList<>());
        flow.addFlow(groups2);
        flow.addFlow(groups1);
        flow.addFlow(groups3);

        flow1.addFlow(groups2);
        flow1.addFlow(groups1);

//        System.out.println(flow);
//        for (Groups student : flow) {
//            System.out.println(student);
//        }
//        System.out.println();
//
//        for (Groups student : flow1) {
//            System.out.println(student);
//        }
        System.out.println();
        StreamComparator comp = new StreamComparator();
       Flow c = comp.StreamComparator(flow, flow1);

        System.out.println(c);
    }

    }

