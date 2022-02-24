public class Province {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    private String capital;
    private long population;
    private final long DEFAULT_POPULATION = 4648055;
    private final String DEFAULT_PROVINCE = "British Columbia";
    private final String DEFAULT_CAPITAL = "Victoria";




    private boolean isValidProvince(String city){
        String[] cities = {"Edmonton","Victoria", "Winnipeg", "Fredericton", "St. John's", "Halifax", "Toronto", "Charlottetown", "Quebec City", "Regina"};
        for(int i = 0; i < cities.length; i++) {
            if (cities[i].equals(city))
                return true;
        }
        return false;
    }
    private boolean isValidPopulation(int population){
        if (population > 30000 && population < 15000000){
            return true;
        }
        return false;
    }
    private boolean isValidCapitalCity(String capital){
        String[] cities = {"Alberta", "British Columbia", "Manitoba", "New Brunswick", "Newfoundland and Labrador", "Northwest Territories", "Nova Scotia", "Nunavut", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan", "Yukon"};
        for(int i = 0; i < cities.length; i++) {
            if (cities[i].equals(capital))
                return true;
        }
        return false;
    }
    public String getDetails(){
        String string = String.format("The capital of: %s (population. %d) is %s", getName(),getPopulation(), getCapital());
        return string;
    }

    public Province(String province, String capital, long population) {
        if (isValidPopulation((int) population) && (isValidProvince(province))
                && (isValidCapitalCity(capital))) {

            this.name = province;
            this.capital = capital;
            this.population = population;

        } else {

            this.population = DEFAULT_POPULATION; // 4,648,055
            this.name = DEFAULT_PROVINCE; // “British Columbia”
            this.capital = DEFAULT_CAPITAL; // “Victoria”
        }
    }

}
