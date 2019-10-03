package test.blinov;

public class Abonent {
    //поля и конструктор
    private Long id;
    private String name;
    private String tariffPlan;
    private PhoneNumber phonNumber;//ссылка на внутренний класс

    public Abonent(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    private class PhoneNumber {
        private int countryCod;
        private int netCod;
        private int number;

        public void setCountryCod(int countryCod) {
            //проверка на допустимые значения кода страны
            this.countryCod = countryCod;
        }

        public void setNetCod(int netCod) {
            //проверка на допустимые значения кода сети
            this.netCod = netCod;
        }

        public int generateNumber() {
            int temp = new java.util.Random().nextInt(10_000_000);
            //проверка значения temp на совпадения в базе данных
            number = temp;
            return number;
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTariffPlan() {
        return tariffPlan;
    }

    public void setTariffPlan(String tariffPlan) {
        this.tariffPlan = tariffPlan;
    }

    public String getPhoneNumber() {
        if (phonNumber != null) {
            return (" + " + phonNumber.countryCod + " - " + phonNumber.netCod + " - " + phonNumber.number);
        } else {
            return ("phone number is empty!");
        }
    }

    // соответствует шаблону Facade
    public void obtainPhoneNumber(int countryCode, int netCode) {
        phonNumber = new PhoneNumber();
        phonNumber.setCountryCod(countryCode);
        phonNumber.setNetCod(netCode);
        phonNumber.generateNumber();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(100);
        s.append("Abonent '" + name + "':\n");
        s.append("     ID  -  " + id + "\n");
        s.append( " Tariff" + tariffPlan + "\n");
        s.append(" Phone Number - " + getPhoneNumber() + "\n");
        return s.toString();
    }

}




