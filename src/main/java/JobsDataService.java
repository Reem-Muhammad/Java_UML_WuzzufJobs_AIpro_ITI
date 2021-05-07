import joinery.DataFrame;
import java.util.*;

public class JobsDataService {
    public void FilterJobsByTitle(List<JobDetails> jobs){
        //Converting the list of objects to dataframe
        DataFrame df = new DataFrame("Title","count");
        for(JobDetails job: jobs){
            df.append(Arrays.asList(job.Title, job.Title));
        }

        //grouping by job title and counting the frequency of each job
        DataFrame d2 = df.groupBy("Title").count(); //grouping by job title and counting the frequency of each job

        //Printing jobs with their frequencies
        Iterator titles_iter = d2.col(0).iterator();
        Iterator freq_iter = d2.col(1).iterator();
        while(titles_iter.hasNext()){
            System.out.println(titles_iter.next()+" ==>   "+freq_iter.next());
        }

    }



    public void FilterJobsByCountry(List <JobDetails> jobs){
        //Converting the list of objects to dataframe
        DataFrame df = new DataFrame("Country","Count");
        for(JobDetails job: jobs){
            df.append(Arrays.asList(job.Country, job.Title));
        }
        //grouping by country and counting the frequency of jobs in each country
        DataFrame d2 = df.groupBy("Country").count();

        //Printing countries with their job frequencies
        Iterator country_iter = d2.col(0).iterator();
        Iterator freq_iter = d2.col(1).iterator();

        while(country_iter.hasNext()){
            System.out.println(country_iter.next()+" ==>   "+freq_iter.next());
        }

    }



    public void FilterJobsByLevel(List <JobDetails> jobs){
        //Converting the list of objects to dataframe
        DataFrame df = new DataFrame("Level","Title");
        for(JobDetails job: jobs){
            df.append(Arrays.asList(job.Level, job.Title));
        }
        //grouping by level and counting the frequency of jobs in each level
        DataFrame d2 = df.groupBy("Level").count();

        //Printing levels with their job frequencies
        Iterator level_iter = d2.col(0).iterator();
        Iterator freq_iter = d2.col(1).iterator();

        while(level_iter.hasNext()){
            System.out.println(level_iter.next()+" ==>   "+freq_iter.next());
        }

    }


    public void FilterJobsByYearsExp(List <JobDetails> jobs){
        //Converting the list of objects to dataframe
        DataFrame df = new DataFrame("YearsExp","Title");
        for(JobDetails job: jobs){
            //df.append(Arrays.asList(job.Title, job.Company, job.Location, job.Type, job.Level, job.YearsExp,job.Country, job.Skills));
            df.append(Arrays.asList(job.YearsExp, job.Title));
        }
        //grouping by years of experience and counting the frequency of jobs
        DataFrame d2 = df.groupBy("YearsExp").count().sortBy("-Title"); //grouping by job title and counting the frequency of each job

        //Printing years of experience with their job frequencies
        Iterator yearsExp_iter = d2.col(0).iterator();
        Iterator freq_iter = d2.col(1).iterator();

        while(yearsExp_iter.hasNext()){
            System.out.println(yearsExp_iter.next()+" ==>   "+freq_iter.next());
        }

    }

}
