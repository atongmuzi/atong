package CDtest.data;

public enum testDTOData {

    cdDTO("{\"title\":\"abc\",\"artist\":\"the battle\"}");

    private String value;

    testDTOData(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
