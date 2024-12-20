package co.pragra.learning.first_spring_proj;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Data
//@Setter
//@NoArgsConstructor
public class MyHibernate {

    private String databaseName;
    private String jdbcUrl;

    public void postInit() {
        System.out.println("Establishing database connection with url: " + jdbcUrl);
    }
    public void preDestroy() {
        System.out.println("releasing the database connection for: " + databaseName);
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    @Override
    public String toString() {
        return "MyHibernate{" +
                "databaseName='" + databaseName + '\'' +
                ", jdbcUrl='" + jdbcUrl + '\'' +
                '}';
    }
}
