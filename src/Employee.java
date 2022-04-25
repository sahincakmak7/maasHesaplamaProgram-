public class Employee {
    String name;
    int salary;
    double workHours;
    int hireYear;
    double tax;
    double bonus;
    double increase;
    double totalSalary;
    double bonusPrice = 0;


    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.totalSalary = this.salary;
        this.tax = 0;
        this.bonus = 0;
        this.increase = 0;


    }

    void tax() {
        if (this.totalSalary > 1000.0) {

            this.tax = this.totalSalary * 0.03;

            this.totalSalary = (this.totalSalary - this.tax);

            System.out.println("Vergi : " + this.tax);

        } else {
            this.tax = 0;

        }

    }

    void bonus() {

        if (workHours > 40) {

            this.bonus = this.workHours - 40;

            this.bonus *= 30;

            this.bonusPrice = bonus;

            System.out.println("Bonus : " + this.bonusPrice);

        } else {

            this.bonus = bonus;

            System.out.println("Bonus : " + this.bonus);

        }

    }

    void increaseSalary() {
        this.totalSalary = this.salary;
        int time = 2022 - hireYear;

        if (time < 10) {

            this.totalSalary *= 0.05;

            this.increase += this.totalSalary;

            System.out.println("Maaş artışı : " + this.increase);

        }

        if (time > 9 && time < 19) {

            this.totalSalary *= 0.10;

            this.increase += this.totalSalary;

            System.out.println("Maaş artışı : " + this.increase);

        }

        if (time > 19) {

            this.totalSalary *= 0.15;

            this.increase += this.totalSalary;

            System.out.println("Maaş artışı : " + this.increase);

        }
    }

    void employeeInfo() {

        System.out.println("--------------------------------------");

        System.out.println("Adı : " + this.name);

        System.out.println("Maaşı : " + this.salary);

        System.out.println("Çalışma saati : " + this.workHours);

        System.out.println("Başlangıç yılı  : " + this.hireYear);

        this.tax();

        this.bonus();

        this.increaseSalary();

        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (this.salary - this.tax + this.bonus));

        System.out.println("Toplam Maaş : " + (this.totalSalary + this.salary));

    }
}

