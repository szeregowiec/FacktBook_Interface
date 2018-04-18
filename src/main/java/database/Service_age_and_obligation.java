package database;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
    @Table(name = "Service_age_and_obligation")
    public  class Service_age_and_obligation{
        @Id
        @GeneratedValue(generator = "incrementator")
        @GenericGenerator(name="incrementator", strategy ="increment")
        private int id;



        private int years_of_age;
        @Column(length = 5000)
        private String note;
    @Column(length = 5000)
        private String date;

        public int getYears_of_age() {
            return years_of_age;
        }

        public String getNote() {
            return note;
        }

        public String getDate() {
            return date;
        }

        public void setYears_of_age(int years_of_age) {
            this.years_of_age = years_of_age;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public void setDate(String date) {
            this.date = date;
        }
        public int getName() {
            return id;
        }

        public void setName(int id) {
            this.id = id;
        }
    }



