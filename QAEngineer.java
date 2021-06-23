package staticP;

public class QAEngineer {

    String name;
    int expYears;
    int age;
    int skillLevel;
    boolean hasJavaCert;
    static String companyName = "Duotech"; // initialize static variables when declared;
//    final static



    }

}
}
}

}

    public QAEngineer(String name, int expYears, int age, int skillLevel, boolean hasJavaCert) {
        this.name = name;
        this.expYears = expYears;
        this.age = age;
        this.skillLevel = skillLevel;
        this.hasJavaCert = hasJavaCert;


    }



    public void increaseLevel(){
        skillLevel++;
    }

    public void getCertified(){
        hasJavaCert = true;
    }


}
