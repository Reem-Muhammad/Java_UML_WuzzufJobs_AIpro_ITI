import joinery.DataFrame;
import tech.tablesaw.api.Table;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IO {

    public List<JobDetails> ReadCSVFile(String FileName){
        DataFrame df = new DataFrame();
        try{
            df = DataFrame.readCsv(FileName);
            System.out.println(df.map().get(4248));
            //System.out.println(df.col(0).stream().distinct().count());
        }
        catch(Exception e){
            System.out.println(e);
        }
        List<JobDetails> jobDetailsList = new ArrayList<JobDetails>();
        ListIterator df_iter = df.iterrows();
        while(df_iter.hasNext()){
            String  temp = df_iter.next().toString();
            String[] row = temp.substring(1, temp.length()-1).split(",");
            //create an object of datatype JobDetails containing all details for a certain job
            //Splitting row[0] on "-" is to get the job title in general (some entries has the job title as "jobTitle - country")
            JobDetails tempJobDetail = new JobDetails(row[0].split(" -")[0],row[1],row[2],row[3],row[4],row[5],row[6],row[7]);
            //System.out.println(tempJobDetail.Title + " "+ tempJobDetail.Company);
            //tempJobDetail.print();
            //append to a list of jobDetail objects
            jobDetailsList.add(tempJobDetail);
        }
        return jobDetailsList;
    }
}
