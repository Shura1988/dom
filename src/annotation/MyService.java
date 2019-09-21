package annotation;

import java.util.Objects;

@Version(vertion = "9.0", name = "MyFirst")
    public class MyService {
        private String vertion;
        private String name;

         MyService() {
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyService)) return false;
        MyService myService = (MyService) o;
        return vertion.equals(myService.vertion) &&
                name.equals(myService.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(vertion, name);
    }

    private  void thisClassInfo(){
        System.out.println("open private ( version : " + getVertion() + "  name  : " + getName() + ")");
    }

    public String getVertion() {
            return vertion;
        }

        public void setVertion(String vertion) {
            this.vertion = vertion;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }


