public class Groups {
    private String groups;

    public Groups(String groups) {
        this.groups = groups;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Groups{" +
                "groups='" + groups + '\'' +
                '}';
    }
}
