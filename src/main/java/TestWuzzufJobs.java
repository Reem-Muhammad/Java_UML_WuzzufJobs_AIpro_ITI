import joinery.DataFrame;

import java.util.List;

public class TestWuzzufJobs {
    public void test(){
        IO ioObj = new IO();
        List<JobDetails> jobDetailsList = ioObj.ReadCSVFile("E:\\Odious hole\\AI\\ITI\\5_Java\\Day4\\Assignment\\src\\main\\java\\Wuzzuf_Jobs.csv");
        //System.out.println(jobDetailsList.size());

        JobsDataService servicesObj = new JobsDataService();
        //servicesObj.FilterJobsByTitle(jobDetailsList);


        servicesObj.FilterJobsByCountry(jobDetailsList);
    }
}
