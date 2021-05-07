import joinery.DataFrame;

import java.util.*;

public class JobsDataService {
    public void FilterJobsByTitle(List<JobDetails> jobs){

        //DataFrame df = new DataFrame("Title", "Company", "Location", "Type", "Level", "YearsExp", "Country", "Skills");
        DataFrame df = new DataFrame("Title","count");
        for(JobDetails job: jobs){
            //df.append(Arrays.asList(job.Title, job.Company, job.Location, job.Type, job.Level, job.YearsExp,job.Country, job.Skills));
            df.append(Arrays.asList(job.Title, job.Title));
        }

        DataFrame d2 = df.groupBy("Title").count(); //grouping by job title and counting the frequency of each job

        //Printing jobs with their frequancies
        Iterator titles_iter = d2.col(0).iterator();
        Iterator freq_iter = d2.col(1).iterator();
        while(titles_iter.hasNext()){
            //System.out.println(titles_iter.next()+" ==>   "+freq_iter.next());
        }

    }



    public void FilterJobsByCountry(List <JobDetails> jobs){

        //DataFrame df = new DataFrame("Title", "Company", "Location", "Type", "Level", "YearsExp", "Country", "Skills");
        DataFrame df = new DataFrame("Country","Count");
        for(JobDetails job: jobs){
            //df.append(Arrays.asList(job.Title, job.Company, job.Location, job.Type, job.Level, job.YearsExp,job.Country, job.Skills));
            df.append(Arrays.asList(job.Country, job.Title));
        }

        DataFrame d2 = df.groupBy("Country").count(); //grouping by job title and counting the frequency of each job
        //System.out.println(df.map());

        //Printing jobs with their frequancies
        Iterator country_iter = d2.col(0).iterator();
        Iterator freq_iter = d2.col(1).iterator();

        while(country_iter.hasNext()){
            System.out.println(country_iter.next()+" ==>   "+freq_iter.next());
        }

    }



    public void FilterJobsByLevel(List <JobDetails> jobs){
        DataFrame df = new DataFrame("Level","Title");
        for(JobDetails job: jobs){
            //df.append(Arrays.asList(job.Title, job.Company, job.Location, job.Type, job.Level, job.YearsExp,job.Country, job.Skills));
            df.append(Arrays.asList(job.Level, job.Title));
        }

        DataFrame d2 = df.groupBy("Level").count(); //grouping by job title and counting the frequency of each job
        //System.out.println(df.map());

        //Printing jobs with their frequancies
        Iterator level_iter = d2.col(0).iterator();
        Iterator freq_iter = d2.col(1).iterator();

        while(level_iter.hasNext()){
            System.out.println(level_iter.next()+" ==>   "+freq_iter.next());
        }

    }


    public void FilterJobsByYearsExp(List <JobDetails> jobs){
        DataFrame df = new DataFrame("YearsExp","Title");
        for(JobDetails job: jobs){
            //df.append(Arrays.asList(job.Title, job.Company, job.Location, job.Type, job.Level, job.YearsExp,job.Country, job.Skills));
            df.append(Arrays.asList(job.YearsExp, job.Title));
        }

        DataFrame d2 = df.groupBy("YearsExp").count().sortBy("-Title"); //grouping by job title and counting the frequency of each job
        //System.out.println(df.map());

        //Printing jobs with their frequancies
        Iterator yearsExp_iter = d2.col(0).iterator();
        Iterator freq_iter = d2.col(1).iterator();

        while(yearsExp_iter.hasNext()){
            System.out.println(yearsExp_iter.next()+" ==>   "+freq_iter.next());
        }

    }

}
