package backofficefc.reports;

import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Configuration;
import java.io.File;
import java.util.List;

public class GenerarReporte {
    public static void main(String[] args) {
        String jsonFile = "target/cucumber-report/cucumber.json";
        File reportOutputDir = new File("target/cucumber-html-report");

        Configuration config = new Configuration(reportOutputDir, "Reporte BackofficeFC");
        ReportBuilder reportBuilder = new ReportBuilder(List.of(jsonFile), config);
        reportBuilder.generateReports();
    }
}
