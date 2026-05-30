package martins.dev.javaoneforall.javacore.Kenum.domain;

public enum CustomerType {
    INDIVIDUAL(1, "Individual"), COMPANY(2, "Company"),
    START_UP(3, "Start Up");

    private int db_value;
    private String reportValue;

    CustomerType(int dbValue, String reportValue) {
        this.db_value = dbValue;
        this.reportValue = reportValue;
    }

    public static CustomerType getByReportValue(String reportValue) {
        for (CustomerType customerType : values()) {
            if (customerType.reportValue.equalsIgnoreCase(reportValue)) return customerType;
        }
        return null;
    }

    public int getDbValue() {
        return db_value;
    }

    public String getReportValue() {
        return reportValue;
    }
}
