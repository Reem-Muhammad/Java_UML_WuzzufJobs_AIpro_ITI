import joinery.DataFrame;

import java.util.List;

public class TestWuzzufJobs {
    public void test(){
        IO ioObj = new IO();
        List<JobDetails> jobDetailsList = ioObj.ReadCSVFile("Wuzzuf_Jobs.csv");

        JobsDataService servicesObj = new JobsDataService();

        //printing the frequency of each job title
        System.out.println("~~~~~~~~~~~~~~~~~ Frequency of each job title:~~~~~~~~~~~~~~~~~\n");
        servicesObj.FilterJobsByTitle(jobDetailsList);

        //printing the frequency of jobs in each country
        System.out.println("\n\n\n~~~~~~~~~~~~~~~~~ Frequency of jobs in each country:~~~~~~~~~~~~~~~~~\n");
        servicesObj.FilterJobsByCountry(jobDetailsList);

        //printing the frequency of jobs in each level
        System.out.println("\n\n\n~~~~~~~~~~~~~~~~~ Frequency of jobs in each level:~~~~~~~~~~~~~~~~~\n");
        servicesObj.FilterJobsByLevel(jobDetailsList);

        //printing the frequency of jobs for years of experience
        System.out.println("\n\n\n~~~~~~~~~~~~~~~~~ Frequency of jobs for years of experience:~~~~~~~~~~~~~~~~~\n");
        servicesObj.FilterJobsByYearsExp(jobDetailsList);
    }
}
