package customermanagement.com;

public class CustomerPolicy
{
        String policynumber;
        String type;
        long coverage;

        public CustomerPolicy(String policynumber,String type,long coverage)
        {
            this.policynumber=policynumber;
            this.type=type;
            this.coverage=coverage;
        }

        public String getPolicynumber() {
            return policynumber;
        }

        public void setPolicynumber(String policynumber) {
            this.policynumber = policynumber;
        }


        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public long getCoverage() {
            return coverage;
        }

        public void setCoverage(long coverage) {
            this.coverage = coverage;
        }

        @Override
        public String toString() {
            return "Policy Number:"+policynumber+"\nType:"+type+"\nCoverage"+coverage;
        }

}
