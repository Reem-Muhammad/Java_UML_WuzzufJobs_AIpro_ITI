public class JobDetails {
    String Title;
    String Company;
    String Location;
    String Type;
    String Level;
    String YearsExp;
    String Country;
    String Skills;

    public JobDetails(String Title,String Company,String Location,String Type,String Level,String YearsExp,String Country,String Skills){
        this.Title=Title;
        this.Company=Company;
        this.Location=Location;
        this.Type= Type;
        this.Level=Level;
        this.YearsExp= YearsExp;
        this.Country= Country;
        this.Skills= Skills;
    }

    public void print(){
        System.out.println("Title: "+this.Title+"\tCompany: "+this.Company+"\tLocation: "+this.Location+"\tType: "+this.Type+"\tLevel: "+this.Level+"\tYears of exp: "+this.YearsExp+"\tCountry: "+this.Country+"\tSkills: "+this.Skills);
    }

}
